import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", value = "/caltulator")
public class DiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount"));

        float discountPrice = (float) (price * discount * 0.01);
        float discountAmount = price - discountPrice;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h4>Product description: " + description + "</h4");
        writer.println("<h4>Product list price: " + price + "</h4>");
        writer.println("<h4>Discount percent(%): " + discount + "%</h4>");
        writer.println("<h4>Discoutn amount: " + discountAmount + "</h4>");
        writer.println("<h4>Discount price: " + discountPrice + "</h4>");
        writer.println("</html>");
    }
}
