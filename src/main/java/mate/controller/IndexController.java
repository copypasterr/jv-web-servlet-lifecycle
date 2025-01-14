package mate.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mate.dao.MyCoolResource;

import java.io.IOException;

public class IndexController extends HttpServlet {
    private MyCoolResource myResource;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("IndexController was called");
        req.getRequestDispatcher("webapp/WEB-INF/views/index.jsp").forward(req, resp);
    }

}
