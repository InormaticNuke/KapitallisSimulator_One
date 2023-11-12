package com.example.kapitallissimulator_one;

import android.content.Intent;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class selector extends AppCompatActivity {

    protected void onClickDataEntry(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }
}
