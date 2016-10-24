package com.example.lucian.databinding.model;

import android.databinding.ObservableField;

/**
 * Created by lvzheng on 16/10/21.
 */

public class User {

    public String userName;

    public String passWord;

    public final ObservableField<String> gender = new ObservableField<>();

    public User(){

        userName = "Lucian";

        passWord = "123456";

        gender.set("");
    }

}
