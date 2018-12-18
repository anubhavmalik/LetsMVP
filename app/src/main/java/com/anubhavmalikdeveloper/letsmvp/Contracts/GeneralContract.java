package com.anubhavmalikdeveloper.letsmvp.Contracts;

import android.content.Context;
import android.support.v4.app.Fragment;

public interface GeneralContract {

    void startActivity(Context context, Class target);   // to start another activity

    void switchFragment(Context context, Fragment fragment);    // to switch fragment

}
