package com.pst2021.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Loading_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        getSupportActionBar().hide();
    }
}