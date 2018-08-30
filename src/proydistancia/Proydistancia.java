/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistancia;

/**
 *
 * @author CoreMac
 */
public class Proydistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   //     System.out.println(calcularDistancia(6,4,2,1));
   // se pidio que en 100 pasos se generaran numeros entre -5 y 5
   double num_valores=100;
   double paso=(5.0-(-5.0))/num_valores;
   for(double i=-5.0;i<=5.0;i+=paso){
    
    System.out.println("o("+i+") = "+
            Proydistancia.calcularIntervalo(i));
    }
  }
    
    /**
     * Devulve la distancia entre dos puntos arida 4 (4 parámetros)
     * Formula 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return 
     */
    public static double calcularDistancia(double x1, double y1, double x2, double y2){
        double centinela=0d;
        centinela=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        //Es lo mismo usando la funcion pow
        //centinela=Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        return centinela;
        
    }
    
    public static double calcularIntervalo(double x){
        double centinela=0d;
        centinela=Math.exp(-.5*Math.pow(x,2))/Math.sqrt(2*Math.PI);
                
                return centinela;
    }
    
    public static double raizBicepcion(double x){
        double centinela=0D;
        return centienla;
    }
    
}
