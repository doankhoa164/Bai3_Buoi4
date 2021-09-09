package com.example.bai3_buoi4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public  class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.MyViewHolder> {
    private List data;
    private Context mcontext;

    public  RecyclerDataAdapter(List data, Context context) {
        this.data = data;
        this.mcontext = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mcontext = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(mcontext);
        View view = inflater.inflate(R.layout.layout1, parent, false);
        MyViewHolder View = new MyViewHolder(view);
        return View;
    }

    @Override
        public void onBindViewHolder (@NonNull MyViewHolder holder,int position){
            Data datas = (Data) data.get(position);
            holder.img1.setImageResource(datas.img1);
            holder.img2.setImageResource(datas.img2);
            holder.img3.setImageResource(datas.img3);
            holder.img4.setImageResource(datas.img4);
            holder.img5.setImageResource(datas.img5);
            holder.text.setText(datas.text);
        }


        public int getItemCount() {
            return data.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            private ImageView img1;
            private ImageView img2;
            private ImageView img3;
            private ImageView img4;
            private ImageView img5;
            private TextView text;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                img1 = itemView.findViewById(R.id.img1);
                img2 = itemView.findViewById(R.id.img2);
                img3 = itemView.findViewById(R.id.img3);
                img4 = itemView.findViewById(R.id.img4);
                img5 = itemView.findViewById(R.id.img5);
                text = itemView.findViewById(R.id.text);

            }
        }
    }



