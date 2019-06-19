package com.example.memberdirectory.MYAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.memberdirectory.R;

import java.util.ArrayList;

public class MyRecycler extends RecyclerView.Adapter<MyRecycler.ViewHolder> {
    private Context context;
    private ArrayList<String> arrayList;
    public MyRecycler(Context context, ArrayList<String> arrayList) {
        this.context=context;
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View listItem = layoutInflater.inflate(R.layout.recycler_cell, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.titleTv.setText(arrayList.get(i));
        viewHolder.okBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,arrayList.get(i),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView logoIv;
        Button okBtn;
        TextView titleTv;
        TextView desTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logoIv=itemView.findViewById(R.id.logo_iv);
            okBtn=itemView.findViewById(R.id.ok_btn);
            titleTv=itemView.findViewById(R.id.title_tv);
            desTv=itemView.findViewById(R.id.des_tv);
        }
    }
}
