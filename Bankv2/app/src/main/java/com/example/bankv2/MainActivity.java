package com.example.bankv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance().format(calendar.getTime());

        TextView textView = findViewById(R.id.data);
        textView.setText(currentDate);


    }


    public void Click(View view) {

        //Создаем переход:
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }

    public void Click1(View view){
        Intent intent=new Intent(MainActivity.this,ThreeActivity.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }

    public void Click2(View view) {

        //Создаем переход:
        Intent intent=new Intent(MainActivity.this,FourActivity.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }
}