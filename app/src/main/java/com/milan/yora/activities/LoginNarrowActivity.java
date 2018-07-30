package com.milan.yora.activities;

import android.os.Bundle;

import com.milan.yora.R;
import com.milan.yora.fragments.LoginFragment;

public class LoginNarrowActivity extends BaseActivity implements LoginFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedStated) {
        super.onCreate(savedStated);

        setContentView(R.layout.activity_login_narrow);
    }

    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
