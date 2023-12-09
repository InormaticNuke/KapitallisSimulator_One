package kapOne.kap.kapitallissimulator_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kapitallissimulator_one.R;

public class simresult extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datashow);
    }

    public void onClickBackFive(View view) {
        Intent intent = new Intent(this, selector.class);
        startActivity(intent);
    }

    //AQUI SE MOSTRARA EL RESULTADO DE LA OPERACION, WORK IN PROGRESS

}
