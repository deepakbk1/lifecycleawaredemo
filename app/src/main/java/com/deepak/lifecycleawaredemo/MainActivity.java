package com.deepak.lifecycleawaredemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String Tag = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "Owner ON_START Event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "Owner ON_PAUSE Event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "Owner ON_RESUME Event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "Owner ON_STOP Event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "Owner ON_DESTROY Event");
    }
}
