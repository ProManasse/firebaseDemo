package com.example.firebasedatabasedemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {
    TextView tName;
    TextView tPhone;
    TextView tLoc;
    TextView tCareer;

    public MyHolder(@NonNull View itemView) {
        super(itemView);
        this.tName=itemView.findViewById(R.id.viewName);
        this.tPhone=itemView.findViewById(R.id.viewId);
        this.tLoc=itemView.findViewById(R.id.viewGender);
        this.tCareer=itemView.findViewById(R.id.viewFaculty);
    }
}
