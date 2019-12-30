package com.zogeid.openwebinars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tituloMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tituloMain = findViewById(R.id.tituloMain); //recupera el elemento por ID y
        tituloMain.setOnClickListener(this); //le asigna manualmente un listener
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG ", "on start");
    }

    @Override
    public void onClick(View v) { //Tenemos override, habrá que gestionar con ifs que accion lanzamos
        Toast.makeText(MainActivity.this, "Hola Pepota", Toast.LENGTH_SHORT).show();
    }

    public void irASecondActivity(View view) {
        Toast.makeText(MainActivity.this, "yendo a página 2", Toast.LENGTH_SHORT).show();
        Intent intent2activity = new Intent(this, SecActivity.class); //elegimos acti para el intent
        intent2activity.putExtra("numero", 5); //añadimos 1 param
        intent2activity.putExtra("nombre", "Diegolas"); //añadimos 1 param
        startActivity(intent2activity); //lanzamos el acti
    }


    public void irARelativeActivity(View view) {
        Intent i = new Intent(this, RelativeLayoutActivity.class);
        startActivity(i);
    }

    public void irA(View view) {
        //Intent i = new Intent(this, checkboxActivity.class);
        Intent i = new Intent(this, DinamicFragmentBasicActivity.class);
        startActivity(i);
    }
}