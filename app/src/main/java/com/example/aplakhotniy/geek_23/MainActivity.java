package com.example.aplakhotniy.geek_23;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button hw_Btn_1;
    private Button hw_Btn_2;
    private Button hw_Btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hw_Btn_1 = (Button)findViewById(R.id.hw_Btn_1);
        hw_Btn_2 = (Button)findViewById(R.id.hw_Btn_2);
        hw_Btn_3 = (Button)findViewById(R.id.hw_Btn_3);


        hw_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeWork_1.class);
                startActivity(i);
            }
        });

        hw_Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeWork_2.class);
                startActivity(i);
            }
        });

        hw_Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), HomeWork_3.class);
                startActivity(i);
            }
        });
    }
}
