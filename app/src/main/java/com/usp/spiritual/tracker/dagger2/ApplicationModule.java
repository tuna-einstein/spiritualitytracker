package com.usp.spiritual.tracker.dagger2;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

/**
 * Created by umasankar on 10/3/15.
 */
@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @AppScope
    @Provides
    Application application() {
        return application;
    }
}
