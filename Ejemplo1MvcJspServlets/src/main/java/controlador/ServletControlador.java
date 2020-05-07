/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.Rectangulo;

/**
 *
 * @author ENVYX360
 */
@WebServlet("/ServletCotrolador")
public class ServletControlador extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        
        // 1.Procesamos parametros
        
        // 2.Creamos los JavaBean
        Rectangulo rec=new Rectangulo(3,6);
        
        //3. agregamos el javaBean a algun alcance
        request.setAttribute("mensaje", "saludos desde el servlet");
        
        HttpSession sesion= request.getSession();
        sesion.setAttribute("rectangulo", rec);
        
        //4.redireccionar a la vista seleccionada
        RequestDispatcher rd= request.getRequestDispatcher("vista/desplegarVariables.jsp");
        rd.forward(request, response);
        
    }
}
