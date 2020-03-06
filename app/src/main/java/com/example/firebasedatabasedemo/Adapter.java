package com.example.firebasedatabasedemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<MyHolder> {
    Context context;
    ArrayList<Student> model;

    public Adapter(Context context, ArrayList<Student> model) {
        this.context = context;
        this.model = model;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.tName.setText(model.get(position).getName());
        holder.tPhone.setText(model.get(position).getId());
        holder.tLoc.setText(model.get(position).getGender());
        holder.tCareer.setText(model.get(position).getFaculty());
        //          holder.tImage.setImageResource(models.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return model.size();
    }
}


