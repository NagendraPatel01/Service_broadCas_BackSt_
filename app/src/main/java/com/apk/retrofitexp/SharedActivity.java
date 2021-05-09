package com.apk.retrofitexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SharedActivity extends AppCompatActivity {

    TextView text1,text2;
    Button btn;

    SharedPreferences sharedPreferences;

    /*private static final*/ String Shared_prefrence_name;
    /*private static final*/ String  key_name;
    /*private static final*/ String  key_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        btn=findViewById(R.id.btn);

        sharedPreferences=getSharedPreferences(Shared_prefrence_name,MODE_PRIVATE);

        String name=sharedPreferences.getString(key_name,null);
        String id=sharedPreferences.getString(key_id,null);

        if (name !=null || id !=null){

            text1.setText(name);

            text2.setText(id);
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.clear();
                editor.commit();
                finish();

                Toast.makeText(SharedActivity.this, "logout succesfull", Toast.LENGTH_SHORT).show();

            }
        });
    }
}