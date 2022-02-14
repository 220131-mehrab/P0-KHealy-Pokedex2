package Server;

import jakarta.servlet.Servlet;
import jakarta.servlet.http.HttpServlet;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class DexServer extends HttpServlet {
    private Tomcat server;

    public DexServer(DexService dexService) {
        this.server = new Tomcat();
        this.server.getConnector();
        this.server.addContext("",null);
        this.server.addServlet("","dexServlet", (Servlet) dexService).addMapping("/");
        try {
            this.server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }

}
