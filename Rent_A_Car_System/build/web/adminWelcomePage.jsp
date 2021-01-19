<%@page import="Rent_Info.Rent"%>
<%@page import="Rent_Info.RentCarDao"%>
<%@page import="Admin.Admin"%>
<%@page import="Car.Car"%>
<%@page import="User.UserDao"%>
<%@page import="java.util.List"%>
<%@page import="newpackage.ConnectionDao"%>
<%@page import="Car.CarDao"%>
<%@page import="User.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<% Admin admin = (Admin) session.getAttribute("logAdmin");
    if (admin == null) {
        response.sendRedirect("admin.jsp");
    }  
    //list user info
    UserDao userData = new UserDao(ConnectionDao.getConnection());
    List<User> user = userData.listAllUsers();
    request.setAttribute("User_List", user);
    //list car info
    CarDao carData = new CarDao(ConnectionDao.getConnection());
    List<Car> cars = carData.listUnavailableCars();
    request.setAttribute("Unavailable_Car_List", cars);    
    List<Car> available = carData.listAvailableCars();
    request.setAttribute("Available_List", available);
    //list rented car info
    RentCarDao rentedData = new RentCarDao(ConnectionDao.getConnection());
    List<Rent> rents = rentedData.listAllRented();
    request.setAttribute("AllRent_List", rents);
    
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Welcome Page</title>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.23/css/dataTables.bootstrap4.min.css">
        <style>
        body {
            background-image: url(../img/Cars.jpg);
            background-size: cover;
            background-repeat: no-repeat;
            font-family: 'Arimo', sans-serif;
            margin: 0;
            padding: 0;
            height: 100%;
            box-sizing: border-box;
        }        
        </style>
</head>
<body>
    <section class="content">
      <div class="container-fluid">
        <!-- Main row -->
        <div class="row">
            <!-- start of left side element-->
            <section class="col-lg-1" style="background-color: #cccccc; left:1px; top: 1px; background-size: cover;">
            <center>
                <div class="admin-left-area">
                    <div class="profie-card">                        
                        <div class="image-card">
                            <img src="img/user-avatar.png" style="width:80px ; height:90px; margin-top: 0.2cm;">
                        </div>
                        <div class="name-card">
                            <span class="admin-name">Welcome <%= admin.getName()%><br></span>
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
                <nav style="background-color: cadetblue; left:1px;">
                    <div class="container">
                        <div class="nav-wrapper">
                            <a class="brand-logo" >Rent A Car</a>
                            <ul class="right hide-on-med-and-down" >
                                <li>
                                    <div class="search bar">
                                        <form action="">
                                            <input type="text" name="search" required placeholder="search">                                   
                                        </form>
                                    </div>
                                </li>
                                <li><a href="LogoutServlet?admin=1"><i class="material-icons">settings_power</i></a></li>
                            </ul>
                        </div>
                    </div>
                </nav> 
            <!-- Custom tabs (Charts with tabs)-->
                <div class="card" >
                    <div class="card-header">
                       <h3 class="card-title"><b>AVAILABLE CAR LIST</b></h3>
                    </div>
                    <!-- /.card-header -->
                    <div class="card-body" style="background-color: cornsilk">
                      <table id="example" class="table table-striped table-bordered" style="width:100%">
                        <thead>
                            <tr>
                                <th>Plate</th>
                                <th>Brand</th>
                                <th>Color</th>
                                <th>Per Day (in TL)</th>
                                <th>Action</th>
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
                                    <button><a href="editCar.jsp?c_id=${carList.c_id}">Edit</a></button>
                                    <button><a href="DeleteCarServlet?c_id=${carList.c_id}">Delete</a></button>
                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>                  
                      </table>
                        <div class="container-fluid">
                            <div class="row mb-2" style="padding-top: 5px">
                            <section class="col-lg-12">
                             <a href="addNewCar.jsp" class="btn btn-success" style="float:right; margine-bottom:10px;"><i class="fa fa-plus"></i>ADD NEW CAR</a><br>   
                            </section>           
                            </div>
                        </div>
                    </div>
                    <div class="content-header">
                        <div class="container-fluid">
                                <div class="row mb-2">          
                                </div><!-- /.container-fluid -->
                        </div>
                    </div>
                    <div class="card" style="background-color: #ccffcc">
                        <div class="card-header" style="background-color: azure;">
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
                                            <button><a href="StopRentServlet?r_id=${rentedList.r_id}&r_durum=0&plate=${rentedList.plate}&admin=1">StoptoRent</a></button>
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
                        <div class="card-header" style="background-color: #e9eef3;">
                            <h3 class="card-title"><br><b>UNAVAILABLE CAR LIST</b></h3>
                        </div>
                        <!-- /.card-header -->
                        <div class="card-body">
                            <table id="example2" class="table table-striped table-bordered" style="width:100%">
                            <thead>
                                <tr>
                                    <th>Plate</th>
                                    <th>Brand</th>
                                    <th>Color</th>
                                    <th>Price</th>
                                    <th>Durum</th>
                                    <th>Actions</th>
                                </tr>
                            </thead>
                            <tbody>  
                                <c:forEach var="unavailableCarList" items="${Unavailable_Car_List}">
                                <tr>
                                    <td>${unavailableCarList.plate}</td>
                                    <td>${unavailableCarList.brand}</td>
                                    <td>${unavailableCarList.color}</td>
                                    <td>${unavailableCarList.price}</td>
                                    <td>${unavailableCarList.durum}</td>
                                    <td>
                                        <button><a href="editCar.jsp?c_id=${unavailableCarList.c_id}">Edit</a></button>
                                        <button><a href="DeleteCarServlet?c_id=${unavailableCarList.c_id}">Delete</a></button>
                                    </td>
                                </tr>
                                </c:forEach>           
                            </tbody>                    
                        </table>
                        </div>
                    <!-- /.card-body -->
                    </div> 
                    <div class="new-users">
                        <div class="card-header" style="background-color: #ece0e7;">
                        <h3 class="card-title"><br><b>USER LIST</b></h3>
                        </div>
                        <div class="user-item-block" style="background-color: #e7f0f4;">
                            <div class="row">
                                <c:forEach var="userList" items="${User_List}">
                                <div class="col m2" style="left:10px; padding-right: 4cm;">                                    
                                    <div class="card" style="background-color: #ece0e7;">
                                        <div class="user-profile-icon" >                                                
                                            <b>ID=</b>${userList.u_id}<br><b>Name=</b>${userList.name}<br><b>Email=</b>${userList.email}
                                        </div>
                                        <button><a href="DeleteUserServlet?u_id=${userList.u_id}">Delete</a></button>
                                    </div>                                      
                                </div>  
                                </c:forEach>
                            </div>                            
                        </div>
                    </div>
                </div>
            </section>
            <!-- end of right side element -->
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