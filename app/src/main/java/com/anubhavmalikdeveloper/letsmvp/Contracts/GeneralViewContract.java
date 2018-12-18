package com.anubhavmalikdeveloper.letsmvp.Contracts;

import android.content.Context;

public interface GeneralViewContract {

    void showProgress(boolean show);    // to toggle the progressbar

    void showSnackbar(Context context, String message, int length);    // to show snackbar

    void showToast(Context context, String message, int length);   // to show toast

}
