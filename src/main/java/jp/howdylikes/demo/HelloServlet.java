package jp.howdylikes.demo;

import com.google.appengine.api.taskqueue.Queue;
import com.google.appengine.api.taskqueue.QueueFactory;
import com.google.appengine.api.taskqueue.TaskOptions;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by howdy39 on 2017/07/15.
 */
public class HelloServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(HelloServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Queue queue = QueueFactory.getQueue("api-queue");

        for (int i = 0; i < 100; i++) {
            String spreadsheetId = "id";
            String row = String.valueOf(i);
            String column = "0";
            String value = "hoge";

            TaskOptions taskOptions = TaskOptions.Builder.withUrl("/addApiQueue")
                    .method(TaskOptions.Method.GET)
                    .param("spreadsheetId", spreadsheetId)
                    .param("row", row)
                    .param("column", column)
                    .param("value", value);
            queue.add(taskOptions);

            log.info(String.format("spreadsheetId:%s row:%s column:%s value:%s", spreadsheetId, row, column, value));
        }
    }
}
