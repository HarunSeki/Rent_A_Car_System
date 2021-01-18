<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register Account</title>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    <style>
        .regbox h3 {
            margin-top: 1px;
            text-align: center;
            font-size: 30px;
        }
    </style>
    </head>
    <body>
    <div class="container">
        <div class="regbox">
            <h3>New User Account</h3>
            <form action="NewUserServlet" method="post">
                <p>Username</p>
                <input type="text" placeholder="Username" name="name" required>
                <p>E-Mail</p>
                <input type="text" placeholder="Useremail" name="email" required>
                <p>Password</p>
                <input type="password" placeholder="Password" name="password" required>
                <input type="submit" value="Register">
                <a href="index.jsp" style="position: relative; left: 70px">Already have Account</a>
            </form>
        </div>
    </div>
    </body>
</html>