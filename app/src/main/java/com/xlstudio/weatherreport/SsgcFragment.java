package com.xlstudio.weatherreport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.xlstudio.weatherreport.core.BaseFragment;

import butterknife.OnClick;

/**
 * Created by superyxw on 16/3/17.
 */
public class SsgcFragment extends BaseFragment implements View.OnClickListener {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_ssgc;
    }

    @Override
    protected void initViews(View self, Bundle savedInstanceState) {
        self.findViewById(R.id.rl_qw).setOnClickListener(this);
        self.findViewById(R.id.rl_yl).setOnClickListener(this);
    }

    @Override
    protected void initListeners() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.rl_qw:
                intent.setClass(getActivity(),QueryListActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_yl:
                intent.setClass(getActivity(),QueryListActivity.class);
                startActivity(intent);
                break;
        }
    }
}
