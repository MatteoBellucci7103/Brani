package com.example.gestionedati;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtTitolo, txtAutore, txtDurata;
    GestioneBrani gb;
    Button inserisci;
    Button visualizza;
    Spinner spnGenere;

    String[] elencoGenere = {"Rock", "Liscio", "Pop", "Dance"};

    @Override   //Quando ho una classe base e un metodo figlio che ne specifica il comportamento. Entrambi aventi lo stesso nome.
    /*  Bundle: pacchetto che contiene dati che servono per poter gestire l'activity e che possono spostarsi da un activity all'altra
        onCreate() : Crea interfaccia grafica
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //Super: prende i metodi della calsse padre
        setContentView(R.layout.activity_main); //prende codice sorgente da appCompactAtctivity

//Recuperiamo i riferimenti dei controlli EditText definiti sopra e che serviranno per salvare i dati inseriti dall’utente,
        txtTitolo =  (EditText) findViewById(R.id.compilaTitolo);
        txtAutore =  (EditText) findViewById(R.id.compilaAutore);
        txtDurata =  (EditText) findViewById(R.id.compilaDurata);
        spnGenere = (Spinner)  findViewById(R.id.compilaGenere);
    /*
        L'ArrayAdapter è un'implementazione dell'interfaccia ListAdapter che
        viene utilizzata per visualizzare un'array di elementi dove ad ogni elemento della lista è associata una TextView
        ArrayAdapter richiede tre argomenti: context(istanza di attività), layout dell'elemento XML e matrice di dati.
    */
        ArrayAdapter<String> spGen = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, elencoGenere);
    //  Un adattatore elenco è un oggetto che adatta una raccolta di oggetti per la visualizzazione in un file ListView.
        spnGenere.setAdapter(spGen);
        //Crea un oggetto gb della
        gb = new GestioneBrani();

        visualizza = (Button)findViewById(R.id.btnVisualizza); //Recupero il riferimento in memoria di quello id e restituisce la vista
        //vista: è il contenitore generale utilizzato dal sistema Android

        visualizza.setOnClickListener(new View.OnClickListener() { //onClickListener è un'interfaccia che sta in ascolto
            @Override
            public void onClick(View v) {   //firma: bisogna passargli l'oggetto in cui deve stare in ascolto

                StringBuilder sb = new StringBuilder(); //Definizione dello string Builder
                Bundle bundle = new Bundle();   //Oggetto che tiene i dati inseriti dall'utente in input

                bundle.putString("Titolo", txtTitolo.getText().toString()); //metodo putString() dell’oggetto bundle per salvare i dati inseriti, recuperati poi con il metodo getText()
                bundle.putString("Autore", txtAutore.getText().toString());
                bundle.putString("Durata", txtDurata.getText().toString());
                // Con i dati memorizzati nel Bundle creiamo l’Intent per la chiamata dell’Activity alla quale li vogliamo passare, associamo all’Intent il Bundle ed infine lanciamo l’Activity :
                Intent intent = new Intent(getApplicationContext(), VisualizzaBrani.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
                                      }
        );

        inserisci = (Button)findViewById(R.id.btnInserisci);

        inserisci.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String testo = spnGenere.getSelectedItem().toString();
                        Toast.makeText((getApplicationContext()), testo, Toast.LENGTH_LONG).show();
                        gb.addBrano(txtTitolo.getText().toString(), txtAutore.getText().toString(), Integer.getInteger(txtDurata.toString()));
                    }
                }
        );
    }

}