package com.xlstudio.weatherreport;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xlstudio.weatherreport.adapter.ServiceListAdapter;
import com.xlstudio.weatherreport.core.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by superyxw on 16/3/17.
 */
public class QxfwFragment extends BaseFragment {
    @Bind(R.id.id_recyclerview)
    RecyclerView mainRv;

    ServiceListAdapter adapter;

    List<String> data = new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_qxfw;
    }

    @Override
    protected void initViews(View self, Bundle savedInstanceState) {
        mainRv.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {
        data.add("国外天气预报翻译");
        data.add("气候指导报");
        data.add("领导工作日报");
        data.add("学术详解");
        data.add("国外天气预报翻译");
        data.add("气候指导报");
        data.add("领导工作日报");
        data.add("学术详解");
        adapter = new ServiceListAdapter(data,getActivity());
        mainRv.setAdapter(adapter);
    }
}
