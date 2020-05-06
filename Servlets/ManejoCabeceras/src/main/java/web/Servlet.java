/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ENVYX360
 */
@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out= response.getWriter();
       String metodoHttp=request.getMethod();
       out.print("<html>");
       out.print("<head>");
       out.print("<title> headers http</title>");
       out.print("<head>");
       out.print("<body>");
       out.print("<h1>headers http</h1>");
       out.print("<br>");
       out.print("metodo http: "+metodoHttp);
       
       String uri=request.getRequestURI();
       out.print("<br>");
       out.print("URI solicitada:"+uri);
       
       out.print("<br>");
       out.print("<br>");
       Enumeration cabeceros=request.getHeaderNames();
       
       while(cabeceros.hasMoreElements()){
           String nombreCabecero=(String) cabeceros.nextElement();
           out.print("<b>"+nombreCabecero+"</b>:");
           out.print(request.getHeader(nombreCabecero));
           out.print("<br>");
           
       }
       
       out.print("</body>");
       out.print("</html>");
       out.close();
    }
}
