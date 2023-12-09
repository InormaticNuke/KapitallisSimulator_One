package kapOne.kap.kapitallissimulator_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kapitallissimulator_one.R;

public class simulator extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dataentry);

    }

    public void onClickDataShow(View view) {
        Intent intent = new Intent(this, simresult.class);
        startActivity(intent);
    }


    public void onClickBackOne(View view){
        Intent intent = new Intent (this, selector.class);
        startActivity(intent);
    }


    Integer documentValue;
    String documentDate;
    String documentExp;

//AQUI VA TODO EL PROCESO DE BACKEND DE LOS DATOS ENTREGADOS PARA LA SIMULACION ; WORK IN PROGRESS

   /* EditText editText = (EditText) findViewById(R.id.factValue);
    editText.setOnClickListener (new View.OnClickListener(){
        public void onClick(View v){
            openActivity2();
        }
    });

    public void openActivity(){
        Intent intent = new Intent(this, simresult.class);
        startActivity(intent);
    }*/

}
