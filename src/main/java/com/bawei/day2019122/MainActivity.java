package com.bawei.day2019122;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bawei.day2019122.base.BaseActivity;
import com.bawei.day2019122.base.BasePresenter;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void startCoding() {

    }

    @Override
    protected BasePresenter initPersenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected int Layout() {
        return 0;
    }

    @Override
    public void Success(String json) {

    }

    @Override
    public void Error(String error) {

    }
}
