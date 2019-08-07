package com.example.sampleblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class NextPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_page);
        Intent intent = getIntent();
        int userId = intent.getIntExtra("userId",0);
        if (userId == 1){
            finish();
        }
    }




}
