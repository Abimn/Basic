package com.blogspot.abimcode.basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InputDataActivity extends AppCompatActivity {

    /*TODO 1 Deklarasi Vriable*/
    EditText edtInputData;
    Button btnInputData;
    TextView txtInputData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);
        /*TODO 2 Inisialisasi id dari Widget*/
        edtInputData = (EditText) findViewById(R.id.edtInputData);
        btnInputData = (Button) findViewById(R.id.btnInputData);
        txtInputData = (TextView) findViewById(R.id.txtInputData);

        /*TODO 3 Buat Event Klik pada Button*/
        btnInputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /*TODO 4 Buat String untuk menangkap inputan dari dan menguubahnya ke String*/
                String input = edtInputData.getText().toString();

                /*TODO 5 Buat kondisi jika data kosong dan jika data berhasil di input*/
                if (input.isEmpty()) {
                    edtInputData.setError("Data Harus di Isi");
                } else {
                    Toast.makeText(InputDataActivity.this, "SUKSES!", Toast.LENGTH_SHORT).show();

                    /*TODO 6 Menampilkan data inputan di set pada Textview*/
                    txtInputData.setText(input);

                }
            }
        });
    }
}
