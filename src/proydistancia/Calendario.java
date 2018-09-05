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
public class Calendario {
    
    
    public static void main(String []args){
     
        // TODO code application logic here
        Scanner lee = new Scanner(System.in);
        System.out.println("Dame el mes para dibujar calendario gregoriano:");
        int m = lee.nextInt();
        System.out.println("Dame el año para dibujar calendario gregoriano:");
        int y = lee.nextInt();
        DibujaCalendario(m,y);
    }
    
  
    
    /***
     * 
     * @param d
     * @param m
     * @param y 
     * * Escriba un programa que tome una fecha expresada en mes (m), día (d) y año (y). Calcule el día
         de la semana que fue o será. Tome las siguientes consideraciones:
         a. mes 1 es enero, 2 es febrero, etc.
         b. La salida que arroja es del 0 al 6 tomando 0 como domingo, 1 lunes, y así
         sucesivamente.
        c. Use las siguientes fórmulas para calcular el calendario Gregoriano.
     */
    
    public static int calcularDiaSemana(int d, int m, int y){
     
     //y0 = y – entero((14 - m) / 12)
     int y0=y-((14-m)/12);
     //System.out.println(y0);
     
      // x = y0 + entero(y0/4) – entero(y0/100) + entero(y0/400)
     int x =y0+(y0/4)-(y0/100)+(y0/400);
        
     //System.out.println(x);
     
     //m0 = m + 12 * entero((14 - m) / 12) - 2
       
     int m0=m+(12*((14-m)/12))-2;
     
     //System.out.println(m0);
     
    /* d0 = (d + x + entero(31*m0)/ 12) mod 7
    */
    int d0=(d+x+(31*m0/12))%7;

    //System.out.println(d0);
    

       return d0;
    }
    
    /**
     * Devuelve el nombre del dìa en base al numero del dìa de la semana.
     * Considerando que Domingo=0, Lunes=1...
     * @param d0
     * @return 
     */
    private static String getDiaSemanaCalendarioGregoriano(int d0){
        String centinela="";
         switch(d0){
            
            case 0:
                centinela="Do";
                break;
                
                case 1:
                centinela="Lu";
                break;
                
                case 2:
                centinela="Ma";
                break;
                
                case 3:
                centinela="Mi";
                break;
                
                case 4:
                centinela="Ju";
                break;
                
                case 5:
                centinela="Vi";
                break;
                
                case 6:
                centinela="Sa";
                break;
        }
        return centinela;
    }
    
    
    /**
     * Dibuja el calendario de un mes y un año en particular.
     * @param m
     * @param y 
     */
    public static void DibujaCalendario(int m, int y){
        String []meses=new String[12];
        meses[0]="Enero";
        meses[1]="Febrero";
        meses[2]="Marzo";
        meses[3]="Abril";
        meses[4]="Mayo";
        meses[5]="Junio";
        meses[6]="Julio";
        meses[7]="Agosto";
        meses[8]="Septiembre";
        meses[9]="Octubre";
        meses[10]="Noviembre";
        meses[11]="Diciembre";
        /*Matriz para los dias de la semana*/
        String mes[][] =new String[6][7];
        int []numeroDias=new int[12];
        numeroDias[0]=31;
        numeroDias[1]=getNumeroDiasFebrero(y);
        numeroDias[2]=31;
        numeroDias[3]=30;
        numeroDias[4]=31;
        numeroDias[5]=30;
        numeroDias[6]=31;
        numeroDias[7]=31;
        numeroDias[8]=30;
        numeroDias[9]=31;
        numeroDias[10]=30;
        numeroDias[11]=31;
                         
        
        
        if(m>0 && m<=12){
            int d0=calcularDiaSemana(1,m,y);
            //System.out.println( getDiaSemanaCalendarioGregoriano(d0));
            System.out.printf("%s\t%d\n\r",meses[m-1],y);
            for(int dia=0; dia<7;dia++)
                  System.out.printf("%s\t",getDiaSemanaCalendarioGregoriano(dia));
            System.out.println();
            
            int dia=-1;
            for(int i=0;i<mes.length;i++){
             
                    for (int j = 0; j < mes[i].length; j++) {
                        
                        if(i==0 && j==d0)
                            dia=1;
                        else if(dia>=1)
                               dia++;
                        
             
                        
                        String strDia="";
                        if(dia>=1)
                            strDia=""+dia;
                      mes[i][j]=strDia+"\t";
                      System.out.print(mes[i][j] + " ");
                      
                      if(dia==numeroDias[m-1])
                            return;//salgo del for
                    
                     
                    }
              System.out.println();
                
            }
            
            
        }
        else{
            System.out.println("Mes no válido.");
        }
    }
    
    /**
     * Devuelve el numero de dias que tiene febrero considerando bisiestos
     * @param y
     * @return 
     */
    private static int  getNumeroDiasFebrero(int y){
        int centinela=28;
        
        if ((y % 4 == 0) && ((y % 100 != 0) || (y % 400 == 0)))
                centinela++;
        
        return centinela;
    }
    
}
