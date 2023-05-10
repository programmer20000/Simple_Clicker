package com.example.simple_clicker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer actualNumber, afterNumber;
    private TextView viewClicker;
    private Button btnClicker;
    private MediaPlayer AudioFile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewClicker = (TextView) findViewById(R.id.text_view);
        btnClicker = (Button) findViewById(R.id.btn_clicker);
        AudioFile = MediaPlayer.create(this,R.raw.coins_sound);

        actualNumber = 0;
        afterNumber = 1;

        Clicker();
    }

    public void Clicker() {

        btnClicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actualNumber += afterNumber;
                viewClicker.setText(actualNumber.toString());
                AudioFile.start();
            }
        });
    }
}