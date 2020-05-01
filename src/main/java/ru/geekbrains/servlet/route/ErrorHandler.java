package ru.geekbrains.servlet.route;


import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ErrorHandler", urlPatterns = "/ErrorHandler")
@ServletSecurity(@HttpConstraint(rolesAllowed = { "GUEST", "ADMIN" }))
public class ErrorHandler extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        Integer code = (Integer) req.getAttribute("javax.servlet.error.status_code");

        if (code == 404) {
            getServletContext().getRequestDispatcher("/error404.html").include(req, resp);
        } else if (code == 403) {
            getServletContext().getRequestDispatcher("/error403.html").include(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/error.html").include(req, resp);
        }
    }
}
