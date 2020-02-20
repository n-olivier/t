package com.example.classquiz;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Form extends Fragment {


    EditText nametxt, passwordtxt;
    Button add;

    public final String MyPREFERENCES = "MyPrefs";
    public final String Name = "nameKey";
    public final String Password = "password";

    SharedPreferences sharedpreferences;

    public Form() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_form, container, false);
        add = view.findViewById(R.id.addbtn);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.fragmentManager.beginTransaction().replace(R.id.FragmentContainer, new Message(), null).addToBackStack(null).commit();
            }
        });

        return view;
    }

}
