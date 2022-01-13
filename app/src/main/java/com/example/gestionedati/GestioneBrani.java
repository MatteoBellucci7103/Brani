package com.example.gestionedati;

import java.util.ArrayList;

public class GestioneBrani {
    ArrayList<Brano> listaBrani;

    public GestioneBrani()
    {
        listaBrani= new ArrayList<Brano>();
    }

    public void addBrano(String titolo, String autore, int durata)
    {
        Brano br = new Brano(titolo, autore, durata);
        listaBrani.add(br);
    }
}
