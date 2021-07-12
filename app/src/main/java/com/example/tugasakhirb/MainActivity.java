package com.example.tugasakhirb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button button; // variabel id yang akan digunakann
     EditText KodeBarang;// variabel id yang akan digunakann
     EditText JumlahPesanan;// variabel id yang akan digunakann
     EditText Alamat;// variabel id yang akan digunakann
    // jika tidak diberi id maka program akan bingung siapa yang akan dipanggil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KodeBarang = findViewById(R.id.KodeBarang);//  manggil id agar bisa digunakan
        JumlahPesanan = findViewById(R.id.JumlahPesanan);//  manggil id agar bisa digunakan
        Alamat = findViewById(R.id.Alamat); //  manggil id agar bisa digunakan
        // jika tidak diberi code di atas maka jika kita mengisi pesanan tidak akan bisa dan aplikasi akan force close



        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() { // agar button berfungsi dan bisa digunakan
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NotifikasiPelanggan.class);
                startActivity(i);// agar aplikasi berkerja berpindah layout kedua
                   // jika tidak ada code yang di atas ini maka button tidak bisa berkerja dan aplikasi tidak akan berpindah layout
            }
        });
    };
}