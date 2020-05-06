/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ENVYX360
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
       //Simulando valores correctos
       String usuarioOk="juaco";
       String passworOk="123";
       
       String usuario=request.getParameter("usuario");
       String password=request.getParameter("password");
       PrintWriter out= response.getWriter();
       if(usuarioOk.equals(usuario) && passworOk.equals(password)){
           
           out.print("<h1>");
           out.print("Datos correctos");
           out.print("<br>Usuario:"+usuario);
           out.print("<br>Password: "+password);
           out.print("</h1>");
       }
       else{
           response.sendError(response.SC_UNAUTHORIZED,"lAS CREDENCIALES SON INCORRECTAS");
       }
    }
}
