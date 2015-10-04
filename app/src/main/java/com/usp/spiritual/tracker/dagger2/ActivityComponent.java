package com.usp.spiritual.tracker.dagger2;

import android.app.Activity;

import com.usp.spiritual.tracker.MainActivity;

import dagger.Component;

/**
 * Created by umasankar on 10/3/15.
 */
@ActivityScope
@Component(
        dependencies = {ApplicationComponent.class},
        modules = {
                ActivityModule.class,
        }
)
public interface ActivityComponent {

    void inject(MainActivity activity);

    Activity activity();

}
