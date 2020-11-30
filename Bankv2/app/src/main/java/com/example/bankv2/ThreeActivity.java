package com.example.bankv2;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ThreeActivity extends Activity{
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);

        // получаем экземпляр элемента ListView
        ListView listView = findViewById(R.id.listview);

// определяем строковый массив
        final String[] catNames = new String[] {
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",
                "USD                                                                         75,8",

        };

// используем адаптер данных
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);

        listView.setAdapter(adapter);


        //webView = (WebView) findViewById(R.id.webview);
        //webView.setWebViewClient(new WebViewClient());
        //webView.loadUrl("http://www.google.com");

    }
    /*@Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }*/
}