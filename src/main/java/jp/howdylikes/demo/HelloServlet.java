package jp.howdylikes.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

/**
 * Created by howdy39 on 2017/07/15.
 */
public class HelloServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(HelloServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello, world!!!");

        log.severe("severe");
        log.warning("warning");
        log.info("info");
        log.fine("fine");
        log.finer("finer");
        log.finest("finest");
    }
}
