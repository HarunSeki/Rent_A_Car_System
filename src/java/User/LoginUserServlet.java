package User;

import Admin.Admin;
import Admin.AdminDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import newpackage.ConnectionDao;

public class LoginUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            String logEmail = request.getParameter("email");
            String logPass = request.getParameter("password");
            
            UserDao db = new UserDao(ConnectionDao.getConnection());
            User user = db.logUser(logEmail, logPass);
            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("logUser", user);
                response.sendRedirect("userWelcomePage.jsp");
            } else {    
                out.println("User doesnt exist");
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request, response);
            } 
        }
    }
}