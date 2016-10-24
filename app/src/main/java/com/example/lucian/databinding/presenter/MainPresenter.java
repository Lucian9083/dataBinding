package com.example.lucian.databinding.presenter;

import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;

import com.example.lucian.databinding.R;
import com.example.lucian.databinding.model.User;

/**
 * Created by lvzheng on 16/10/24.
 */

public class MainPresenter {
    public static final String TAG = MainPresenter.class.getName();

    public void onCommitClick(View view){

        Log.i(TAG,String.valueOf(view.getId()));

    }

    public void onCheckedChanged(RadioGroup var1, int var2, User user){
        if(user == null){
            throw new IllegalArgumentException("the argument user is null");
        }
        switch (var1.getCheckedRadioButtonId()){
            case R.id.male:
                user.gender = "male";
                break;
            case R.id.female:
                user.gender = "female";
                break;
            default:
                user.gender = "male";
        }
        Log.i(TAG,var2+user.gender);
    }
}
