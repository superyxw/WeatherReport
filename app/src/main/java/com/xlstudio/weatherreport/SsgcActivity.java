package com.xlstudio.weatherreport;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.xlstudio.weatherreport.adapter.WeatherListAdapter;
import com.xlstudio.weatherreport.core.BaseAppCompatActivity;
import com.xlstudio.weatherreport.entity.Weather;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * Created by superyxw on 16/3/22.
 */
public class SsgcActivity extends BaseAppCompatActivity {

    @Bind(R.id.id_recyclerview)
    RecyclerView mRv;
    @Bind(R.id.iv_img)
    ImageView mIv;
    private WeatherListAdapter adapter;

    private List<Weather> data = new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_ssgc;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mRv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {
        data.add(new Weather("郑州","20mm"));
        data.add(new Weather("洛阳","14mm"));
        data.add(new Weather("焦作","32mm"));
        data.add(new Weather("安阳","17mm"));
        data.add(new Weather("平顶山","11mm"));
        data.add(new Weather("驻马店","5mm"));
        data.add(new Weather("周口","27mm"));
        adapter = new WeatherListAdapter(data,SsgcActivity.this);
        mRv.setAdapter(adapter);

    }

    @OnClick(R.id.rl_list)
    public void showList(){
        if(!mRv.isShown()){
            mRv.setVisibility(View.VISIBLE);
            mIv.setVisibility(View.GONE);
        }
    }

    @OnClick(R.id.rl_pic)
    public void showPic(){
        if(mRv.isShown()){
            mRv.setVisibility(View.GONE);
            mIv.setVisibility(View.VISIBLE);
        }
    }
}
