/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ENVYX360
 */
@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        //declaramos una variable contador
        int contador=0;
        
        //revisar si existe la cookie contadorVisitas
        Cookie[] cookies= request.getCookies();
        if(cookies!=null){
            for(Cookie c:cookies){
                if(c.getName().equals("contadorVisitas")){
                    contador=Integer.parseInt(c.getValue());
                }
            }
        }
        //incrementar el contador en uno
        contador++;
        //Agregar la respuesta al navegador
        
        Cookie c= new Cookie("contadorVisitas",Integer.toString(contador));
        //la cookie se almacenará en el cliente por una hora
        
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje al navegador
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("contador de visitas de cada cliente: "+contador);
        
    }
}
