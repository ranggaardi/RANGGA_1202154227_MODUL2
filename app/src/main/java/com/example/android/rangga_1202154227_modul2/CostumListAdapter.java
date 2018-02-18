package com.example.android.rangga_1202154227_modul2;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by ranggaardi on 2/16/2018.
 */

class CostumListAdapter extends RecyclerView.Adapter<CostumListAdapter.MyViewHolder> {

    private ArrayList<String> arrayListMenu; //Digunakan untuk Judul
    private ArrayList<String> arrayListsH; //Digunakan untuk Menu
    private ArrayList<Integer> gambar;

    //Membuat Konstruktor pada Class RecyclerViewAdapter
    CostumListAdapter(ArrayList<String> arrayListMenu, ArrayList<String> arrayLists, ArrayList<Integer> Gambar) {
        this.arrayListMenu = arrayListMenu;
        this.arrayListsH = arrayLists;
        this.gambar = Gambar;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView makanan, hrg;
        private ImageView gambar;
        private LinearLayout ItemList;

        MyViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            makanan = itemView.findViewById(R.id.txtNama);
            hrg = itemView.findViewById(R.id.txtHarga);
            gambar = itemView.findViewById(R.id.image_view);
            ItemList = itemView.findViewById(R.id.linearLayout);
        }
    }

    public CostumListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View click = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent, false);
        RecyclerView.ViewHolder clk = new MyViewHolder(click);
        return (MyViewHolder) clk;
    }

    public void onBindViewHolder(final CostumListAdapter.MyViewHolder holder, final int position) {
        //Memanggil Nilai/Value Pada View-View Yang Telah Dibuat pada Posisi Tertentu
        final String menu = arrayListMenu.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final String harga = arrayListsH.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        final Integer gmb = gambar.get(position);//Mengambil data sesuai dengan posisi yang telah ditentukan
        holder.makanan.setText(menu);
        holder.hrg.setText(harga);
        holder.gambar.setImageResource(gmb); // Mengambil gambar sesuai posisi yang telah ditentukan
        //Membuat Aksi Saat Judul Pada List ditekan
        holder.makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        //Membuat Aksi Saat List Ditekan
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailMenuActivity.class);
                String komposisi;
                switch (position){
                    case 0:
                        intent.putExtra("mkn", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListsH.get(position));
                        intent.putExtra("gambar", gambar.get(position));
                        komposisi = "Nasi, bumbu pecel, sayur, tempe, telor";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("mkn", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListsH.get(position));
                        intent.putExtra("gambar", gambar.get(position));
                        komposisi = "Nasi, Telur, Daging, Sambal Pecel, Kuah Rawon";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("mkn", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListsH.get(position));
                        intent.putExtra("gambar", gambar.get(position));
                        komposisi = "Nasi, Daging, Kecamba, Kuah Rawon";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("mkn", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListsH.get(position));
                        intent.putExtra("gambar", gambar.get(position));
                        komposisi = "Lontong, Babat, Sambal Rujak, Kuah Soto";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("mkn", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListsH.get(position));
                        intent.putExtra("gambar", gambar.get(position));
                        komposisi = "Nasi, Telor, Tempe, Sambal Khas Banyuwangi, Sayur";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("mkn", arrayListMenu.get(position));
                        intent.putExtra("harga", arrayListsH.get(position));
                        intent.putExtra("gambar", gambar.get(position));
                        komposisi = "Nasi, Daging Ayam, Telur, Kuah Ayam,";
                        intent.putExtra("komposisi", komposisi);
                        view.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }


    public int getItemCount() {
        return arrayListMenu.size();
    }
}