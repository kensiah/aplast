package com.example.miscellaneous;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        changeLanguage();
        setContentView(R.layout.activity_main);
    }

    private void changeLanguage(){
        Resources res = getResources();
        DisplayMetrics metrics = res.getDisplayMetrics();
        android.content.res.Configuration config = res.getConfiguration();
        config.setLocale(new Locale("zh"));
        res.updateConfiguration(config,metrics);
    }
}
