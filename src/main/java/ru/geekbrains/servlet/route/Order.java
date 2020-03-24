package ru.geekbrains.servlet.route;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Order", urlPatterns = "/order")
public class Order extends BaseServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        this.renderPage(resp, req, "Before order, please add product to cart!");
    }


    @Override
    public String getTitle() {
        return "Заказ";
    }
}