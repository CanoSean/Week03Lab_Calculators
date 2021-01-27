
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            request.setAttribute("message", "---");
            request.getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String mess = "";
            String uno = request.getParameter("firstNum");
            String dos = request.getParameter("secondNum");
            String operation = request.getParameter("operation");
            int first,second,result;
            
            request.setAttribute("firstNumber", uno);
            request.setAttribute("secondNumber", dos);
            

            
            try {
                    first = Integer.parseInt(uno);
                    second = Integer.parseInt(dos);

                        switch(operation){
                            
                            case "+":
                            result = first+second;    
                            mess=""+result;
                            break;
                            
                            case "-":
                            result = first-second;
                            mess=""+result;
                            break;
                            
                            case "*":
                            result = first*second;
                            mess=""+result;
                            break;
                            
                            case "/":
                                if(first != 0 && second != 0){
                                    result = first/second;
                                    mess=""+result;
                                } else {
                                    mess="Invalid";
                                }             
                            break;
                            
                        }
                    
           
            } catch (NumberFormatException e) {
             mess="Invalid";
            }
        
            request.setAttribute("message", mess);
            request.getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }


}
