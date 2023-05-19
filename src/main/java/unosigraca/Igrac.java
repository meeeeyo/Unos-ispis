/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unosigraca;

/**
 *
 * @author Lale
 */
public class Igrac {
    
    private String ime;
    private String prezime;
    private int brojUtakmica;
    private int goloviZaKlub;
    private boolean aktivnost;
    private Klub klub;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojUtakmica() {
        return brojUtakmica;
    }

    public void setBrojUtakmica(int brojUtakmica) {
        this.brojUtakmica = brojUtakmica;
    }

    public int getGoloviZaKlub() {
        return goloviZaKlub;
    }

    public void setGoloviZaKlub(int goloviZaKlub) {
        this.goloviZaKlub = goloviZaKlub;
    }

    public boolean isAktivnost() {
        return aktivnost;
    }

    public void setAktivnost(boolean aktivnost) {
        this.aktivnost = aktivnost;
    }

    public Klub getKlub() {
        return klub;
    }

    public void setKlub(Klub klub) {
        this.klub = klub;
    }
    
    
    
}
