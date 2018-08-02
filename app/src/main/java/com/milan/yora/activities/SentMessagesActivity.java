package com.milan.yora.activities;

import android.os.Bundle;

import com.milan.yora.R;
import com.milan.yora.views.MainNavDrawer;

public class SentMessagesActivity extends BaseAuthenticatedActivity {

    @Override
    protected void onYoraCreate(Bundle savedState) {
        setContentView(R.layout.activity_sent_messages);
        setNavDrawer(new MainNavDrawer(this));

    }
}
