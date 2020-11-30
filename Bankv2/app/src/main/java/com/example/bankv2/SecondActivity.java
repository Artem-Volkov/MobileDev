package com.example.bankv2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends Activity{

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.second);

            // получаем экземпляр элемента ListView
            ListView listView = findViewById(R.id.countriesList);

// определяем строковый массив
            final String[] catNames = new String[] {
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00",
                    "Москва ул. Вавилова, д. 7 \n" +
                            "Отделение работает                                  9:00-00:00"

            };

// используем адаптер данных
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1, catNames);

            listView.setAdapter(adapter);
        }
    }

