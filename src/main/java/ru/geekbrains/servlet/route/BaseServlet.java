package ru.geekbrains.servlet.route;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class BaseServlet extends HttpServlet {

    public abstract String getTitle();

    private static Logger logger = LoggerFactory.getLogger(BaseServlet.class);


    protected void renderPage(HttpServletResponse servletResponse, HttpServletRequest servletRequest, String file) throws IOException {


        try {
            getServletContext().setAttribute("file", file);
            getServletContext().getRequestDispatcher("/layout.jsp").include(servletRequest, servletResponse);
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
