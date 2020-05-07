/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ENVYX360
 */
import java.util.Scanner;
import java.util.StringTokenizer;

public class Suma {

    public static void main(String[] args) {        
        Scanner intro = new Scanner(System.in);
        String numeros= intro.nextLine();
        int aux1=0;
        StringTokenizer tokens = new StringTokenizer(numeros," ");
        while(tokens.hasMoreTokens()){
            aux1+=Integer.parseInt(tokens.nextToken());
        }
        System.out.println(aux1);
    }
}