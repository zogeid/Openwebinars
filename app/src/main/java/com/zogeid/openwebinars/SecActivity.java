package com.zogeid.openwebinars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
    }

    public void mostrarMensaje(View view) {
        Toast.makeText(this, "Hola Pololo!", Toast.LENGTH_SHORT).show();
    }
}
