package com.example.mbriskin.phils;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PhilsTonight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phils_tonight);

    }

    void yes(View view){

    }

    void no(View view){
        Intent intent = new Intent(this, ErrorMessage.class);
        startActivity(intent);
    }

}
