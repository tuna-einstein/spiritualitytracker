package com.usp.spiritual.tracker;

import android.app.Application;
import android.content.Context;

import com.usp.spiritual.tracker.dagger2.ApplicationComponent;
import com.usp.spiritual.tracker.dagger2.ApplicationModule;
import com.usp.spiritual.tracker.dagger2.DaggerApplicationComponent;

/**
 * Created by umasankar on 10/3/15.
 */
public class ApplicationRoot extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return applicationComponent;
    }

    public static ApplicationComponent getComponent(Context context) {
        return ((ApplicationRoot) context.getApplicationContext()).getComponent();
    }
}
