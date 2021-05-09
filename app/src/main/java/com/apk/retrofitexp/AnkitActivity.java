package com.apk.retrofitexp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class    AnkitActivity extends AppCompatActivity {

    String ankit;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ankit);

        text=findViewById(R.id.text);

      /*  Toast.makeText(this, "On create bhup", Toast.LENGTH_SHORT).show();*/

        ankit=getIntent().getStringExtra("bhupendta");

        text.setText(ankit);
    }
/*
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "On Start bhup", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "On Resume bhup", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On pause bhup", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "On destory bhup", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "On stop bhup", Toast.LENGTH_SHORT).show();
    }*/
}