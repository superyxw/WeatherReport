package com.xlstudio.weatherreport.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xlstudio.weatherreport.R;
import com.xlstudio.weatherreport.entity.Weather;
import com.xlstudio.weatherreport.interf.MyOnItemClickListener;

import java.util.List;

/**
 * Created by superyxw on 16/3/22.
 */
public class WeatherListAdapter extends RecyclerView.Adapter<WeatherListAdapter.MyViewHolder> {

    private List<Weather> data;

    private Context context;

    private MyOnItemClickListener listener;

    public MyOnItemClickListener getListener() {
        return listener;
    }

    public void setListener(MyOnItemClickListener listener) {
        this.listener = listener;
    }

    public WeatherListAdapter(List<Weather> data, Context context){
        this.data = data;
        this.context = context;
    }
    @Override
    public WeatherListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.weather_list_item, parent,
                false),listener);
        return holder;
    }

    @Override
    public void onBindViewHolder(WeatherListAdapter.MyViewHolder holder, int position) {
        holder.cityTv.setText(data.get(position).getCity());
        holder.numTv.setText(data.get(position).getTemperature());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        TextView cityTv;

        TextView numTv;

        MyOnItemClickListener listener;

        public MyViewHolder(View view,MyOnItemClickListener listener)
        {
            super(view);
            cityTv = (TextView) view.findViewById(R.id.tv_city_name);
            numTv = (TextView) view.findViewById(R.id.tv_city_num);
            this.listener = listener;
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(listener!=null){
                listener.onItemClick(v,getPosition());
            }
        }
    }
}
