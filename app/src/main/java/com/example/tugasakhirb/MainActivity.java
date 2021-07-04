package com.example.tugasakhirb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Button button;
     EditText KodeBarang;
    EditText JumlahPesanan;
    EditText Alamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KodeBarang = findViewById(R.id.KodeBarang);
        JumlahPesanan = findViewById(R.id.JumlahPesanan);
        Alamat = findViewById(R.id.Alamat);




        button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), NotifikasiPelanggan.class);
                startActivity(i);

            }
        });
    };
}