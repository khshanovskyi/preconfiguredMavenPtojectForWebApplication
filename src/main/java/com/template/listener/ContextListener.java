package com.template.listener;

import com.template.AppContextFactory;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * There are starter point for ApplicationContext. When Tomcat or another server will be started, then at the beginning
 * will start this {@link ContextListener#contextInitialized(ServletContextEvent)};
 */
@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AppContextFactory.getContext();
    }
}
