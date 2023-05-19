/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unosigraca;

import java.util.Scanner;

/**
 *
 * @author Lale
 */
public class Pomocno {
    
    public static Scanner ulaz;
    
    public static String ucitajString(String poruka) {
        String s=new String();
        while(true){
            System.out.println(poruka);
            s = Pomocno.ulaz.nextLine();
            if(!s.trim().isBlank()){
                return s;
            }
            System.out.println("Obavezan unos");
        }
    }
    
    public static boolean ucitajBoolean(String poruka) {
    while (true) {
        System.out.println(poruka);
        String input = Pomocno.ulaz.nextLine();
        if (input.equalsIgnoreCase("da")) {
            return true;
        } else if (input.equalsIgnoreCase("ne")) {
            return false;
        } else {
            System.out.println("Neispravan unos, unijeti da ili ne");
        }
    }
}
    
    public static int ucitajInt(String poruka){
       int i=0;
       while(true){
           System.out.println(poruka);
           try {
               i=Integer.parseInt(Pomocno.ulaz.nextLine());
               if(i<0){
                   System.out.println("Broj mora biti pozitivan");  
               }else{
                   break;
               }
           } catch (Exception e) {
               System.out.println("greška");   
           }
           
       }
       return i;
       
   } 
    
}
