package com.bawei.day2019122.base;

import com.bawei.day2019122.contract.Contract;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends Contract.IView> implements Contract.IPersenter {

    private WeakReference<V> vWeakReference;

    public void Persenter(){
        initModel();
    }

    protected abstract void initModel();
    protected void Attcch(V iView){
        vWeakReference = new WeakReference<>(iView);
    }
    protected void onEnd(){
        if (vWeakReference != null) {
            vWeakReference.clear();
            vWeakReference=null;
        }
    }
    protected V getView(){
        return vWeakReference.get();
    }
}
