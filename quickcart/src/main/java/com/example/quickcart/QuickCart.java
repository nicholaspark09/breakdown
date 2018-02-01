package com.example.quickcart;

import android.app.Application;
import android.support.annotation.NonNull;

import com.example.quickcart.dagger.component.AppComponent;
import com.example.quickcart.dagger.component.DaggerAppComponent;

public class QuickCart {

    private static AppComponent mAppComponent;

    public static void init(@NonNull Application application) {
        mAppComponent = DaggerAppComponent.builder()
                .application(application)
                .build();
    }
}