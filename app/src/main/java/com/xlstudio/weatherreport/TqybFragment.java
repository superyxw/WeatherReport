package com.xlstudio.weatherreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xlstudio.weatherreport.adapter.WeatherListAdapter;
import com.xlstudio.weatherreport.core.BaseFragment;
import com.xlstudio.weatherreport.entity.Weather;
import com.xlstudio.weatherreport.interf.MyOnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by superyxw on 16/3/17.
 */
public class TqybFragment extends BaseFragment implements MyOnItemClickListener {

    @Bind(R.id.id_recyclerview)
    RecyclerView mRv;

    private WeatherListAdapter adapter;

    private List<Weather> data = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tqyb;
    }

    @Override
    protected void initViews(View self, Bundle savedInstanceState) {
        mRv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {
        data.add(new Weather("郑州","20°c"));
        data.add(new Weather("洛阳","14°c"));
        data.add(new Weather("焦作","32°c"));
        data.add(new Weather("安阳","17°c"));
        data.add(new Weather("平顶山","11°c"));
        data.add(new Weather("驻马店","5°c"));
        data.add(new Weather("周口","27°c"));
        adapter = new WeatherListAdapter(data,getActivity());
        adapter.setListener(this);
        mRv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int postion) {
        Intent intent = new Intent(getActivity(),WeatherPictureActivity.class);
        startActivity(intent);
    }
}
