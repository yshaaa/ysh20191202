package com.bawei.day2019122.model;

import com.bawei.day2019122.contract.Contract;
import com.bawei.day2019122.util.NetUtil;

public class Model implements Contract.IModel {
    @Override
    public void getInfo(String url, final Contract.Mycallback mycallback) {
        NetUtil.getInstance().get(url, new NetUtil.MyCallBack() {
            @Override
            public void onSuccess(String json) {
                mycallback.Success(json);
            }

            @Override
            public void onError(String error) {
                mycallback.Error(error);
            }
        });
    }
}
