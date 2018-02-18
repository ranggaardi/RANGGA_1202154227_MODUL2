package com.example.android.rangga_1202154227_modul2;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        ActionBar back = getSupportActionBar();
        back.setDisplayShowHomeEnabled(true);
        back.setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        String menu = getIntent().getStringExtra("mkn");
        String price = getIntent().getStringExtra("harga");
        String komposisi = getIntent().getStringExtra("komposisi");
        Integer image = getIntent().getIntExtra("gambar", 0);


        TextView txtMenu = findViewById(R.id.namaMenu);
        TextView txtPrice = findViewById(R.id.price);
        TextView txtkomposisi = findViewById(R.id.listkomposisi);
        ImageView images = findViewById(R.id.imageMenu);


        txtMenu.setText(menu);
        txtPrice.setText(price);
        txtkomposisi.setText(komposisi);
        images.setImageResource(image);
    }
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    }

