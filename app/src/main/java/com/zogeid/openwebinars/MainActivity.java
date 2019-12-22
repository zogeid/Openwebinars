package com.zogeid.openwebinars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.tituloMain);
        texto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Hola Pepota", Toast.LENGTH_SHORT).show();
    }

    public void irASecondActivity(View view) {
        Toast.makeText(MainActivity.this, "yendo a página 2", Toast.LENGTH_SHORT).show();
        Intent intent2activity = new Intent(this, SecActivity.class);
        intent2activity.putExtra("numero", 5);
        intent2activity.putExtra("nombre", "Diegolas");
        startActivity(intent2activity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG ", "on start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG ", "on resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
