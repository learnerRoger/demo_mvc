package com.example.web;

import com.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext = this.getServletContext();
        //ApplicationContext applicationContext = (ApplicationContext) servletContext.getAttribute("applicationContext");
        //ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();
    }
}
