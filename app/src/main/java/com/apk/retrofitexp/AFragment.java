package com.apk.retrofitexp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class AFragment extends Fragment {

    Button button;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ((AppCompatActivity)(getActivity())).getSupportActionBar().show();
        ((AppCompatActivity)(getActivity())).getSupportActionBar().setDisplayShowHomeEnabled(false);

        View view= inflater.inflate(R.layout.fragment_a, container, false);


        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_AFragment_to_BFragment);
            }
        });
        return view;
    }
}