package com.example.ebills;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SearchView searchView;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView = (SearchView) findViewById(R.id.searchView);
        t=findViewById(R.id.tv);
        Intent in=getIntent();
        String ss=in.getStringExtra("name");
        t.setText(ss);
    }
}