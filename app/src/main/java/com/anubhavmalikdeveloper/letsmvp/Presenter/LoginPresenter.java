package com.anubhavmalikdeveloper.letsmvp.Presenter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.anubhavmalikdeveloper.letsmvp.Contracts.LoginContract;

public class LoginPresenter implements LoginContract.MainContract {
    private Context context;
    private LoginContract.View view;

    public LoginPresenter(Context context, LoginContract.View view) {
        this.context = context;
        this.view = view;
    }

    @Override
    public void startActivity(Context context, Class target) {
        context.startActivity(new Intent(context, target));
    }

    @Override
    public void switchFragment(Context context, Fragment fragment) {
        //
    }

    @Override
    public boolean validateLogin(String email, String password) {
        //This should contains business logic to authenticate and verify user
        // and then based on the result provide a boolean
        // indicating the status of login of the user
        // Since we are doing any of those things here, we will just return true every time indicating that user is authenticated.

        view.showToast(context, "Login successful", Toast.LENGTH_SHORT);
        return true;
    }
}
