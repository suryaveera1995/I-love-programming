<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Edit Product page
<br>
  <div class="form">

        <form:form class="form-horizontal" method="post"  action ="editProductData">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2 style="color: black">EDIT PRODUCT</h2></td>
                </tr>
                
                <tr> <td> Product ID    </td>    <td><form:input path="ProductID" /></td> </tr>
                <tr> <td> Product Name  </td>    <td><form:input path="ProductName" /></td>   </tr>
                <tr> <td> Product Category  </td>    <td><form:input path="ProductCategory" /></td>   </tr>
                <tr> <td> Product Details  </td>    <td><form:input path="ProductDetails" /></td>  </tr>
                <tr> <td> Product Price </td>    <td><form:input path="ProductPrice" /></td>   </tr>
                <tr> <td> Product Photo URL   </td>    <td><form:input path="ProductPhotoURL" /></td>  </tr>
                <tr> <td> <input type="submit" value="UPDATE">
                
               <!--  <tr><td><a href="addProduct">Add Record</a></td></tr>  -->             
            </table>
		<br>
	               

        </form:form>
    </div>
</body>
</html>