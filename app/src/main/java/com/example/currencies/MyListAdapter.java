package com.example.currencies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<DataFlags> list;

    public MyListAdapter(Context context, ArrayList<DataFlags> data) {
        list = data;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public DataFlags getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        ViewHolder holder;
        View convertView = v;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = inflater.inflate(R.layout.list_item, parent, false);
            holder.flag = (ImageView)convertView.findViewById(R.id.flagImage);
            holder.name = (TextView)convertView.findViewById(R.id.name);
            holder.abbreviation = (TextView)convertView.findViewById(R.id.abbreviation);
            convertView.setTag(holder);
        }

        holder = (ViewHolder)convertView.getTag();
        DataFlags dataFlags = getData(position);

        holder.flag.setImageResource(dataFlags.getFlagID());
        holder.name.setText(convertView.getResources().getString(dataFlags.getNameID()));
        holder.abbreviation.setText(convertView.getResources().getString(dataFlags.getAbbreviationID()));

        return convertView;
    }

    DataFlags getData(int position) {
        return getItem(position);
    }

    private static class ViewHolder {
        private ImageView flag;
        private TextView name;
        private TextView abbreviation;
    }
}
