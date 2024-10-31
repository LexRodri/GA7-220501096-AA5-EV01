package com.ejemplo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("contraseña");

        if ("admin".equals(usuario) && "1234".equals(contraseña)) {
            response.getWriter().println("Autenticación satisfactoria.");
        } else {
            response.getWriter().println("Error en la autenticación.");
        }
    }
}
