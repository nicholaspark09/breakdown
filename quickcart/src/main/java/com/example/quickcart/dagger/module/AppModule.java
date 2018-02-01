package com.example.quickcart.dagger.module;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;

@Module
public class AppModule {

    private static final long DISK_CACHE_SIZE = 20 * 1024 * 1024;

    @Provides
    Gson provideGson() {
        final GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.create();
    }

    @Provides
    @Singleton
    Cache provideCache(Application application) {
        return new Cache(application.getCacheDir(), DISK_CACHE_SIZE);
    }
}