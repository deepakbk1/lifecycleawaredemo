package com.deepak.lifecycleawaredemo;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Created by deepakpurohit on 23,August,2019
 */
public class MainActivityObserver implements LifecycleObserver {
    private String Tag = this.getClass().getSimpleName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreateEvent() {
        Log.i(Tag, "Observer ON_CREATE Event");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStartEvent() {
        Log.i(Tag, "Observer ON_START Event");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPauseEvent() {
        Log.i(Tag, "Observer ON_PAUSE Event");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResumeEvent() {
        Log.i(Tag, "Observer ON_RESUME Event");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStopEvent() {
        Log.i(Tag, "Observer ON_STOP Event");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroyEvent() {
        Log.i(Tag, "Observer ON_DESTROY Event");
    }


}
