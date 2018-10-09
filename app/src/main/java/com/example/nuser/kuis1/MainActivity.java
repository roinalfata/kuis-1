package com.example.nuser.kuis1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void berita1 (View view){
        Intent intent = new Intent(this, beritaa.class);
        startActivity(intent);
    }
    public void berita2 (View view){
        Intent intent = new Intent(this, beritab.class);
        startActivity(intent);
    }
}
