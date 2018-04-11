/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1;

import java.util.Scanner;

/**
 *
 * @author Patryk
 */
public class Zadanie2 {
  
 
public static int fib(int n){
if ((n==1)||(n==2))
return 1;
else
return fib(n-1)+fib(n-2);
}
 
public static void main(String[] args) {
 Scanner odczyt = new Scanner(System.in);
    int n;
System.out.println("Podaj, ktory wyraz ciagu Fibonacciego obliczyc");
n = odczyt.nextInt();
System.out.println(n+"-ty wyraz ciagu Fibonacciego: "+fib(n));
}

    
} 

