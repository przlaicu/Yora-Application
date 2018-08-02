package com.milan.yora.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.milan.yora.R;
import com.milan.yora.activities.BaseActivity;
import com.milan.yora.activities.ContactsActivity;
import com.milan.yora.activities.MainActivity;
import com.milan.yora.activities.ProfileActivity;
import com.milan.yora.activities.SentMessagesActivity;
import com.milan.yora.infrastructure.User;

public class MainNavDrawer extends NavDrawer {

    private final TextView displayNameText;
    private final ImageView avatarImage;


    public MainNavDrawer(final BaseActivity activity) {
        super(activity);

        addItem(new ActivityDrawarItem(MainActivity.class, "Inbox", null, R.drawable.ic_action_unread, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityDrawarItem(SentMessagesActivity.class, "Sent Messages", null, R.drawable.ic_action_send, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityDrawarItem(ContactsActivity.class, "Contacts ", null, R.drawable.ic_action_group, R.id.include_main_nav_drawer_topItems));
        addItem(new ActivityDrawarItem(ProfileActivity.class, "Profile", null, R.drawable.ic_action_pearson, R.id.include_main_nav_drawer_topItems));

        addItem(new BasicNavDrawerItem("Logout", null, R.drawable.ic_action_backspace, R.id.include_main_nav_drawer_bootomItems) {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "You have loggedout!!", Toast.LENGTH_SHORT).show();
            }
        });

        displayNameText = (TextView) navDrawerView.findViewById(R.id.include_main_nav_drawer_diplayName);
        avatarImage = (ImageView) navDrawerView.findViewById(R.id.include_main_nav_drawer_avatar);

        User loggedInUser = activity.getYoraApplication().getAuth().getUser();
        displayNameText.setText(loggedInUser.getDisplayName());


        // TODO: shange image to avatarUrl from loggedInUser
    }
}
