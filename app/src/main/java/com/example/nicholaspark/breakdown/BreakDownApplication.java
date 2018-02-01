package com.example.nicholaspark.breakdown;

import android.app.Application;

import com.example.quickcart.QuickCart;


public class BreakDownApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Init QuickCart library
        QuickCart.init(this);
    }
}
