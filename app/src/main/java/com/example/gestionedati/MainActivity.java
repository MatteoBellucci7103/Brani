package com.example.gestionedati;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtTitolo, txtAutore, txtDurata;
    GestioneBrani gb;
    Button inserisci;
    Button visualizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); ///prende codice sorgente da appCompactAtctivity

        txtTitolo= findViewById(R.id.compilaTitolo);
        txtAutore= findViewById(R.id.compilaAutore);
        txtDurata= findViewById(R.id.compilaDurata);
        gb = new GestioneBrani();

        visualizza = (Button)findViewById(R.id.btnVisualizza);

        visualizza.setOnClickListener(new View.OnClickListener() {
                        @Override
                            public void onClick(View v) {

                                          }
                                      }
        );

        inserisci = (Button)findViewById(R.id.btnInserisci);

        inserisci.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        gb.addBrano(txtTitolo.getText().toString(), txtAutore.getText().toString(), Integer.getInteger(txtDurata.toString()));
                    }
                }
        );


    }


}