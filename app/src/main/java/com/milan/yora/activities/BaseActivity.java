package com.milan.yora.activities;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;

import com.milan.yora.R;
import com.milan.yora.infrastructure.YoraApplication;
import com.milan.yora.views.NavDrawer;

public abstract class BaseActivity extends AppCompatActivity {

    protected YoraApplication application;
    protected Toolbar toolbar;
    protected NavDrawer navDrawer;
    protected boolean isTablet;

    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);
        application = (YoraApplication) getApplication();

        DisplayMetrics metrics = getResources().getDisplayMetrics();
        isTablet = (metrics.widthPixels / metrics.density) >= 600;
    }

    @Override
    public void setContentView(@LayoutRes int layoutResId) {
        super.setContentView(layoutResId);

        toolbar = (Toolbar) findViewById(R.id.include_toolbar);

        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }
    }

    public void fadeOut(final FadeOutListener listener) {
        View rootView = findViewById(android.R.id.content);
        rootView.animate()
                .alpha(0)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        listener.onFadeOutEnd();

                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                })
                .setDuration(300)
                .start();
    }

    protected void setNavDrawer(NavDrawer drawer) {
        this.navDrawer = drawer;
        this.navDrawer.create();

        overridePendingTransition(0, 0);

        View rootView = findViewById(android.R.id.content);
        rootView.setAlpha(0);
        rootView.animate().alpha(1).setDuration(450).start();
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public YoraApplication getYoraApplication() {
        return application;
    }

    public interface FadeOutListener {
        void onFadeOutEnd();
    }
}
