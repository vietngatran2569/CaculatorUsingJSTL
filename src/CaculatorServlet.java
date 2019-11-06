import java.io.IOException;
import java.io.PrintWriter;

@javax.servlet.annotation.WebServlet(name = "CaculatorServlet",urlPatterns = "/caculate")
public class CaculatorServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
     float firstOperand=Float.parseFloat(request.getParameter("firstOperand"));
     float secondOperand=Float.parseFloat(request.getParameter("secondOperand"));
     char operator=request.getParameter("operator").charAt(0);
        PrintWriter writer=response.getWriter();
        writer.println("<html>");
        writer.println("Result: ");

        try {
            float result=   Caculator.caculate(firstOperand,secondOperand,operator);
            writer.println(firstOperand+" "+operator+" "+secondOperand+" = "+result);
        }catch (Exception ex){
            writer.println("Error "+ex.getMessage());
        }
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
