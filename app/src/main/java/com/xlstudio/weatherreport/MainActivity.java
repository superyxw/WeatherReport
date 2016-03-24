package com.xlstudio.weatherreport;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.xlstudio.weatherreport.core.BaseAppCompatActivity;
import com.xlstudio.weatherreport.core.BaseSwitchContentActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseSwitchContentActivity {

    private int[] tabIds = {R.id.tv_ssgc,R.id.tv_tqyb,R.id.tv_tqyj,R.id.tv_qxfw,R.id.tv_szyb};

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }



    @Override
    protected void initViews(Bundle savedInstanceState) {

    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public int getFragmentLayoutId() {
        return R.id.fl_content;
    }

    @Override
    public int[] getTabIds() {
        return tabIds;
    }

    @Override
    public List<Fragment> getFragments() {

        List<Fragment> fragments = new ArrayList<>();

        fragments.add(new SsgcFragment());
        fragments.add(new TqybFragment());
        fragments.add(new TqyjFragment());
        fragments.add(new QxfwFragment());
        fragments.add(new SzybFragment());
        return fragments;
    }
}
