package com.example.applist_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterMonan extends BaseAdapter {

    private Context context;
    private int layout;
    private List<MonAn> arraylist;

    public AdapterMonan(Context context, int layout, List<MonAn> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        MonAn monAn = arraylist.get(position);
        //ánh xạ
        TextView textV1 = convertView.findViewById(R.id.name);
        TextView textV2 = convertView.findViewById(R.id.mota);
        TextView imageV = convertView.findViewById(R.id.imageHinh);

        textV1.setText(monAn.getTenmon());
        textV2.setText(monAn.getMota());
        imageV.setText(monAn.getHinh());

        return convertView;
    }
}
