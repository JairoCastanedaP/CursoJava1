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
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //suponsemos que el usuario visita por primera vez nuestro sitio
       boolean nuevoUsuario= true;
       
       Cookie[] cookies=request.getCookies();
       
       //buscamos si ya existe una cookies creada con anterioridad
       //llamada visitante recurrente
       if(cookies !=null){
           for(Cookie c: cookies){
               if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                  nuevoUsuario=false;
                  break;
               }
           }
       }
       String mensaje=null;
       if(nuevoUsuario){
           Cookie visitanteCookie = new Cookie("visitanteRecurrente","si");
           response.addCookie(visitanteCookie);
           mensaje="Gracias por visitar nuestro sitio por primera vez";
       }
       else{
           mensaje="Gracias por visitar NUEVAMENTE nuestro sitio";
           response.setContentType("text/html;charset=UTF-8");
           PrintWriter out= response.getWriter();
           out.print("Mensaje:"+mensaje);
           out.close();
       }
    }
}
