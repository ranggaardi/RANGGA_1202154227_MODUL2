package com.example.android.rangga_1202154227_modul2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TakeAwayActivity extends AppCompatActivity {
    private EditText name, no, alamat,cat;
    private Button pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
        ActionBar back = getSupportActionBar();
        back.setDisplayShowHomeEnabled(true);
        back.setDisplayHomeAsUpEnabled(true);

        name = (EditText) findViewById(R.id.eNama);
        no = (EditText) findViewById(R.id.ePhone);
        alamat = (EditText) findViewById(R.id.eAlamat);
        cat = (EditText) findViewById(R.id.eCatatan);
        pesan = (Button) findViewById(R.id.bPilih);

    }
    public void pesan(View view){
        Intent intent = new Intent(TakeAwayActivity.this,DaftarMenuActivity.class);
        String nam = name.getText().toString();
        String hp = no.getText().toString();
        String ala = alamat.getText().toString();
        String catat = cat.getText().toString();
        intent.putExtra("nama", nam);
        intent.putExtra("No", hp);
        intent.putExtra("mat", ala);
        intent.putExtra("tan",catat);
        startActivity(intent);
    }

}
