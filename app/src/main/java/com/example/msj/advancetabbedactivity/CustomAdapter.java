package com.example.msj.advancetabbedactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by msj on 30/11/17.
 */

class CustomAdapter extends BaseAdapter
{
    Context context;
    String[] model;
    String[] color;
    String[] price;
    LayoutInflater inflter;
    int[] images;
    public CustomAdapter(Context context, String[] model, String[] color, String[] price, int[] images) {

        this.context=context;
        this.model=model;
        this.color=color;
        this.price=price;
        this.images=images;
        inflter = (LayoutInflater.from(context));

    }

    @Override
    public int getCount() {
        return model.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflter.inflate(R.layout.liststructure,null);
        TextView tv1=(TextView)view.findViewById(R.id.tv1);
        TextView tv2=(TextView)view.findViewById(R.id.tv2);
        TextView tv3=(TextView)view.findViewById(R.id.tv3);
        ImageView im=(ImageView)view.findViewById(R.id.imageView);
        tv1.setText(model[i]);
        tv2.setText(color[i]);
        tv3.setText(price[i]);
        im.setImageResource(images[i]);

        final String s=model[i];
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"You Clicked "+s,Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
