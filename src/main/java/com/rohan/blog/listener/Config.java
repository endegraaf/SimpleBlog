package com.rohan.blog.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import com.rohan.blog.blog.dataaccess.DbHelper;


public class Config implements ServletContextListener {
    public void contextInitialized(ServletContextEvent event) {
        // Do stuff during webapp's startup.
    	DbHelper.getInstance().init();
        System.out.println("get instance of db helper from ServletContextListener!");
    }
    public void contextDestroyed(ServletContextEvent event) {
        // Do stuff during webapp's shutdown.
    	System.out.println("Close the instance of db helper from ServletContextListener!");
        DbHelper.getInstance().close();
    }
}