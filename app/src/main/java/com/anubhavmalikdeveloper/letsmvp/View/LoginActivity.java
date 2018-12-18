package com.anubhavmalikdeveloper.letsmvp.View;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anubhavmalikdeveloper.letsmvp.Contracts.LoginContract;
import com.anubhavmalikdeveloper.letsmvp.Presenter.LoginPresenter;
import com.anubhavmalikdeveloper.letsmvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener {


    @BindView(R.id.email)
    EditText mEmailView;

    @BindView(R.id.password)
    EditText mPasswordView;

    @BindView(R.id.login_progress)
    View mProgressView;

    @BindView(R.id.login_form)
    View mLoginFormView;

    @BindView(R.id.email_sign_in_button)
    Button submitButton;

    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Set up the login form.
        ButterKnife.bind(this);
        loginPresenter = new LoginPresenter(this, this);
        submitButton.setOnClickListener(this);
    }

    @Override
    public void showProgress(boolean show) {
        //unimplemented
    }

    @Override
    public void showSnackbar(Context context, String message, int length) {
        //unimplemented
    }

    @Override
    public void showToast(Context context, String message, int length) {
        Toast.makeText(context, message, length).show();
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == submitButton.getId()) {
            if (!mEmailView.getText().toString().isEmpty() && !mPasswordView.getText().toString().isEmpty()) {

                loginPresenter.validateLogin(mEmailView.getText().toString(), mPasswordView.getText().toString());

            }
        }
    }
}

