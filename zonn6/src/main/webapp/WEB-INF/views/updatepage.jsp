<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Product Page</title>
</head>
<body>

<form:form method="POST" action="./updateproduct">
<table>
<tr>
        <td>Product Name :</td>
           <td><form:input path="productname" /></td>
        
    </tr>
     <tr>
        <td>Product Id:</td>
           <td><form:input path="productid" /></td>
        
    </tr>

    <tr>
        <td>Product Size :</td>
        <td><form:input path="productsize" /></td>
    </tr>
    <tr>
        <td>Product Price :</td>
        <td><form:input path="productprice" /></td>
    </tr>
   
    
    <tr>
        <td colspan="2"><input type="submit" value="Update"></td>
    </tr>
</table>
</form:form>

</body>
</html>