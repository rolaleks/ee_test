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


    protected void renderPage(HttpServletResponse servletResponse, HttpServletRequest servletRequest, String content) throws IOException {

        servletResponse.getWriter().print("<html>");
        servletResponse.getWriter().print(this.getHead());
        servletResponse.getWriter().print("<body>");

        try {
            getServletContext().getRequestDispatcher("/menu.html").include(servletRequest, servletResponse);
        } catch (ServletException e) {
            e.printStackTrace();
        }

        servletResponse.getWriter().print("<div class=\"content\">" + content + "</div>");
        servletResponse.getWriter().print("</body>");
        servletResponse.getWriter().print("</html>");
    }

    private String getHead() {
        String head = "<head>" +
                "<meta charset=\"utf-8\">" +
                "<title>" + this.getTitle() + "</title>" +
                "</head>";

        return head;
    }
}
