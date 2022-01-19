package com.example.gestionedati;

import java.util.Date;

public class Brano
{
    private String titolo;
    private String autore;
    private Integer durata;

            //Metodo costruttore che mi permette di creare nuove istanze
    public Brano(String titolo, String autore, Integer durata) {
        // Inizializzazioni dello stato delle nuove istanze
        this.titolo = titolo;
        this.autore = autore;
        this.durata = durata;
    }
            //Metodi setter e getter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }
}
