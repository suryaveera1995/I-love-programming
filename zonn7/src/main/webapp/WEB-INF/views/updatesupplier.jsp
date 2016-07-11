<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title> Page</title>
</head>
<body>

<form:form method="POST" action="./updatesupplier">
<table>
<tr>
        <td>Supplier Name :</td>
           <td><form:input path="suppliername" /></td>
        
    </tr>
     <tr>
        <td>Supplier Id:</td>
           <td><form:input path="supplierid" /></td>
        
    </tr>

    <tr>
        <td>Supplier phoneno :</td>
        <td><form:input path="supplierphoneno" /></td>
    </tr>
    
   
    
    <tr>
        <td colspan="2"><input type="submit" value="Update"></td>
    </tr>
</table>
</form:form>

</body>
</html>