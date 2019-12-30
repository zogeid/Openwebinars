package com.zogeid.openwebinars;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.View;

public class DinamicFragmentBasicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinamic_fragment_basic);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            boolean b = false;

            @Override
            public void onClick(View view) {
                //Modificar fragmente de edntro del content

                Fragment f1 = null;
                if(b) {
                     f1 = new FirstFragment();
                }else{
                    f1 = new SecondFragment();
                }
                b = !b;
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentDinamicFragmentID, f1)
                        .commit();
            }
        });

        //Recoger content y cargar fragmento
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.contentDinamicFragmentID, new FirstFragment())
                .commit();
    }
}