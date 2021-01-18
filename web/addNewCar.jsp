<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <div class="container">
        <div class="regbox" id="addcar">
            <img class="avatar" id="addcaravatar" src="img/red.jpg">
            <h1>Add New Car Information</h1>
            <form action="NewCarServlet" method="get">
            <p>Number Plate</p>
            <input type="text" placeholder="Plate" name="plate" required>
            <p>Brand</p>
            <input type="text" placeholder="Brand" name="brand" required>
            <p>Color</p>
            <input type="text" placeholder="Color" name="color" required>
            <p>Per Day</p>
            <input type="text" placeholder="Price" name="price" required>            
            <input type="submit" value="Save It!">                            
            </form>
        </div>
     </div>
    </body>
</html>