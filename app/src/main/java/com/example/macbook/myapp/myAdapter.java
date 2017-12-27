package com.example.macbook.myapp;


import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class myAdapter extends BaseAdapter {
    private String[] names;
    private String[] surnames;
    private Context context;//inchi hamara petq

    private LayoutInflater inflater;


    public myAdapter(MainActivity mainActivity, String[] names, String[] surnames) {

        context = mainActivity;
        this.names = names;
        this.surnames = surnames;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        TextView tView;
        ImageView imgView;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        Holder holder = new Holder();
        @SuppressLint({"InflateParams", "ViewHolder"})
        View row = inflater.inflate(R.layout.my_layout, null);
        holder.tView = row.findViewById(R.id.name);
        holder.tView = row.findViewById(R.id.surname);
//        holder.imgView = row.findViewById(R.id.myIcon);
        holder.tView.setText(names[position]);
        holder.tView.setText(surnames[position]);

        row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, "You Clicked "+ names[position], Toast.LENGTH_LONG).show();
            }
        });


        return row;
    }
}
