package com.example.gestionedati;

import java.util.ArrayList;

public class GestioneBrani {
    ArrayList<Brano> listaBrani;

    public GestioneBrani()
    {
        listaBrani= new ArrayList<Brano>();
    } //Creo un arrayList di tipo brano

    public void addBrano(String titolo, String autore, int durata)  //Metodo al quale passo i seguenti attributi
    {
        Brano br = new Brano(titolo, autore, durata);  //Creo un oggetto br di tipo Brano
        listaBrani.add(br);     //Aggiungo all'arrayList l'oggetto br
    }
}
