<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Add Product</title> 
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

        <form:form class="form-horizontal"   action ="addCategory" method="post">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2 style="color: black">Add Toys</h2></td>
                </tr>
                
                <tr> <td> Category ID   <input type="text" name="CategoryId"  placeholder="Enter Category ID"/>  </td>   </tr>
                <tr> <td> Category Name   <input type="text" name="CategoryName"  placeholder="Enter Category Name"/>  </td>   </tr>
              
                <tr> <td> Category Details  <input type="text" name="CategoryDetails"  placeholder="Enter Category Details"/>  </td>   </tr>
                <tr> <td> <input type="submit" value="add"></a></td></tr>
               <!--  <tr><td><a href="addDevice">Add Record</a></td></tr>  -->             
            </table>
		<br>
	               

        </form:form>
    </div>


</body>
</html>