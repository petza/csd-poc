package net.homecredit.test;

import net.homecredit.csd.controller.config.RestControllerConfig;
import net.homecredit.embedit.framework.common.config.ApplicationContextInitializer;
import net.homecredit.embedit.framework.security.config.HttpBasicAuthenticationSsoSecurityConfig;
import net.homecredit.embedit.framework.security.config.OpenAmRedirectSsoSecurityConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author Petr.Urban on 24.2.2015.
 */
public class WebAppInitializer implements WebApplicationInitializer
{
    
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(TestRepositoryConfig.class, TestServiceConfig.class, OpenAmRedirectSsoSecurityConfig.class, HttpBasicAuthenticationSsoSecurityConfig.class);
        servletContext.addListener(new ContextLoaderListener(rootContext));

        /* Add ApplicationContextInitializer in order to correctly perform customized initialization of Spring */
        servletContext.setInitParameter(ContextLoader.CONTEXT_INITIALIZER_CLASSES_PARAM, ApplicationContextInitializer.class.getName());

        AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
        webCtx.register(RestControllerConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(webCtx);
        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("rest-exporter", dispatcherServlet);
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/api/test/*");
    }
}
