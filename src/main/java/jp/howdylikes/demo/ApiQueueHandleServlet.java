package jp.howdylikes.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by howdy39 on 2017/07/17.
 */
public class ApiQueueHandleServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(ApiQueueHandleServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String spreadsheetId = req.getParameter("spreadsheetId");
        String row = req.getParameter("row");
        String column = req.getParameter("column");
        String value = req.getParameter("value");

        log.info(String.format("処理開始y spreadsheetId:%s row:%s column:%s value:%s", spreadsheetId, row, column, value));

        try {
            Thread.sleep(20 * 1000);
        } catch (InterruptedException e) {
            log.fine(e.getMessage());
        }

        log.info(String.format("処理終了 spreadsheetId:%s row:%s column:%s value:%s", spreadsheetId, row, column, value));

    }
}
