package com.example.android.rangga_1202154227_modul2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity {
    String mSpinner = "";
    private EditText cus;
    private Spinner nMeja;
    private Button pesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        ActionBar back = getSupportActionBar();
        back.setDisplayShowHomeEnabled(true);
        back.setDisplayHomeAsUpEnabled(true);

        nMeja = (Spinner) findViewById(R.id.sMeja);
        pesanan = (Button) findViewById(R.id.bPilihD);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        if ( nMeja!= null){
            nMeja.setAdapter(adapter);
        }
    }
    public void pilih(View view) {
        String noMeja = nMeja.getSelectedItem().toString();

        if (noMeja.equalsIgnoreCase("Meja 1")){
            Intent intent = new Intent(DineInActivity.this, DaftarMenuActivity.class);
            Toast.makeText(this, "Meja 1 telah terpilih", Toast.LENGTH_LONG).show();
            startActivity(intent);
        }else  if (noMeja.equalsIgnoreCase("Meja 2")){
            Intent intent = new Intent(DineInActivity.this, DaftarMenuActivity.class);
            Toast.makeText(this, "Meja 2 telah terpilih", Toast.LENGTH_LONG).show();
            startActivity(intent);
        }else  if (noMeja.equalsIgnoreCase("Meja 2")){
            Intent intent = new Intent(DineInActivity.this, DaftarMenuActivity.class);
            Toast.makeText(this, "Meja 3 telah terpilih", Toast.LENGTH_LONG).show();
            startActivity(intent);

        }
    }

}
