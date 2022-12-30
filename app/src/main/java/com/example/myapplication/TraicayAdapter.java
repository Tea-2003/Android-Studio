package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

 public class TraicayAdapter extends BaseAdapter {
     private Context context;
     private int layout;
     private List<TraiCay> traiCayList;

     public TraicayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
         this.context = context;
         this.layout = layout;
         this.traiCayList = traiCayList;
     }

     @Override
     public int getCount() {
         return traiCayList.size();
     }

     @Override
     public Object getItem(int i) {
         return null;
     }

     @Override
     public long getItemId(int i) {
         return 0;
     }

     @Override
     public View getView(int i, View view, ViewGroup viewGroup) {
         LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         view = inflater.inflate(layout,null);
         // ánh xạ view
         TextView txtTen = (TextView) view.findViewById(R.id.textviewTen);
         TextView txtMota = (TextView) view.findViewById(R.id.textviewMoTa);
         ImageView imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);

         // gán giá trị
         TraiCay traiCay= traiCayList.get(i);
         txtTen.setText(traiCay.getTen());
         txtMota.setText(traiCay.getMoTa());
         imgHinh.setImageResource(traiCay.getHinh());
         return view;
     }
 }