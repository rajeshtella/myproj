<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
         <link rel="stylesheet" type="text/css" href="bootstrap.css">
    </head>
    <body>
        <form method="post" action="register">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter User Name</td>
                        <td><input type="text" name="uname" value="" autocomplete="off" required/></td>
                    </tr>
                     <tr>
                        <td>Enter First Name</td>
                        <td><input type="text" name="fname" value="" autocomplete="off" required/></td>
                    </tr>
                     <tr>
                        <td>Enter Last Name</td>
                        <td><input type="text" name="lname" value="" autocomplete="off" required/></td>
                    </tr>
                    <tr>
                        <td>Enter Password</td>
                        <td><input type="password" name="pass1" autocomplete="off" value="" required/></td>
                    </tr>
                     <tr>
                        <td>Confirm Password</td>
                        <td><input type="password" name="pass2" autocomplete="off" value="" required/></td>
                    </tr>
                     <tr>
                        <td>Enter Email</td>
                        <td><input type="text" name="email" autocomplete="off" value="" required/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Register" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Go to Login Screen!! <a href="./login.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>