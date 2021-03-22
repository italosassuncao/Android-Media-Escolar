package com.example.mdiaescolar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtNota1 = findViewById(R.id.edtNota1);
        EditText edtNota2 = findViewById(R.id.edtNota2);
        TextView txtMedia = findViewById(R.id.txtMedia);
        TextView txtSituacao = findViewById(R.id.txtSituacao);


        final Button btnCalcular = findViewById(R.id.btnCalcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            public void onClick(View v) {
                float media = (Float.parseFloat(edtNota1.getText().toString()) + Float.parseFloat(edtNota2.getText().toString())) /2;
                String sMedia = "Média: "+ media;
                txtMedia.setText(sMedia);
                if (media >= 6) {
                    txtSituacao.setTextColor(getColor(R.color.blue));
                    txtSituacao.setText("Aprovado");
                } else {
                    txtSituacao.setTextColor(getColor(R.color.red));
                    txtSituacao.setText("Reprovado");
                }
            }
        });

        final Button btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}