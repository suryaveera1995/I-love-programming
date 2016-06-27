<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Registration Page</title>
</head>
<body>

<form:form method="POST" >
<table>
    <tr>
        <td>User Name :</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Password :</td>
        <td><form:password path="password" /></td>
    </tr>
      <tr>
        <td>Email :</td>
        <td><form:password path="email" /></td>
    </tr>
    <tr>
        <td>Gender :</td>
        <td>
            <form:radiobutton path="gender" value="M" label="M" /> 
            <form:radiobutton path="gender" value="F" label="F" />
        </td>
    </tr>
   
    <tr>
        <td colspan="2"><input type="submit" value="Register"></td>
        <td colspan="1"><input type="submit" value="Cancel"></td>
    </tr>
</table>
</form:form>

</body>
</html>