package com.xlstudio.weatherreport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.xlstudio.weatherreport.adapter.QueryListAdapter;
import com.xlstudio.weatherreport.core.BaseAppCompatActivity;
import com.xlstudio.weatherreport.interf.MyOnItemClickListener;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;

/**
 * Created by superyxw on 16/3/21.
 */
public class QueryListActivity extends BaseAppCompatActivity implements MyOnItemClickListener{

    @Bind(R.id.id_recyclerview)
    RecyclerView mainRv;
    QueryListAdapter adapter;
    List<String> data = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_query_list;
    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        mainRv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {
        data.add("实时查询");
        data.add("历史查询");
        adapter = new QueryListAdapter(data,QueryListActivity.this);
        adapter.setListener(this);
        mainRv.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int postion) {
        Intent intent = new Intent(QueryListActivity.this,SsgcActivity.class);
        startActivity(intent);
    }
}
