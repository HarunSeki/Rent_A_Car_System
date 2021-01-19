<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    <title>Admin Login</title>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <div class="container">
        <div class="box">
            <h1>Admin Account</h1>
            <form action="LoginAdminServlet" method="post">
                <p>E-Mail</p>
                <input type="text" placeholder="Email" name="email" required>
                <p>Password</p>
                <input type="password" placeholder="Password" name="password" required>
                <input type="submit" value="Login">
                    <a href="index.jsp" style="position: relative; left: 40px">Click Here, if you are User</a>
            </form>
        </div>
    </div>
    </body>
</html>