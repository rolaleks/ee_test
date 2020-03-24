package ru.geekbrains.servlet.route;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Main", urlPatterns = "/main")
public class Main extends BaseServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        this.renderPage(resp, req, "Welcome to home page!");
    }

    @Override
    public String getTitle() {
        return "Главная";
    }
}