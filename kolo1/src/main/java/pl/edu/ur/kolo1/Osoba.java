/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;


/**
 *
 * @author Patryk
 */
public class Osoba {
private String imie;
private String nazwisko;
private int wiek;
private int wzrost;
private int waga;

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public Osoba(String imie, String nazwisko, int wiek, int wzrost) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
    }


    public void wypisz() {
        System.out.println( "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", wiek=" + wiek + ", wzrost=" + wzrost + ", waga=" + waga + '}');
    
    }
 

  
 

         
    
}
