package com.example.aplakhotniy.geek_23;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeWork_3 extends Activity {

    private TextView textViewCollection_1;
    private TextView textViewCollection_2;
    private Button collect_Btn_1;
    private Button collect_Btn_2;
    private Button collect_Btn_3;
    private Button collect_Btn_4;

    private String[] values = new String[]{"Android", "iPhone", "WindowsMobile",
            "Blackberry", "Ubuntu", "Windows7", "Mac OS X", "Linux", "Ubuntu",
            "Windows7", "Mac OS X", "Linux", "Ubuntu", "Windows7", "Android",
            "iPhone", "WindowsMobile"};

    List<String> al = new ArrayList<String>();
    Set<String> sl = new HashSet<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_3);

        textViewCollection_1 = (TextView)findViewById(R.id.textViewCollection_1);
        textViewCollection_2 = (TextView)findViewById(R.id.textViewCollection_2);

        collect_Btn_1 = (Button)findViewById(R.id.collect_Btn_1);
        collect_Btn_2 = (Button)findViewById(R.id.collect_Btn_2);
        collect_Btn_3 = (Button)findViewById(R.id.collect_Btn_3);
        collect_Btn_4 = (Button)findViewById(R.id.collect_Btn_4);

        showArray(values);

        collect_Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCollection_2.setText("");
                backArray(values);
            }
        });

        collect_Btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCollection_2.setText("");
                nArray(values);
                al.clear();
            }
        });

        collect_Btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCollection_2.setText("");
                duplicate(values);
                sl.clear();
            }
        });

        collect_Btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewCollection_2.setText("");
                Comp(values);
                al.clear();

            }
        });

    }

    private void showArray(String[] values){
        for(String i : values){
            textViewCollection_1.append(i + ", ");
        }
    }

    private void backArray(String[] values){
        int p = values.length;
        for(int i = p - 1; i >= 0; i--){
            textViewCollection_2.append(values[i] + ", ");
        }
    }

    private void nArray(String[] values){

        for(String i : values){
            al.add(i);
        }

        for(int k = 2; k < al.size(); k+=2){
            al.remove(k);
        }
        for(String t : al){
            textViewCollection_2.append(t + ", ");
        }
    }

    private void duplicate(String[] values){
        for(String i : values){
            sl.add(i);
        }
        for(String t : sl){
            textViewCollection_2.append(t + ", ");
        }

    }

//    private void sort(String[] values){
//        String[] a = new String[values.length];
//        for(int k = 0; k < values.length; k++){
//            a[k] = values[k];
//        }
//        Arrays.sort(a);
//        for(int i = 0; i < a.length; i++){
//            textViewCollection_2.append(a[i] + ", ");
//        }
//    }
    private void Comp(String[] values){
        for(String i : values){
            al.add(i);
        }
        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String lhs, String rhs) {
                return lhs.compareToIgnoreCase(rhs);
            }
        });
        for(String o : al){
            textViewCollection_2.append(o + ", ");
        }
    }
}
