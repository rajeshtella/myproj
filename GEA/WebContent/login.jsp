<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%--   <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <style>
		body {
		    background-color: linen;
		}
		h1 {
		    color: maroon;
		    margin-left: 40px;
		} 
	</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap.css">
        <title>Login</title>
    </head>
    <body>
        <form method="post" action="./login" autocomplete="off">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" class="input" autocomplete="off" name="uname" value="" required/></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" autocomplete="off" value="" required/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
       
                    <tr>	
                        <td colspan="2">Yet Not Registered!! <a href="./register.jsp">Register Here</a></td>
                    </tr>
                </tbody>
            </table>
             <% String showError=(String)request.getAttribute("showError");
                    if (showError!=null && "Y".equalsIgnoreCase(showError)){%>
                     <tr>	
                        <td colspan="2">invalid user name/password</td>
                    </tr>
                    <%} %>            
            </center>
        </form>
    </body>
</html>