<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Supplier Page</title>
</head>
<body>

<form:form method="POST" action="./addsupplier">
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
        <td>Supplier size:</td>
           <td><form:input path="suppliernumber" /></td>
        
    </tr>
     <tr>
        <td>Category price:</td>
           <td><form:input path="supplieraddress" /></td>
        
    </tr>

   
    <tr>
        <td colspan="2"><input type="submit" value="Enter"></td>
    </tr>
</table>
</form:form>

</body>
</html>