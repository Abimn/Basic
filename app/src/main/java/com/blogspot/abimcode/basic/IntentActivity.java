package com.blogspot.abimcode.basic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity {

    // TODO 1
    // Deklarasi Variable
    EditText edtName;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        // TODO 2
        // Inisialisasi id dari 2 Widget
        edtName = (EditText) findViewById(R.id.edtName);
        btnOk = (Button) findViewById(R.id.btnOk);

        // TODO 3
        // Buat Event Klik pada Button
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO 4
                // Buat String untuk mendapatkan data dari edit text
                String nama = edtName.getText().toString();

                // TODO 5
                // Buat kondisi
                if (nama.isEmpty()) {
                    edtName.setError("Data Tidak Boleh Kosong");
                } else {
                    // TODO 6
                    // IMPLEMENTASI INTENT, panggil kelas Intent lalu buat objek Intent
                    Intent kirimData = new Intent(IntentActivity.this, MainActivity.class);
                    // Mengirim data dengan key "nama"
                    kirimData.putExtra("nama", nama);
                    // Setiap menggunakan kelas intent harus menggakan startActivity untuk memulai kelas
                    startActivity(kirimData);
                    // Gunakan finish() untuk mengakiri Activity
                    finish();
                }
            }
        });

    }
}
