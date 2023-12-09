package com.example.kapitallissimulator_one;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.firestore.FirebaseFirestore;

public class formJ extends AppCompatActivity {

    private EditText txtID, txtName;
    private ListView list;
    private Spinner spComuna;

    private FirebaseFirestore db;

    String[] adressComuna ={"Las Condes","Providencia","Vitacura","Santiago","Puente Alto","La Pintana"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        LoadListFirestore();
        db = FirebaseFirestore.getInstance();

        txtID = findViewById(R.id.userID);
        txtName = findViewById(R.id.userName);

        spComuna = findViewById(R.id.userAdress);
        list = findViewById(R.id.listShow);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, adressComuna);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spComuna.setAdapter(adapter);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spComuna.setAdapter(adapter);

    }

    public void sendDataFirestore(View view) {

        String RUT = txtID.getText().toString();
        String Nombre = txtName.getText().toString();
        String Comuna = spComuna.getSelectedItem().toString();


    }

    public void LoadListFirestore(){

        LoadListFirestore();

    }

    public void listShow(){
    }

}
