package com.example.gestionedati;

import java.util.Date;

public class Brano
{
    private String titolo;
    private String autore;
    //private String genere;
    private Integer durata;


    public Brano(String titolo, String autore, Integer durata) {
        this.titolo = titolo;
        this.autore = autore;
        //this.genere = genere;
        this.durata = durata;
    }

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
