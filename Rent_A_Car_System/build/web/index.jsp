<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    boolean Cookkontrol=false;
    Cookie cookies[] = request.getCookies ();
    Cookie logEmail = null, logPass = null;
    if (cookies != null){
        for (int i = 0; i < cookies.length; i++){
            if (cookies[i].getName().equals("logEmail")){ 
                logEmail = cookies[i]; Cookkontrol=true; }
            if (cookies[i].getName().equals("logPass")){ 
                logPass = cookies[i];  }
        }
    }

 
%>

<!DOCTYPE html>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
    <title>User Account</title>
    <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <div class="container">
        <div class="box">
            <h1>User Account</h1>
            <form action="LoginUserServlet" method="post" id="myForm">
                <p>E-Mail</p>
                <input type="text" placeholder="Email" name="email" value="<%=(Cookkontrol==true?logEmail.getValue():"")%>" required>
                <p>Password</p>
                <input type="password" placeholder="Password" name="password" value="<%=(Cookkontrol==true?logPass.getValue():"")%>" required>
                <input type="submit" value="Login">                
                    <a href="addNewUser.jsp" style="position: relative; left: 70px">Create New Account<br></a>
                    <a href="admin.jsp" style="position: relative; left: 30px"><br>Click Here, If you are an Admin</a>
                    <%
                    if (Cookkontrol) {out.print("<script>document.getElementById('myForm').submit();</script> ");}
                    %>
            </form>
        </div>
    </div>
    </body>
</html>
