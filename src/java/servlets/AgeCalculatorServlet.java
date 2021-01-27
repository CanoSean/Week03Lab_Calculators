
package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cAge = request.getParameter("currentAge");
            String mess;
            
            if(cAge.equals("")){
                mess = "Please enter your age";
            }
            else
            {
                try {
                int numAge = Integer.parseInt(cAge);
                    mess = "Your age next birthday will be "+(numAge+1);
                } catch (NumberFormatException e) {
                    mess =  "Please enter a number";
                }
            }
            request.setAttribute("message", mess);
            request.getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
//          getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

}
