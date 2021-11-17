package com.example.ebills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private String s="Shbh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.signuplogin);
        TextView bt=findViewById(R.id.blogin);



    }
    public void sig(View v)
    {
        Intent in=new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(in);

    }
    public void log(View v)
    {
        Intent in=new Intent(LoginActivity.this,MainActivity.class);
        in.putExtra("name",s);

        startActivity(in);

    }
}