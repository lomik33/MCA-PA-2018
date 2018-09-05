/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistancia;

import java.util.Scanner;


/**
 *
 * @author Ismael López Martínez
 */
public class Biseccion {

    public static void main(String []args){
         // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("Teclee el nùmero al que le desea sacar la raiz cuadrada por bisección:");
        int x = lee.nextInt();    
        System.out.println(calcularRaizCuadradaBiseccion(x));
    }
    
    
   /***
     * a partir de un parametro se calcula raiz cuadrada
     * con el método de biseccion
     * f(x)=n-(x^2)=0
     * n=a+b/2
     * @param x
     * @return 
     */
    public static double calcularRaizCuadradaBiseccion(double x){
        
        double centinela=0d;
        double xa=0;
        double xb=x;
        //(a+b)/2
        double c=0;
        double tol=.00001D;
        double fc=0;
        
        do {
            c = prom(xa,xb);
            fc = f(x,c);
           /*    
            System.out.printf("xa=%f xb=%f xc=%f fc=%f",xa,xb,c,fc);
            System.out.println();
            System.out.println("f("+c+")="+fc);
           */
         if (fc < 0) {
            xb = c;
         } else {
            xa = c;
         }
         
      } while ( Math.abs(fc) >= tol);
        centinela=c;
        return centinela;
    }
    
    /***
     * f(x)=n-(x^2)=0
     * @param x
     * @param n
     * @return 
     */
    public static double f( double n, double x){
      double centinela= n-Math.pow(x, 2);
      return centinela;
    }
    
    /***
     * Calcula formula a+b/2
     * @param a
     * @param b 
     * @return  
     */
    public static double prom(double a, double b){
        return (a+b)/2.0D;
    }
    
}
