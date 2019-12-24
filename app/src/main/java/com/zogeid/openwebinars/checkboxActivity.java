package com.zogeid.openwebinars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class checkboxActivity extends AppCompatActivity {
    RadioGroup radiog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        radiog = findViewById(R.id.radioGroup1);
    }

    public void checkboxClick(View view) {
        CheckBox check = (CheckBox) view;
        if (check.isChecked()){
            switch (check.getId()){
                case R.id.checkBox1:
                    Toast.makeText(this, "check1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.checkBox2:
                    Toast.makeText(this, "check2", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    public void radioClick(View view) {
            switch (view.getId()){
                case R.id.radio1:
                    Toast.makeText(this, "radio1", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radio2:
                    Toast.makeText(this, "radio2", Toast.LENGTH_SHORT).show();
                    break;
            }
    }

    public void whatRadio(View view) {
        switch(radiog.getCheckedRadioButtonId()){
            case R.id.radio1:
                Toast.makeText(this, "Radio 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio2:
                Toast.makeText(this, "Radio 2", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(this, "None", Toast.LENGTH_SHORT).show();
        }
    }
}
