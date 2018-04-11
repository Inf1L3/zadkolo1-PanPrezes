package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
    
    int s;
    System.out.println("Podaj numer zadania"); 
    Scanner odczyt = new Scanner(System.in);
     s=odczyt.nextInt();
     switch(s)
     {
     case 1:
         System.out.println("Zadanie 1");
           Zadanie1 x=new Zadanie1();
     break;
     case 2: 
         System.out.println("Zadanie 2");
          Zadanie2 n=new Zadanie2();
         break;
     case 3:
         System.out.println("Zadanie 3");
         break;
     case 4: 
         System.out.println("Zadanie 4");
          
         Osoba p = new Osoba("Patryk","Michałów",20,179,56);
         p.wypisz();
     }
    }

}
