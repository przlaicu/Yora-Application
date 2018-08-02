package com.milan.yora.activities;

import android.os.Bundle;

import com.milan.yora.R;
import com.milan.yora.views.MainNavDrawer;

public class ProfileActivity extends BaseAuthenticatedActivity {

    @Override
    protected void onYoraCreate(Bundle savedState) {
        setContentView(R.layout.activity_profile);
        setNavDrawer(new MainNavDrawer(this));
    }
}
