package com.bawei.day2019122.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.day2019122.contract.Contract;

public abstract class BaseActivity < P extends BasePresenter> extends AppCompatActivity implements Contract.IView {

    public P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Layout()!=0){
            setContentView(Layout());
            initView();
            mPresenter=initPersenter();
            mPresenter.Attcch(this);
            startCoding();
        }
    }

    protected abstract void startCoding();

    protected abstract P initPersenter();

    protected abstract void initView();

    protected abstract int Layout();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.onEnd();
        }
    }
}
