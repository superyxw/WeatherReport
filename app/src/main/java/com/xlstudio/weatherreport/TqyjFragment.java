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
public class TqyjFragment extends BaseFragment {
    @Bind(R.id.id_recyclerview)
    RecyclerView mainRv;

    ServiceListAdapter adapter;

    List<String> data = new ArrayList<>();
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_tqyj;
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
        data.add("预警1");
        data.add("预警2");
        data.add("预警3");
        data.add("预警4");
        data.add("预警5");
        data.add("预警6");
        data.add("预警7");
        data.add("预警8");
        adapter = new ServiceListAdapter(data,getActivity());
        mainRv.setAdapter(adapter);
    }
}
