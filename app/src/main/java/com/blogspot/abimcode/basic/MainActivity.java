package com.blogspot.abimcode.basic;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO 1
    // Deklarasi variable
    TextView txtName;
    Button btnInfo, btnInput, btnMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 2
        // Inisialisasi id pada Widget
        txtName = (TextView) findViewById(R.id.txtName);
        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnInput = (Button) findViewById(R.id.btnInput);
        btnMulai = (Button) findViewById(R.id.btnMulai);

        // TODO 3
        //buat get intent untuk menangkap kiriman intent dari IntroActivity
        Intent getData = getIntent();
        txtName.setText(getData.getStringExtra("nama"));

        // TODO 4
        // Buat Event Klik pada btnInfo
        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat Toast pada btnInfo
                Toast.makeText(MainActivity.this, "Aplikasi ini dibuat atas dasar sudah jarangnya anak jaman sekarang membaca iqra, degan adanya aplikasi ini diharapkan untuk anak-anak agar mengetahui huruf hijaiyah", Toast.LENGTH_SHORT).show();
            }
        });

        // TODO 5
        // Buat Event Klik pada btnInput
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Buat kelas Intent pada btnInput, buat acitivity baru terlebih dahulu
                startActivity(new Intent(MainActivity.this, InputDataActivity.class));
            }
        });

        // TODO 6
        // Buat Event AlertDialog pada
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // Tambahkan Icon untuk Alert
                builder.setIcon(R.mipmap.ic_launcher);
                // Tambahkan Judul Alert
                builder.setTitle("SIAP UNTUK MULAI BELAJAR?");
                // Tambahkan Pesan untuk Alert
                builder.setMessage("Mari Kita Mulai dengan Mengucap Bissmillah :)");
                // Buat alert button ok
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }

                });
                // Jangan lupa di show
                builder.show();

            }
        });

    }
}
