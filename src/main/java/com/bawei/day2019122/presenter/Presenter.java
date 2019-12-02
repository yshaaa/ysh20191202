package com.bawei.day2019122.presenter;

import com.bawei.day2019122.base.BasePresenter;
import com.bawei.day2019122.contract.Contract;
import com.bawei.day2019122.model.Model;

public class Presenter extends BasePresenter {
    private Contract.IModel model;
    @Override
    protected void initModel() {
        model=new Model();
    }

    @Override
    public void start(String url) {
        model.getInfo(url, new Contract.Mycallback() {
            @Override
            public void Success(String json) {
                getView().Success(json);
            }

            @Override
            public void Error(String error) {
                getView().Error(error);
            }
        });
    }
}
