package com.kotaku.appcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText angka_pertama,angka_kedua,hasil;
    private Button tambah,kurang,kali,bagi,bersihkan;
    private int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama=(EditText) findViewById(R.id.angka_pertama);
        angka_kedua=(EditText) findViewById(R.id.angka_kedua);
        hasil=(EditText) findViewById(R.id.hasil);

        tambah=(Button) findViewById(R.id.btn_tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(function_tambah (a,b));
            }
        });
        kurang=(Button) findViewById(R.id.btn_kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(function_kurang (a,b));
            }
        });
        kali=(Button) findViewById(R.id.btn_kali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(function_kali (a,b));
            }
        });
        bagi=(Button) findViewById(R.id.btn_bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.valueOf(angka_pertama.getText().toString());
                b = Integer.valueOf(angka_kedua.getText().toString());

                hasil.setText(function_bagi (a,b));
            }
        });
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("");
            }
        });
    }

    String function_tambah(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 + angka2;
        return String.valueOf(hasil_kalkulasi);
    }

    String function_kurang(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 - angka2;
        return String.valueOf(hasil_kalkulasi);
    }

    String function_kali(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 * angka2;
        return String.valueOf(hasil_kalkulasi);
    }

    String function_bagi(int angka1, int angka2) {
        int hasil_kalkulasi = angka1 / angka2;
        return String.valueOf(hasil_kalkulasi);
    }
}