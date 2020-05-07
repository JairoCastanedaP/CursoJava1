/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ENVYX360
 */
public class Rounding {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int pares=intro.nextInt();
        //int pares=3;
        int[] array1= new int[pares];
        int[] array2= new int[pares];
        //double[] array2= new double[]{8,-3,5};
        //double[] array1= new double[]{12,11,400};
        double[] result= new double[pares];
        
        
        for (int i = 0; i < pares; i++) {
            array1[i]=intro.nextInt();
            array2[i]=intro.nextInt();
            result[i]=(double)array1[i]/array2[i];
        }

        for (int i = 0; i <pares; i++) {
            System.out.println(Math.round(result[i])+" ");
        }
        
    }
}
