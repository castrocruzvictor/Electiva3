/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Operaciones {

    
    
    public static void main(String[] args) {
        
    int vInt;
    float vFloat;
    String vtr;
    boolean b1, b2;
    Scanner vscan= new Scanner(System.in);
     
        vInt = 5+2;
        System.out.println("vInt= 5 + 2 :" + vInt);
        vInt = 5-2;
        System.out.println("vInt= 5 - 2 :" + vInt);
        vInt = 5*2;
        System.out.println("vInt= 5 * 2 :" + vInt);
        vInt = 5/2;
        System.out.println("vInt= 5 / 2 :" + vInt);
        vInt = (int) Math.pow(5, 2);
        System.out.println("vInt= 5 ^ 2 :" + vInt);
        
        vFloat = 5+2;
        System.out.println("vInt= 5 + 2 :" + vFloat);
        vFloat = 5-2;
        System.out.println("vInt= 5 - 2 :" + vFloat);
        vFloat = 5*2;
        System.out.println("vInt= 5 * 2 :" + vFloat);
        vFloat = 5/2;
        System.out.println("vInt= 5 / 2 :" + vFloat);
        vFloat = (int) Math.pow(5, 2);
        System.out.println("vInt= 5 ^ 2 :" + vFloat);
        
        vtr = "David ";
        vtr = vtr + "Williams";
        System.out.println("Cadena:"+ vtr);
        
        b1=true;
        b2=false;
        
        System.out.println("b1 and b2: " + (b1 && b2));
        System.out.println("b1 or b2: " + (b1 || b2));
        System.out.println("not b1: " + (!b1));
        System.out.println("not b2: " + (!b2));
        
        //System.out.println("Escriba un mensaje:");
        //System.out.println(vscan.nextLine());
        
        //Cliclos
        int i;
        for(i=0; i<5; i++ ){
           System.out.println(i);
        }
        
        i= 5;
        i= ++i +2;
        System.out.println(i);
        i= 5;
        i= i++ +2;
        System.out.println(i);
        
    } 
}

