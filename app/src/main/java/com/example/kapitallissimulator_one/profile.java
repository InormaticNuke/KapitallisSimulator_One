package com.example.kapitallissimulator_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factoringprofile);
    }

    public void onClickBackFour(View view) {
        Intent intent = new Intent(this, selector.class);
        startActivity(intent);
    }

}



