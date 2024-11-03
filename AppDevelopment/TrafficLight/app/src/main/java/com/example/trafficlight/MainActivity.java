package com.example.trafficlight;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private trafficlightview trafficLightView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trafficLightView = findViewById(R.id.trafficLightView);
        Button redLightButton = findViewById(R.id.redLightButton);
        Button yellowLightButton = findViewById(R.id.yellowLightButton);
        Button greenLightButton = findViewById(R.id.greenLightButton);


        redLightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trafficLightView.redLight();
            }
        });
        yellowLightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trafficLightView.yellowLight();
            }
        });
        greenLightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trafficLightView.greenLight();
            }
        });
    }
}
