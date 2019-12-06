package com.example.ex5_6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button  laymain,laymain2,laymain3,laymain4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laymain=(Button)findViewById(R.id.laymain);
        laymain2=(Button)findViewById(R.id.laymain2);
        laymain3=(Button)findViewById(R.id.laymain3);
        laymain4=(Button)findViewById(R.id.laymain4);


        laymain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"메인화면입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        laymain2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"가로 250dp 세로 250dp 입니다.",Toast.LENGTH_SHORT).show();
            }
        });
        laymain3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"가로 150dp 세로 150dp 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        laymain4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"가로 50dp 세로 50dp 입니다.",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
