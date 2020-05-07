/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ENVYX360
 */
public class FahrenheitCelsius {
    
     public static void main(String[] args) {        
        Scanner intro = new Scanner(System.in);
        String numeros= intro.nextLine();
        //String numeros="5 495 353 168 -39 22";
        int aux1=0;
        double div=5/9;
         System.out.println("5/9"+div);
        double aux2[]= new double[2000];
        StringTokenizer tokens = new StringTokenizer(numeros," ");
        while(tokens.hasMoreTokens()){
            aux2[aux1]=(((Double.parseDouble(tokens.nextToken()))-32)*0.555555555555555555555555556);
            if(aux1==0){
                aux1++;
            }
            else{
            System.out.println(Math.round(aux2[aux1])+" ");
            aux1++;
            }
        }
    }
}
