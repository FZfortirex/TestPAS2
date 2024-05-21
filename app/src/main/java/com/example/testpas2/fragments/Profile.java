package com.example.testpas2.fragments;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.testpas2.MainActivity;
import com.example.testpas2.R;
import com.example.testpas2.SplashScreen;

public class Profile extends Fragment {

    Button btnlogout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        btnlogout = view.findViewById(R.id.btnLogout);

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences settings = getActivity().getSharedPreferences(SplashScreen.prefsUsername, getActivity().MODE_PRIVATE);
                SharedPreferences.Editor editor = settings.edit();
                editor.remove("username");
                editor.apply();

                // Redirect to MainActivity (login page)
                Intent intent = new Intent(getActivity(), MainActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }
}