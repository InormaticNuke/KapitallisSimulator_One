package kapOne.kap.kapitallissimulator_one;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kapitallissimulator_one.R;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class formJ2 extends AppCompatActivity {

    private static String mqttHost = "mqttserver01.cloud.shiftr.io:1883";
    private static String IdUsuario = "AppAndroid";
    private static String Topico = "Mensaje";
    private static String User = "hurricaneseer286";
    private static String Pass = "MxqEJMkFUm20rw7p";

    private TextView textView;
    private EditText editTextMessage;

    private MqttClient mqttClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form2);


        textView = findViewById(R.id.textView);
        editTextMessage = findViewById(R.id.commentMQTT);

        try {

            mqttClient = new MqttClient(mqttHost, IdUsuario, null);
            MqttConnectOptions options = new MqttConnectOptions();
            options.setUserName(User);
            options.setPassword(Pass.toCharArray());

            mqttClient.connect(options);

            Toast.makeText(this, "Aplicación conectada al Servidor MQTT", Toast.LENGTH_SHORT).show();

            mqttClient.setCallback(new MqttCallback() {
                @Override
                public void connectionLost(Throwable cause) {
                    Log.d("MQTT", "Conexión perdida");
                }

                @Override
                public void messageArrived(String topic, MqttMessage message) {
                    String payload = new String(message.getPayload());
                    runOnUiThread(() -> textView.setText(payload));
                }

                @Override
                public void deliveryComplete(IMqttDeliveryToken token) {
                    Log.d("MQTT", "Entrega completa");
                }
            });



        } catch (MqttException e) {
            e.printStackTrace();
        }
    }

    public void backButtonForm2(View view) {
        Intent intent = new Intent(this, selector.class);
        startActivity(intent);
    }

    //TestComment01

}
