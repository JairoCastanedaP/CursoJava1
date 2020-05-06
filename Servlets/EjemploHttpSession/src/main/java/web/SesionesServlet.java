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
import javax.servlet.http.HttpSession;

/**
 *
 * @author ENVYX360
 */
@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion= request.getSession();
        String titulo=null;
        
        //pedir el atributo contadorVisitas a la sesion
        Integer contadorVisitas=(Integer) sesion.getAttribute("contadorVisitas");
        
        //si es nulo es la primera vez que accedemos a la aplicacion
        if(contadorVisitas==null){
            contadorVisitas=1;
            titulo="bienvenido por primera vez";
            
        }
        else{
            contadorVisitas++;
            titulo="Bienvenido nuevamente";
        }
        //agregamos el nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        PrintWriter out =response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("no. de acceso al recurso: "+contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion: "+sesion.getId());
    
    }
}
