package com.blogspot.abimcode.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculateActivity extends AppCompatActivity {

    EditText edt1, edt2;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

    }

    public void tambah(View view) {
        tambah();
    }

    public void kurang(View view) {
        kurang();
    }

    public void kali(View view) {
        kali();
    }

    public void bagi(View view) {
        bagi();
    }

    void tambah () {

        if (edt1.getText().toString().isEmpty() && edt2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Data Tidak Bisa Kosong", Toast.LENGTH_SHORT).show();
        } else {

            int edit1 = Integer.parseInt(edt1.getText().toString());
            int edit2 = Integer.parseInt(edt2.getText().toString());

            double hasilPenjumlahan = edit1 + edit2 ;

            txtHasil.setText(String.valueOf(hasilPenjumlahan));
        }
    }

    void kurang () {

        if (edt1.getText().toString().isEmpty() && edt2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Data Tidak Bisa Kosong", Toast.LENGTH_SHORT).show();
        } else {

            int edit1 = Integer.parseInt(edt1.getText().toString());
            int edit2 = Integer.parseInt(edt2.getText().toString());

            double hasilPengurangan= edit1 - edit2 ;

            txtHasil.setText(String.valueOf(hasilPengurangan));
        }
    }

    void kali () {

        if (edt1.getText().toString().isEmpty() && edt2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Data Tidak Bisa Kosong", Toast.LENGTH_SHORT).show();
        } else {

            int edit1 = Integer.parseInt(edt1.getText().toString());
            int edit2 = Integer.parseInt(edt2.getText().toString());

            double hasilPengalian = edit1 * edit2 ;

            txtHasil.setText(String.valueOf(hasilPengalian));
        }
    }

    void bagi () {

        if (edt1.getText().toString().isEmpty() && edt2.getText().toString().isEmpty()) {
            Toast.makeText(this, "Data Tidak Bisa Kosong", Toast.LENGTH_SHORT).show();
        } else {

            int edit1 = Integer.parseInt(edt1.getText().toString());
            int edit2 = Integer.parseInt(edt2.getText().toString());

            double hasilPembagian = edit1 / edit2 ;

            txtHasil.setText(String.valueOf(hasilPembagian));
        }
    }
}
