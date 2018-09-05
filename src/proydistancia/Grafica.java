/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistancia;


/**
 *
 * @author Ismael López Martínez
 */
public class Grafica {
    
    
     public static void main(String []args){
     
        DibujaGrafica();
    }
     
     /**
      * Utilizando la función cos(x) (En java Math.cos()), 
      * graficarla en la consola utilizando como punto 
      * un * en el intervalo de – 4 a 4 con un paso de .2. 
      * Codificarlo sin utilizar programación orientada a objetos ni arreglos.
      */
     public static void DibujaGrafica(){
         for(double x=-4;x<=4;x+=.2 ){
               
           /*System.out.printf("x:=%f cos(x)=%f",x,cosx);
            System.out.println();   */
            dibujaCoseno(x,Math.cos(x));
         
         }
         
     }
     
     /*
     Va de 0 a x poniendo espacios para simular eje de x
     */
     private static void dibujaCoseno(double x, double y){
     //System.out.printf("{cos(%f)=%f}",x,y);
       //System.out.print("[");
         for(double i=0;i<=Math.abs(x);i+=.2)
             System.out.print(" ");
         System.out.printf("x cos(%f)=%f",x,y);
         System.out.println();


     }
    
}
