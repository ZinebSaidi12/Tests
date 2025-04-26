package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createArticle")
public class CreateArticleServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String ref = request.getParameter("ref");
        String libelle = request.getParameter("libelle");
        int qte_stock = Integer.parseInt(request.getParameter("qte_stock"));

        Article article = new Article(id, ref, libelle, qte_stock);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2>Article Created Successfully</h2>");
        response.getWriter().println("<ul>");
        response.getWriter().println("<li>ID: " + article.getId() + "</li>");
        response.getWriter().println("<li>Reference: " + article.getRef() + "</li>");
        response.getWriter().println("<li>Libelle: " + article.getLibelle() + "</li>");
        response.getWriter().println("<li>Quantity in Stock: " + article.getQte_stock() + "</li>");
        response.getWriter().println("</ul>");
    }
}

