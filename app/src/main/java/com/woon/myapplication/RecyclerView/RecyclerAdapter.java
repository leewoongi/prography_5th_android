package com.woon.myapplication.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.woon.myapplication.R;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<Data> listData = new ArrayList<>();
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.onBind(listData.get(position), position);
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void addItems(Data data) {
        listData.add(data);
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView key;
        private TextView title;
        private TextView director;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            key = itemView.findViewById(R.id.key);
            title = itemView.findViewById(R.id.title);
            director = itemView.findViewById(R.id.director);
        }

        public void onBind(Data data, int position) {
            String s = "" + (position + 1);
            key.setText(s);
            title.setText(data.getTitle());
            director.setText(data.getDirector() + "/" + data.getReleaseDate());
        }
    }
}
