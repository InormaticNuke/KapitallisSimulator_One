package com.example.kapitallissimulator_one;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

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

        FirebaseFirestore db = FirebaseFirestore.getInstance();

        db.collection("Comunas")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {

                            List<String> listaComunas = new ArrayList<>();

                            for (QueryDocumentSnapshot document : task.getResult()) {
                                String linea = "||" + document.getString("Rut") + "||" +
                                        document.getString("Nombre") + "||";

                                listaComunas.add(linea);
                            }

                            ArrayAdapter<String> adaptador = new ArrayAdapter<>(formJ.this,
                                    android.R.layout.simple_list_item_1, listaComunas);
                            list.setAdapter(adaptador);
                        } else {

                            Log.e("TAG", "Error al obtener datos de Firestore", task.getException());
                        }
                    }
                });
    }

    public void listShow(){
    }

}
