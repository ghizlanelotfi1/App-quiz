package com.example.miniquiz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.lzyzsd.circleprogress.CircleProgress;

public class ResultActivity extends AppCompatActivity {
    private Button btn_retour;
    CircleProgress circleProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btn_retour= (Button)findViewById(R.id.retour);
        btn_retour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizIntent = new Intent(ResultActivity.this,HomeActivity.class);
                startActivity(quizIntent);
            }
        });
        circleProgress=(CircleProgress)findViewById(R.id.arc_progress);

        double d=((double)MainActivity.correct/5)*100;

        circleProgress.setProgress((int)d);



    }
}
