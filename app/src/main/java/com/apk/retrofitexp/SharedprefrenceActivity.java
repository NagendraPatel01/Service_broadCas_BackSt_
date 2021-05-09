package com.apk.retrofitexp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedprefrenceActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btn;

    SharedPreferences sharedPreferences;

     String Shared_prefrence_name;
    /*private static final*/ String  key_name;
    /*private static final*/ String  key_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedprefrence);

        edit1=findViewById(R.id.edit1);
        edit2=findViewById(R.id.edit2);
        btn=findViewById(R.id.btn);

        sharedPreferences = getSharedPreferences(Shared_prefrence_name,MODE_PRIVATE);

       String name=sharedPreferences.getString(key_name,null);

       if (name != null){

           Intent intent=new Intent(SharedprefrenceActivity.this,SharedActivity.class);
           startActivity(intent);
       }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor=sharedPreferences.edit();
                editor.putString(key_name,edit1.getText().toString());
                editor.putString(key_id,edit2.getText().toString());
                editor.apply();

                Intent intent=new Intent(SharedprefrenceActivity.this,SharedActivity.class);
                startActivity(intent);

                Toast.makeText(SharedprefrenceActivity.this, "submit succes", Toast.LENGTH_SHORT).show();
            }
        });
    }
}