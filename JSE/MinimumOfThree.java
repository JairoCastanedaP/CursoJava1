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
public class MinimumOfThree {
    public static void main(String[] args) {
        Scanner intro = new Scanner(System.in);
        int pares=intro.nextInt();
        int[] array1= new int[pares];
        int[] array2= new int[pares];
        int[] array3= new int[pares];
        int[] result= new int[pares];
        
        for (int i = 0; i < pares; i++) {
            array1[i]=intro.nextInt();
            array2[i]=intro.nextInt();
            array3[i]=intro.nextInt();
        }
        for (int i = 0; i < pares; i++) {
            if(array1[i]<array2[i] && array1[i]<array3[i]){
                 result[i]= array1[i];
            }
            else if(array2[i]<array1[i] && array2[i]<array3[i]){
                result[i]=array2[i];
            }
            else{
                result[i]=array3[i];
            }
            
        }
        for (int i = 0; i <pares; i++) {
            System.out.println(result[i]+" ");
        }
        
    }

    
}
