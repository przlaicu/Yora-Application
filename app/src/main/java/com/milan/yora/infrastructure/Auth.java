package com.milan.yora.infrastructure;

import android.content.Context;

public class Auth {

    private final Context context;
    private User user;

    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}
