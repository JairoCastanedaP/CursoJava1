/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        
        // 1.Procesamos parametros
        String accion =request.getParameter("accion");
        // 2.Creamos los JavaBean
        Rectangulo recRequest= new Rectangulo(1,2);
        Rectangulo recSesion = new Rectangulo(3,4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);
        
        //3. agregamos el javaBean a algun alcance
        
        //revisamos la accion
        if("agregaVariables".equals(accion)){
            request.setAttribute("rectanguloRequest", recRequest);
            //alcance session
            HttpSession sesion= request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
            
            //Alcance application
            ServletContext applicacion = this.getServletContext();
            applicacion.setAttribute("rectanguloAplicacion",recAplicacion);
            
            //Agregamos un mensaje
            request.setAttribute("mensaje","las variables fueron agregadas");
            
            //4.redireccionamos al jsp index
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
        else if("listarVariables".equals(accion)){
            //4.redireccionamos al Jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }
        else{
            //4. redireccionamos a la pagina de inicio
            request.setAttribute("mensaje","accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }
        
    }
}
