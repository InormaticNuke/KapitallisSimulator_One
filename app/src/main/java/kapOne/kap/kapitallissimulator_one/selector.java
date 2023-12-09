package kapOne.kap.kapitallissimulator_one;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kapitallissimulator_one.R;

public class selector extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectscreen);

    }

    public void onClickDataEntry(View view){
        Intent intent = new Intent (this, simulator.class);
        startActivity(intent);
    }

    public void onClickVideoPlayer(View view){
        Intent intent = new Intent (this, videoplayer.class);
        startActivity(intent);
    }

    public void onClickMapView(View view){
        Intent intent = new Intent (this, mapView.class);
        startActivity(intent);
    }

    public void onClickFactoring(View view){
        Intent intent = new Intent (this, factoringdata.class);
        startActivity(intent);
    }

    public void onClickProfile(View view){
        Intent intent = new Intent (this, factoringdata.class);
        startActivity(intent);
    }

    public void onClickRegister(View view){
        Intent intent = new Intent (this, formJ.class);
        startActivity(intent);
    }

    public void onClickRegister2(View view){
        Intent intent = new Intent (this, formJ2.class);
        startActivity(intent);
    }


}
