package com.telusko;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println("Hello World!");
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080); // define a porta
        tomcat.getConnector(); // cria o conector HTTP padrão

        // cria contexto (root) apontando para diretório atual
        String contextPath = "";
        String docBase = new File(".").getAbsolutePath();
        Context ctx = tomcat.addContext(contextPath, docBase);

        // registra servlet e mapeamento
        Tomcat.addServlet(ctx, "helloServlet", new HelloServlet());
        ctx.addServletMappingDecoded("/hello", "helloServlet");

        tomcat.start();
        tomcat.getServer().await(); // mantém o servidor em execução
    }
}
