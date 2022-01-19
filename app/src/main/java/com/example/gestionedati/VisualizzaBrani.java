package com.example.gestionedati;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class VisualizzaBrani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizza_brani);
        /*richiama nel codice i tre controlli TextView in cui visualizzeremo i dati inseriti dall’utente ed inviati dall’Activity di default attraverso il Bundle*/
        TextView autore = (TextView) findViewById(R.id.txtAutore);
        TextView titolo = (TextView) findViewById(R.id.txtTitolo);
        TextView durata = (TextView) findViewById(R.id.txtDurata);
        //Recuperiamo i valori dal Bundle tramite il metodo getString() e li impostiamo rispettivamente negli oggetti TextView autore, titolo e durata.
        Bundle bundle = this.getIntent().getExtras();
        autore.setText(bundle.getString("Autore"));
        titolo.setText(bundle.getString("Titolo"));
        durata.setText(bundle.getString("Durata"));

    }
}