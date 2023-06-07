package com.example.app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Login extends Fragment {
    private TextView loginsuccess;
    private String myText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_login, container, false);
        loginsuccess = view.findViewById(R.id.success_login);
        Bundle bundle = getArguments();
        if(bundle != null){
            myText=bundle.getString("LoginSuccessfull");
        }
        loginsuccess.setText(myText);

        return view;
    }
}