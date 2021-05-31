package com.example.healthfirst;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;


public class MyListAdapter extends BaseAdapter implements Filterable
{
    private final Activity context;
    //private final String[] progNames;
    //private final Integer[] progImages;
    //HashMap<String,Integer> programImages;
    List<FoodItems> foodItems;
    //FoodItems[] foodItems;
    List<FoodItems> full;
    //List<Integer>arr;

    public MyListAdapter(Activity context, List<FoodItems> foodItems)
    {
        //super(context,R.layout.listview_layout,foodItems);
        this.context = context;
        //this.progNames = progNames;
        //this.progImages = progImages;
        this.foodItems = foodItems;
        full = new ArrayList<>(foodItems);
    }


    @Override
    public int getCount()
    {
        return foodItems.size();
    }

    @Override
    public Object getItem(int position)
    {
        return foodItems.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        View r=convertView;
        ViewHolder viewHolder=null;
        if(r == null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_layout,null,true);
            viewHolder= new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder)r.getTag();
        }
        //viewHolder.tv2.setText(foodItems.get(position).getFoodName());
        viewHolder.ivw.setImageResource(foodItems.get(position).getFoodImageId());
        viewHolder.tv1.setText(foodItems.get(position).getFoodName());
        //viewHolder.tv2.setText(Desc[position]);
        return r;
    }
    class ViewHolder
    {
        TextView tv1;
        TextView tv2;
        ImageView ivw;
        ViewHolder(View v)
        {
            tv1=(TextView)v.findViewById(R.id.FoodItemName);
            //tv2=(TextView)v.findViewById(R.id.Description);
            ivw=(ImageView)v.findViewById(R.id.imageView);


        }

        /*@Override
        public void onClick(View v) {
            String foodname = tv1.getText().toString();
            Log.d("listt :",foodname);
            if(MainActivity2.active) {
                Intent intent = new Intent(context, MainActivity4.class);
                intent.putExtra("foodname",foodname);
            }
            else if(MainActivity3.active){
                Intent intent = new Intent(context, MainActivity5.class);
                intent.putExtra("foodname",foodname);
            }
        }*/
    }


    Filter listFilter = new Filter()
    {
        @Override
        protected FilterResults performFiltering(CharSequence constraint)
        {
            List<FoodItems> resultData=new ArrayList<>( );

            FilterResults filterResults = new FilterResults();
            if(constraint==null || constraint.length()==0)
            {
                filterResults.count = full.size();
                filterResults.values = full;
            }
            else
            {
                for(int i = 0 ; i < full.size(); i++)
                {
                    if(full.get(i).getFoodName().toLowerCase().startsWith(constraint.toString().toLowerCase()))
                    {
                        resultData.add(full.get(i));
                        //arr.add(i);
                    }
                }
                filterResults.values = resultData;
            }
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results)
        {
            foodItems = (List<FoodItems>)results.values;
            notifyDataSetChanged();
        }
    };

    @NonNull
    @Override
    public Filter getFilter()
    {
        return listFilter;

    }
}

/*
    FilterResults filterResults=new FilterResults();
                    if(constraint==null || constraint.length()==0)
                    {
                            filterResults.count=itemsModelList.size();
                            filterResults.values=itemsModelList;

                            }
                            else

                            {
                            String searchStr= constraint.toString().toLowerCase();
                            List<ItemsModel> resultData=new ArrayList<>( );

        for(ItemsModel itemsModel:itemsModelList)
        {
        if (itemsModel.getName().toLowerCase(Locale.getDefault()).contains(searchStr))
        //if( itemsModel.getName().contains(searchStr) || (itemsModel.getName().toLowerCase() == searchStr) )
        resultData.add(itemsModel);
        }
        filterResults.count=resultData.size();
        filterResults.values=resultData;
        }
        return filterResults;*/
