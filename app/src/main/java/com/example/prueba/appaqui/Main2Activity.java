package com.example.prueba.appaqui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void restaurante(View view){
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }
    public void dicoteca(View view){
        Intent intent = new Intent(Main2Activity.this, Main4Activity.class);
        startActivity(intent);
    }
    public void karaoke(View view){
        Intent intent = new Intent(Main2Activity.this, Main5Activity.class);
        startActivity(intent);
    }
    public void cine(View view){
        Intent intent = new Intent(Main2Activity.this, Main6Activity.class);
        startActivity(intent);
    }
    public void cafeteria(View view){
        Intent intent = new Intent(Main2Activity.this, Main7Activity.class);
        startActivity(intent);
    }
}
