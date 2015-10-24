package com.example.aplakhotniy.geek_23;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class HomeWork_2 extends AppCompatActivity {
    //-factorial
    private TextView resTxt;
    private Button prcFactBtn;
    private EditText editText;
    //-fibonachi
    private TextView resFibTxt;
    private Button prcFibBtn;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_2);

        resTxt = (TextView)findViewById(R.id.resTxt);
        prcFactBtn = (Button)findViewById(R.id.prcFactBtn);
        editText = (EditText)findViewById(R.id.editText);

        resFibTxt = (TextView)findViewById(R.id.resFibTxt);
        prcFibBtn = (Button)findViewById(R.id.prcFibBtn);
        editText2 = (EditText)findViewById(R.id.editText2);

        prcFactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    if(editText.getText().toString().length() > 0){
                        int b = Integer.valueOf(editText.getText().toString());
                        if(factorial(b) >= 0){
                            resTxt.setText(""+factorial(b));
                        }
                        else if(factorial(b) < 0){
                            Toast r = Toast.makeText(getApplicationContext(), "Число привысило допустимый тип", Toast.LENGTH_SHORT);
                            r.show();
                        }
                    }
                    else {
                        Toast t = Toast.makeText(getApplicationContext(), "Введите число!!!", Toast.LENGTH_SHORT);
                        t.show();
                    }
                }
                catch (Exception e){
                    Toast t = Toast.makeText(getApplicationContext(), "Введите число!!!", Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        prcFibBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    if(editText2.getText().toString().length() > 0){
                        int k = Integer.valueOf(editText2.getText().toString());
                        if (fibonachi(k) >= 0){
                            resFibTxt.setText(""+fibonachi(k));
                        }
                        else if(fibonachi(k) < 0){
                            Toast l = Toast.makeText(getApplicationContext(), "Число привысило допустимый тип", Toast.LENGTH_SHORT);
                            l.show();
                        }
                    }
                    else {
                        Toast t = Toast.makeText(getApplicationContext(), "Введите число!!!", Toast.LENGTH_SHORT);
                        t.show();
                    }
                }
                catch (Exception e){
                    Toast t = Toast.makeText(getApplicationContext(), "Неизвестная ошибка", Toast.LENGTH_SHORT);
                }
            }
        });

    }

    static public int factorial(int a){
        if (a == 0){
            return 0;
        }
        else {
            int res = 1;
            for(int i = 1; i <= a; i++){
                boolean maxInt = ((long)res * i) <= Integer.MAX_VALUE;
                if(maxInt){
                    res = res * i;
                }
                else {
                    return -1;
                }
            }
            return res;
        }
    }

    static public int fibonachi(int k){

        if(k == 0){
            return 0;
        }
        else {
            int x = 0;
            int y = 1;
            int res = 1;
            for(int i = 0; i < k; i++){
                    boolean maxInt = ((long)res + y) <= Integer.MAX_VALUE;
                    if(maxInt){
                        res = x + y;
                        x = y;
                        y = res;
                    }
                    else {
                        return -1;
                    }
            }
                return res;
        }
    }
}
