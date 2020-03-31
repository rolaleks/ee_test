package ru.geekbrains.servlet.route;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Product", urlPatterns = "/product")
public class Product extends BaseServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        this.renderPage(resp, req, "product.jsp");
    }


    @Override
    public String getTitle() {
        return "Товар";
    }
}
