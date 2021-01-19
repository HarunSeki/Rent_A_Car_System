package newpackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LogoutServlet", urlPatterns = {"/LogoutServlet"})
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int admin = Integer.parseInt(request.getParameter("admin"));
        HttpSession session = request.getSession();
        session.removeAttribute("logUser");
        
        Cookie cookie1 = new Cookie ("logEmail","");
        Cookie cookie2 = new Cookie ("logPass","");
        cookie1.setMaxAge(0);
        cookie2.setMaxAge(0);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        if(admin == 1){
            response.sendRedirect("admin.jsp");
        }else{
            response.sendRedirect("index.jsp");
        }
    }
}