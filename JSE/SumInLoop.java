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
public class SumInLoop {
    public static void main (String[] args){
	Scanner intro = new Scanner (System.in);
	System.out.println("Ingrese la Cantidad de Números");
	int tamanio = intro.nextInt();
	int aux1[] = new int[tamanio];
	int acum = 0;
	    for(int i = 0; i < tamanio; i++){
		aux1[i] = intro.nextInt();
		acum += aux1[i];
	    }
	System.out.println(acum);
    }
}
