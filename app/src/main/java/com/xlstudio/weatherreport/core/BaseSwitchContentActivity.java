package com.xlstudio.weatherreport.core;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.xlstudio.weatherreport.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.OnClick;

/**
 * Created by superyxw on 16/3/17.
 */
public abstract class BaseSwitchContentActivity extends BaseAppCompatActivity{

    private  Fragment content;

    private  List<Fragment> fragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.initTabs();
    }

    private void initTabs() {
        this.fragments = getFragments();

        getSupportFragmentManager().beginTransaction()
                .replace(getFragmentLayoutId(),fragments.get(0)).commit();

        content = fragments.get(0);

        for(int i=0;i<getTabIds().length;i++){
            findViewById(getTabIds()[i]).setOnClickListener(mListener);
        }

    }

    public void switchContent(final Fragment fragment, final boolean isAdded) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        if (!isAdded) {
            ft.hide(content).add(getFragmentLayoutId(), fragment).commitAllowingStateLoss();
        } else {
            ft.hide(content).show(fragment).commitAllowingStateLoss();
        }
        content = fragment;
    }

    public abstract int getFragmentLayoutId();

    public abstract int[] getTabIds();

    public abstract List<Fragment> getFragments();

    private View.OnClickListener mListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            for(int i=0;i<getTabIds().length;i++){
                if(v.getId()==getTabIds()[i]){
                    switchContent(fragments.get(i),fragments.get(i).isAdded());
                }
            }
        }
    };
}
