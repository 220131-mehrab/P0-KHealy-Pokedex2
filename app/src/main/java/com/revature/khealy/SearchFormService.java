package com.revature.khealy;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SearchFormService extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String HTMLForm =
            "!DOCTYPE HTML\n" +
            "<head>  \n" +
            "    <title>Search Pokedex</title>\n" +
            "</head>\n" +
            "<html> \n" +
            "    <body>\n" +
            "        <form action='/' method='get'>\n" +
                    "            <input type = 'pokename' name='searchName'/>\n" +
                    "            <input type = 'submit' value='Search'/>\n" +
                    "        " +
                    "</form>\n" +
                    "    </body>\n" +
            "</html>";

        resp.getWriter().println(HTMLForm);
    }
}
