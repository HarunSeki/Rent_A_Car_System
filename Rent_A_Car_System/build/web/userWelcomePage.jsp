<%@page import="Rent_Info.Rent"%>
<%@page import="Rent_Info.RentCarDao"%>
<%@page import="Car.Car"%>
<%@page import="User.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="newpackage.ConnectionDao"%>
<%@page import="Car.CarDao"%>
<%@page import="User.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<% User user = (User) session.getAttribute("logUser");
    if (user == null) {
        response.sendRedirect("index.jsp");
    }    



    
    UserDao userData = new UserDao(ConnectionDao.getConnection());
    List<User> users = userData.listAllUsers();
    request.setAttribute("User_List", users);

    CarDao carData = new CarDao(ConnectionDao.getConnection());
    List<Car> cars = carData.listAllCars();
    request.setAttribute("Car_List", cars);
    
    List<Car> available = carData.listAvailableCars();
    request.setAttribute("Available_List", available);
    
    int u_id = user.getU_id();
    RentCarDao rentedData = new RentCarDao(ConnectionDao.getConnection());
    List<Rent> renteds = rentedData.listedUserRented(u_id);
    request.setAttribute("AllRent_List", renteds);
    
    List<Rent> oldrenteds = rentedData.listedOldUserRented(u_id);
    request.setAttribute("Old_Rented_List", oldrenteds);
%>     
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Welcome Page</title>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap4.min.css">
</head>
<body>
    <section class="content">
    <div class="container-fluid">
        <!-- Main row -->
        <div class="row">
            <!-- start of left side element-->
            <section class="col-lg-1" style="background-color: #cccccc; left:2px; top: 2px;">
            <center>
                <div class="admin-left-area">
                    <div class="profie-card">                        
                        <div class="image-card">
                            <img src="img/user-avatar.png" style="width:80px ; height:90px; margin-top: 0.2cm;">
                        </div>
                        <div class="name-card">
                            <span class="user-name" style="position: relative;"><b>Welcome <%=user.getName()%></b><br></span>
                        </div>
                    </div>                     
                </div>  
            </center>
            </section>
            <!-- end of left side element -->            
            <!-- start of right side element -->
            <section class="col-lg-11 connectedSortable">
                <div class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-1">          
                        </div><!-- /.container-fluid -->
                    </div>
                </div>
                <nav style="background-color: cadetblue; left:2px;">
                    <div class="container">
                        <div class="nav-wrapper">
                            <a class="brand-logo">Rent A Car</a>
                            <ul class="right hide-on-med-and-down">
                                <li>
                                    <div class="search bar">
                                        <form action="">
                                            <input type="text" name="search" required placeholder="search">                                   
                                        </form>
                                    </div>
                                </li>
                                <li><a href="LogoutServlet?admin=0"><i class="material-icons">settings_power</i></a></li>
                            </ul>
                        </div>
                    </div>
                </nav>
                
            <!-- Custom tabs (Charts with tabs)-->
            <div class="card">
                <div class="card-header">
                   <h3 class="card-title"><b>AVAILABLE CAR LIST</b></h3>
                </div>
                <!-- /.card-header -->
                <div class="card-body">
                  <table id="example" class="table table-striped table-bordered" style="width:100%">
                    <thead>
                    <tr>
                      <th>Plate</th>
                      <th>Brand</th>
                      <th>Color</th>
                      <th>Per Day (in TL)</th>
                      <th>Wanna reserve?</th>
                    </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="carList" items="${Available_List}">
                          <tr>                                    
                              <td>${carList.plate}</td>
                              <td>${carList.brand}</td>
                              <td>${carList.color}</td>
                              <td>${carList.price},00 TL</td> 
                              <td>
                                  <button><a href="rent.jsp?c_id=${carList.c_id}&plate=${carList.plate}&u_id=<%=user.getU_id()%>">Rent</a></button>                                                            
                              </td>
                          </tr>
                        </c:forEach>
                    </tbody>                  
                  </table>
                </div>
            <!-- /.card-body -->
            </div> 
            <div class="content-header">
                <div class="container-fluid">
                    <div class="row mb-2">          
                    </div>
                </div>
            </div>
    		<div class="card" style="background-color: lightcoral">
                    <div class="card-header">
                       <h3 class="card-title"><br><b>RENTED CAR LIST</b></h3>
                    </div>
                    <!-- /.card-header -->
                    <div class="card-body">
                      <table id="example1" class="table table-striped table-bordered" style="width:100%">
                        <thead>
                        <tr>
                          <th>Plate</th>
                          <th>Pick-Up Date</th>
                          <th>Return Date</th>
                          <th>Total Amount</th>
                          <th>Wanna Stop?</th>
                        </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="rentedList" items="${AllRent_List}">
                                <tr>                                    
                                    <td>${rentedList.plate}</td>
                                    <td>${rentedList.st_date}</td>
                                    <td>${rentedList.fin_date}</td>
                                    <td>${rentedList.r_price},00 TL</td>
                                    <td>
                                        <button><a href="StopRentServlet?r_id=${rentedList.r_id}&r_durum=0&plate=${rentedList.plate}&admin=0">StoptoRent</a></button>
                                    </td>                                    
                                </tr>
                            </c:forEach>  
                        </tbody>                  
                      </table>
                    </div>
                </div>
                <div class="content-header">
	      			<div class="container-fluid">
	        			<div class="row mb-2">          
	     			 	</div><!-- /.container-fluid -->
	    			</div>
    			</div>
                <div class="card" style="background-color: lightblue">
                    <div class="card-header">
                        <h3 class="card-title"><br><b>RENTED HISTORY</b></h3>
                    </div>
                    <!-- /.card-header -->
                    <div class="card-body">
                        <table id="example2" class="table table-striped table-bordered" style="width:100%">
                        <thead>
                            <tr>
                                <th>Plate</th>
                                <th>Pick-Up Date</th>
                                <th>Return Date</th>
                                <th>Total Amount</th>
                            </tr>
                        </thead>
                        <tbody>  
                        <c:forEach var="oldRentedList" items="${Old_Rented_List}">
                            <tr>                                    
                                <td>${oldRentedList.plate}</td>
                                <td>${oldRentedList.st_date}</td>
                                <td>${oldRentedList.fin_date}</td>
                                <td>${oldRentedList.r_price},00 TL</td>  
                            </tr>
                        </c:forEach>           
                        </tbody>                    
                    </table>
                    </div>
                <!-- /.card-body -->
                </div> 
            </section>
        </div>
    </div>    
    </section>
<!--end of body content--> 
<script src="http://cdnjs.cloudflare.com/ajax/libs/materalize/1.0.0/css/materalize.min.css.js"></script>   
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.23/js/jquery.dataTables.min.js"></script>
<script>
    $(document).ready(function() {
        $('#example').DataTable();
        $('#example1').DataTable();
        $('#example2').DataTable();
    });
</script>
</body>
</html>