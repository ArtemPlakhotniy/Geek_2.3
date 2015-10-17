package com.example.aplakhotniy.geek_23;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeWork_1 extends AppCompatActivity {


    private TextView textView;
    private Button greenBtn;
    private Button redBtn;
    private Button blueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_1);

        textView = (TextView)findViewById(R.id.textView);

        greenBtn = (Button)findViewById(R.id.greenBtn);
        redBtn = (Button)findViewById(R.id.redBtn);
        blueBtn = (Button)findViewById(R.id.blueBtn);

        greenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.GREEN);
            }
        });

        redBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.RED);
            }
        });

        blueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextColor(Color.BLUE);
            }
        });

    }
}
