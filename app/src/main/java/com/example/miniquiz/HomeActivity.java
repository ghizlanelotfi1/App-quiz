package com.example.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    private  Button btn_start;
    private  Button btn_camera;
    private  Button btn_localisation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_start= (Button)findViewById(R.id.buttonplay);
        btn_camera=(Button)findViewById(R.id.buttoncamera);
        btn_localisation=(Button)findViewById(R.id.buttonmap);


        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent quizIntent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(quizIntent);

            }
        });

        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizIntent = new Intent(HomeActivity.this,CameraActivity.class);
                startActivity(quizIntent);
            }
        });

        btn_localisation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizIntent = new Intent(HomeActivity.this,MapsActivity.class);
                startActivity(quizIntent);
            }
        });

    }
}
