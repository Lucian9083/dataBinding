package com.example.lucian.databinding;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lucian.databinding.databinding.FragmentMainBinding;
import com.example.lucian.databinding.model.User;
import com.example.lucian.databinding.presenter.MainPresenter;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        FragmentMainBinding fragmentMainBinding = DataBindingUtil.bind(view);
        User user = new User();
        fragmentMainBinding.setUser(user);
        MainPresenter presenter = new MainPresenter();
        fragmentMainBinding.setPresenter(presenter);
        return view;
    }
}
