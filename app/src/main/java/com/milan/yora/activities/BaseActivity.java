package com.milan.yora.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.milan.yora.R;
import com.milan.yora.infrastructure.YoraApplication;

public abstract class BaseActivity extends AppCompatActivity {

    protected YoraApplication application;
    protected Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        application = (YoraApplication) getApplication();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResId) {
        super.setContentView(layoutResId);

        toolbar = (Toolbar) findViewById(R.id.include_toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }
}
