package com.example.healthfirst;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Modal> arrayList;
    //ClickListiner listiner;

    public RecyclerViewAdapter(Context context, ArrayList<Modal> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        //this.listiner=listiner;

    }





//    public TextView title;
//    public ImageView imageView;

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.items, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Modal recyclerData = arrayList.get(position);
        holder.imageView.setImageResource(recyclerData.getImage1());
        holder.title.setText(recyclerData.getTitle());




    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private ImageView imageView;
        private ImageView imv2;
        //onNoteListener onl;


        public ViewHolder(@NonNull View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title1);
            imageView = (ImageView) view
                    .findViewById(R.id.imageView2);
            //imv2=(ImageView)view.findViewById(R.id.imageView3);
            //this.onl=onl;

//            view.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Modal recyclerData=arrayList.get(getAdapterPosition());
//
//                    Intent i = new Intent(v.getContext(), MainActivity2.class);
//                    //i.putExtra("title", title.getAdapterPosition());
//                    i.putExtra("title", recyclerData.getTitle());
//                    i.putExtra("image",recyclerData.getImage1());
//                    v.getContext().startActivity(i);
//                    Toast.makeText(v.getContext(), "New Activity", Toast.LENGTH_SHORT).show();
//                }
//
//            });
            //@Override

        }

    }

}


