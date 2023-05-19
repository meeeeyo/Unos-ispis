/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unosigraca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lale
 */
public class Start {
    
    private List<Igrac> igraci;
    
    
    public Start() {
        
       igraci = new ArrayList<>(); 
       Pomocno.ulaz = new Scanner(System.in);
       
       ucitajIgrace();
       
       ispisIgraca();
       
       Pomocno.ulaz.close();
        
        
    }
    

    public static void main(String[] args) {
    new Start();
        
    }

    
     private void ucitajIgrace() {
         do{
             System.out.println("Unos novog igrača");
             ucitajIgraca();
         }while(!Pomocno.ucitajString("Gotov s unosom igrača?(x)?").equalsIgnoreCase("x"));
     }
     
     
    private void ucitajIgraca() {
        
        Igrac i = new Igrac();
        i.setIme(Pomocno.ucitajString("Upiši ime igrača"));
        i.setPrezime(Pomocno.ucitajString("Upiši prezime igrača"));
        i.setBrojUtakmica(Pomocno.ucitajInt("Unesi broj odigranih utakmica igrača"));
        i.setGoloviZaKlub(Pomocno.ucitajInt("Unesi broj golova igrača za klub"));
        i.setAktivnost(Pomocno.ucitajBoolean("Igrač je aktivan (da / ne)"));
        i.setKlub(ucitajKlub());
        igraci.add(i);
        
        
    }

    private Klub ucitajKlub() {
        Klub k = new Klub();
        k.setNaziv(Pomocno.ucitajString("Upiši naziv kluba"));
        k.setDržava(Pomocno.ucitajString("Upiši naziv države iz koje klub dolazi"));
        k.setLiga(Pomocno.ucitajString("Upiši ligu u kojoj se klub natječe"));
        k.setBrojTrofeja(Pomocno.ucitajInt("Unesi broj osvojenih trofeja kluba"));
        return k;
        
        
        
        
        
    }

    private void ispisIgraca() {
            for (Igrac i : igraci){
                System.out.println(i.getIme() + " " + i.getPrezime() + ": " + i.getGoloviZaKlub() + " zabijenih golova za klub.");
            }
    }

   
}
