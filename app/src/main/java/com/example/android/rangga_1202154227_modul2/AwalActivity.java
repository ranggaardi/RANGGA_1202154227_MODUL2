package com.example.android.rangga_1202154227_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AwalActivity extends AppCompatActivity {
    private Button pesan;
    private RadioGroup menu;
    private RadioButton dine, take;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        pesan = (Button) findViewById(R.id.Bpilih);
        dine = (RadioButton) findViewById(R.id.rdDine);
        take = (RadioButton) findViewById(R.id.rdTake);
        menu = (RadioGroup) findViewById(R.id.RB);
    }
    public void pilih(View view) {
        int selecteditem = menu.getCheckedRadioButtonId();

        if (selecteditem == dine.getId()) {
            Intent intent = new Intent(AwalActivity.this, DineInActivity.class);
            startActivity(intent);
        } else if (selecteditem == take.getId()) {
            Intent intent = new Intent(AwalActivity.this, TakeAwayActivity.class);
            startActivity(intent);
        }
    }

}

