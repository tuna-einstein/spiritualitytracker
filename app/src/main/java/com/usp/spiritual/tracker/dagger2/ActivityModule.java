package com.usp.spiritual.tracker.dagger2;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by umasankar on 10/3/15.
 */
@Module
public class ActivityModule {

    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    Activity provideActivity() {
        return activity;
    }
}
