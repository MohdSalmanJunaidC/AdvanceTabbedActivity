package com.example.msj.advancetabbedactivity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

public class GalleryFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public GalleryFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static GalleryFragment newInstance() {
        GalleryFragment fragment = new GalleryFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_gallery, container, false);


        ImageView im1,im2,im3,im4,im5,im6,im7,im8;
        im1=(ImageView)view.findViewById(R.id.im1);
        im2=(ImageView)view.findViewById(R.id.im2);
        im3=(ImageView)view.findViewById(R.id.im3);
        im4=(ImageView)view.findViewById(R.id.im4);
        im5=(ImageView)view.findViewById(R.id.im5);
        im6=(ImageView)view.findViewById(R.id.im6);
        im7=(ImageView)view.findViewById(R.id.im7);
        im8=(ImageView)view.findViewById(R.id.im8);
        CropCircleTransformation transform=new CropCircleTransformation();
        Picasso.with(getContext()).load("https://static.pexels.com/photos/140221/pexels-photo-140221.jpeg").resize(300,300).transform(transform).into(im1);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/169978/pexels-photo-169978.jpeg").resize(300,300).transform(transform).into(im2);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/139968/pexels-photo-139968.jpeg").resize(300,300).into(im3);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/139975/pexels-photo-139975.jpeg").resize(300,300).into(im4);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/68147/waterfall-thac-dray-nur-buon-me-thuot-daklak-68147.jpeg").resize(300,300).transform(transform).into(im5);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/207962/pexels-photo-207962.jpeg").resize(300,300).transform(transform).into(im6);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/139751/pexels-photo-139751.jpeg").resize(300,300).into(im7);
        Picasso.with(getContext()).load("https://static.pexels.com/photos/139911/pexels-photo-139911.jpeg").resize(300,300).into(im8);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

}
