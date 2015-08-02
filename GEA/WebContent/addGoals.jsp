<%@ include file="/header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Goal</title>
</head>
<body>
<form method="post" action="./addgoal">
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Add Goal</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Enter Project Name</td>
                        <td><input type="text" name="pname" value="" autocomplete="off" required maxlength="40"/></td>
                    </tr>
                    <tr>
                        <td>Enter Goal</td>
                        <td><input type="text" name="goal" value="" autocomplete="off" required maxlengh="40"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="AddGoal" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>

</body>
</html>