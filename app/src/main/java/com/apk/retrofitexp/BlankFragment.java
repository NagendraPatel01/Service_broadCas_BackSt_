package com.apk.retrofitexp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class BlankFragment extends Fragment {
    private static final String TAG = "BlankFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_blank, container, false);
        Log.e(TAG, "onCreateView: ");

        return view;

    }

    @Override
    public void onAttach(@NonNull Context context) {

        Log.e(TAG, "onAttach: ");
        super.onAttach(context);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e(TAG, "onActivityCreated: " );
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        Log.e(TAG, "onStart: " );
        super.onStart();
    }

    @Override
    public void onResume() {

        Log.e(TAG, "onResume: " );
        super.onResume();
    }

    @Override
    public void onPause() {
        Log.e(TAG, "onPause: " );
        super.onPause();
    }

    @Override
    public void onStop() {
        Log.e(TAG, "onStop: " );
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Log.e(TAG, "onDestroyView: " );
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Log.e(TAG, "onDestroy: " );
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach: " );
        super.onDetach();
    }
}