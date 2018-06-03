package com.blogspot.abimcode.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HitungPPActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_pp);

        edtPanjang = (EditText) findViewById(R.id.edtPanjang);
        edtLebar = (EditText) findViewById(R.id.edtLebar);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
    }

    // Buat onClick pada Button Hitung
    public void btnHitung(View view) {
        // Panggil Method
        luas();
    }

    //Buat Method luas
    void luas(){
        // Kondisi jika editText kosong maka tampilkan Toast
        if(edtPanjang.getText().toString().isEmpty() && edtLebar.getText().toString().isEmpty()) {
            Toast.makeText(this, "Data Tidak Bisa Kosong", Toast.LENGTH_SHORT).show();
        } else {
            // Buat int untuk menangkap Inputan editText
            int panjang = Integer.parseInt(edtPanjang.getText().toString());
            int lebar = Integer.parseInt(edtLebar.getText().toString());
            // Buat logicnya
            int luaspersegi = panjang * lebar;
            // Untuk menampilkan hasil dari inputan
            txtHasil.setText(String.valueOf(luaspersegi));
        }
    }


}
