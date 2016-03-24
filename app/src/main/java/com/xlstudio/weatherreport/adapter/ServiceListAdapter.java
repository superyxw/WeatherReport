package com.xlstudio.weatherreport.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xlstudio.weatherreport.R;
import com.xlstudio.weatherreport.interf.MyOnItemClickListener;

import java.util.List;

/**
 * Created by superyxw on 16/3/22.
 */
public class ServiceListAdapter extends RecyclerView.Adapter<ServiceListAdapter.MyViewHolder> {

    private List<String> data;

    private Context context;

    private MyOnItemClickListener listener;

    public MyOnItemClickListener getListener() {
        return listener;
    }

    public void setListener(MyOnItemClickListener listener) {
        this.listener = listener;
    }

    public ServiceListAdapter(List<String> data, Context context){
        this.data = data;
        this.context = context;
    }
    @Override
    public ServiceListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MyViewHolder holder = new MyViewHolder(LayoutInflater.from(
                context).inflate(R.layout.item_data, parent,
                false),listener);
        return holder;
    }

    @Override
    public void onBindViewHolder(ServiceListAdapter.MyViewHolder holder, int position) {
        holder.tv.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        TextView tv;

        MyOnItemClickListener listener;

        public MyViewHolder(View view,MyOnItemClickListener listener)
        {
            super(view);
            tv = (TextView) view.findViewById(R.id.data_title_tv);
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
