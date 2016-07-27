<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit supplier page</title>
</head>
<body>
Edit supplier page
<br>
  <div class="form">

        <form:form class="form-horizontal" method="post"  action ="editSupplierData">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2 style="color: black">Add Category</h2></td>
                </tr>
                
                <tr> <td> Supplier ID    </td>    <td><form:input path="SupplierId"/></td> </tr>
                <tr> <td> Supplier Name  </td>    <td><form:input path="SupplierName" /></td>   </tr>
                <tr> <td> Supplier PhoneNo  </td>    <td><form:input path="SupplierPhoneNo" /></td>   </tr>
         
                <tr> <td> Supplier Details  </td>    <td><form:input path="SupplierDetails" /></td>  </tr>
               
                <tr> <td> <input type="submit" value="edit">
                
               <!--  <tr><td><a href="addDevice">Add Record</a></td></tr>  -->             
            </table>
		<br>
	               

        </form:form>
    </div>
</body>
</html>