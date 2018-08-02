package com.milan.yora.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.milan.yora.R;
import com.milan.yora.views.MainNavDrawer;

public class ProfileActivity extends BaseAuthenticatedActivity {

    @Override
    protected void onYoraCreate(Bundle savedState) {
        setContentView(R.layout.activity_profile);
        setNavDrawer(new MainNavDrawer(this));

        if (!isTablet) {
            View texFileds = findViewById(R.id.activity_profile_textFileds);

            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) texFileds.getLayoutParams();
            params.setMargins(0, params.getMarginStart(), 0,0); // idu pravi pixeli ne dp
            params.removeRule(RelativeLayout.END_OF);
            params.addRule(RelativeLayout.BELOW, R.id.activity_profile_changeAvatar);
            texFileds.setLayoutParams(params);

        }
    }
}
