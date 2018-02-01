package com.example.quickcart.dagger.component;

import android.app.Application;

import com.example.quickcart.dagger.AppScope;
import com.example.quickcart.dagger.module.AppModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@AppScope
@Component(
        modules = {
                AppModule.class,
                AndroidSupportInjectionModule.class
        }
)
public interface AppComponent {

    @Component.Builder
    interface Builder {

        AppComponent build();

        @BindsInstance
        Builder application(Application application);
    }
}
