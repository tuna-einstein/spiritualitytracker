package com.usp.spiritual.tracker.dagger2;

import android.app.Application;

import dagger.Component;

/**
 * Contains bindings at application level.
 */
@AppScope
@Component(
        modules = {
                ApplicationModule.class,
        }
)
public interface ApplicationComponent {

    Application application();
}
