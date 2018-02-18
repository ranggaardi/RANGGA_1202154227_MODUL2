package com.example.android.rangga_1202154227_modul2;


import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class DaftarMenuActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> menu;
    private ArrayList<String> harga;
    private ArrayList<Integer> gambar;

    private String menu_makanan[] = {"PECEL","PECEL RAWON","RAWON","RUJAK SOTO", "SEGO TEMPONG","SOTO"},
            decs_harga[] = {"Harga: Rp.15.000","Harga: Rp.20.000","Harga: Rp.15.000","Harga: Rp.17.000","Harga: Rp.13.000","Harga: Rp.25.000"};
    int img_src[] = {R.drawable.pecel, R.drawable.pecel_rawon, R.drawable.rawon, R.drawable.rujak_soto, R.drawable.sego_tempong, R.drawable.soto};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        ActionBar back = getSupportActionBar();
        back.setDisplayShowHomeEnabled(true);
        back.setDisplayHomeAsUpEnabled(true);

        menu = new ArrayList<>();
        harga = new ArrayList<>();
        gambar = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerview);
        for (int w=0; w<menu_makanan.length; w++) {
            gambar.add(img_src[w]);
            menu.add(menu_makanan[w]);
            harga.add(decs_harga[w]);
        }

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new CostumListAdapter(menu, harga, gambar);
        recyclerView.setAdapter(adapter);
    }

}
