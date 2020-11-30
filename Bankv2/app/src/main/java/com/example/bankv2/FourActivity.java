package com.example.bankv2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class FourActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four);
    }
    public void Click3(View view) {

        //Создаем переход:
        Intent intent=new Intent(FourActivity.this,MainActivity.class);
        //Запускаем его при нажатии:
        startActivity(intent);
    }
}
