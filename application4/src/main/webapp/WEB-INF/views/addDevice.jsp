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
      width: 50%;
      margin: auto;
  }
  </style>
 
</head>
<body>

    <div class="form">

        <form:form class="form-horizontal" method="post"  action ="addDevice">
           <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2 style="color: black">Add Product</h2></td>
                </tr>
                
                <tr> <td> Product ID   <input type="text" name="ProductID"  placeholder="Enter Product ID"/>  </td>   </tr>
                <tr> <td> Product Name   <input type="text" name="ProductName"  placeholder="Enter Product Name"/>  </td>   </tr>
                <tr> <td> Product Category  <input type="text" name="ProductCategory"  placeholder="Enter Product Category"/>  </td>   </tr>
                <tr> <td> Product Details  <input type="text" name="ProductDetails"  placeholder="Enter Product Details"/>  </td>   </tr>
                <tr> <td> Product Price  <input type="text" name="ProductPrice"  placeholder="Enter Product Price"/>  </td>   </tr>
                <tr> <td> Product Photo URL   <input type="text" name="ProductPhotoURL"  placeholder="Enter Photo URL"/>  </td>   </tr>
                <tr> <td> <input type="submit" value="add">
                        
            </table>
		<br>
	               

        </form:form>
    </div>


</body>
</html>