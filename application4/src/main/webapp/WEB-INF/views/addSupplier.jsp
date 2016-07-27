<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add Supplier Details</title> 
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
 
</head>
<body>
    <div class="form">

        <form:form class="form-horizontal"   action ="addSupplier" method="post">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2 style="color: black">Add Supplier Details</h2></td>
                </tr>
                
                <tr> <td> Supplier ID   <input type="text" name="SupplierId"  placeholder="Enter Supplier ID"/>  </td>   </tr>
                <tr> <td> Supplier Name   <input type="text" name="SupplierName"  placeholder="Enter Supplier Name"/>  </td>   </tr>
                 <tr> <td> Supplier PhoneNo   <input type="text" name="SupplierPhoneNo"  placeholder="Enter Supplier PhoneNo"/>  </td>   </tr>
                <tr> <td> Supplier Details  <input type="text" name="SupplierDetails"  placeholder="Enter Supplier Details"/>  </td>   </tr>
                <tr> <td> <input type="submit" value="add"></a></td></tr>
               <!--  <tr><td><a href="addDevice">Add Record</a></td></tr>  -->             
            </table>
		<br>
	               

        </form:form>
    </div>


</body>
</html>