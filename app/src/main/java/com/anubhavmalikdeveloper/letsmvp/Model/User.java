package com.anubhavmalikdeveloper.letsmvp.Model;

public class User {
    private String name;
    private String password; //this shouldn't really be inside here because this will be encrypted on the server anyway

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
