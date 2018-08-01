package com.milan.yora.views;

import android.view.View;
import android.widget.Toast;

import com.milan.yora.R;
import com.milan.yora.activities.BaseActivity;
import com.milan.yora.activities.MainActivity;

public class MainNavDrawer extends NavDrawer {

    public MainNavDrawer(final BaseActivity activity) {
        super(activity);

        addItem(new ActivityDrawarItem(MainActivity.class, "Inbox", null, R.drawable.ic_action_unread, R.id.include_main_nav_drawer_topItems));

        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace, R.id.include_main_nav_drawer_bootomItems) {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "You have loggedout!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
