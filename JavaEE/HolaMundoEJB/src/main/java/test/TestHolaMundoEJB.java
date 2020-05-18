/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEJBRemote;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author ENVYX360
 */
public class TestHolaMundoEJB {
    public static void main(String[] args) {
        
        System.out.println("Iniciando llamada al EJB desde el cliente \n");
        
        try{
            Context jndi=new InitialContext();
            HolaMundoEJBRemote holaMundoEJB= (HolaMundoEJBRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEJBImpl!beans.HolaMundoEJBRemote");
            int resultado= holaMundoEJB.sumar(50, 40);
            System.out.println("suma:"+resultado);       
        }
        catch(NamingException ex){
            ex.printStackTrace(System.out);
        }
    }
}
