<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>
</head>
<body>

<form:form method="POST" action="./addcustomer">
<table>
<tr>
        <td>FullName :</td>
           <td><form:input path="FullName" /></td>
        
    </tr>
     <tr>
        <td>EmailId :</td>
           <td><form:input path="EmailId" /></td>
        
    </tr>

    <tr>
        <td>UserName :</td>
        <td><form:input path="UserName" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="Password" /></td>
    </tr>
   
    
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
    </tr>
</table>
</form:form>

</body>
</html>