package com.anubhavmalikdeveloper.letsmvp.Contracts;

public interface LoginContract {

    interface MainContract extends GeneralContract {

        boolean validateLogin(String email, String password);

    }

    interface View extends GeneralViewContract {

    }


}
