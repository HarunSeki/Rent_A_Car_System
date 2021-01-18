package Rent_Info;

import Car.Car;
import Car.CarDao;
import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import newpackage.ConnectionDao;

public class RentCarServlet extends HttpServlet {        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        //fetch rent_info data from pay.jsp   
        String plate = request.getParameter("plate");
        int u_id = Integer.parseInt(request.getParameter("u_id"));
        String st_date = request.getParameter("st_date");          
        String fin_date = request.getParameter("fin_date");
        String r_price = request.getParameter("r_price");
        Rent rent = new Rent(plate, u_id, st_date, fin_date, r_price);
        RentCarDao rentdao = new RentCarDao(ConnectionDao.getConnection()); 
        try{                
            if (rentdao.saveRent(rent)) {
                response.sendRedirect("userWelcomePage.jsp");
            }else{
                out.println("Check Information Again");
            }
        }catch(IOException e){
        }        
    }
}