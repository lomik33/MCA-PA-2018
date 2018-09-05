/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proydistancia;
    import java.util.Scanner;


/**
 *
 * @author CoreMac
 */
public class Temperatura {
 
    


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("Dame la temperatura");
        int C = lee.nextInt();
        Temperatura e= new Temperatura();
        float resultado=e.calculaFahrenheit(C);
        System.out.println(resultado);
        
        
    }
    
    public float calculaFahrenheit(int centigrados){
    
        float centinela=32 + (9 * centigrados / 5);
        return centinela;
    }
    
}
