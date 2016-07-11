<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:black">
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 60%;
      margin: auto;
  }
  </style>
</head>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><font face="Beyond Wonderland" color="black" size="8">VINTAGE CARS</font></a>
    </div>
     <ul class="nav navbar-nav">
      <li><a href="product">Add product</a></li>
      <li><a href="viewproduct">Products</a></li>
      <li><a href="signup">SIGNUP</a></li>
      <li><a href="login">LOGIN</a></li>
      <li><a href="carspage">dream car</a></li>
       <li><a href="viewcategory">category</a></li>
       <li><a href="category">Add category</a></li>
        <li><a href="viewsupplier">supplier</a></li>
       <li><a href="supplier">Add supplier</a></li>     
    </ul>
  </div>
</nav>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/1.jpg" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/2.jpg" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/3.jpg" width="460" height="345">
      </div>
       <div class="item">
        <img src="resources/images/4.jpg" width="460" height="345">
      </div>
       <div class="item">
        <img src="resources/images/5.jpg" width="460" height="345">
      </div>
       <div class="item">
        <img src="resources/images/6.jpg" width="460" height="345">
      </div>
       <div class="item">
        <img src="resources/images/7.jpg" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>

<div class="container">
  
  <div class="row">
    <div class="col-md-4">
      <a href="resources/images/8.jpg" class="thumbnail">
        <img src="resources/images/8.jpg" style="width:600px;height:250px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/images/9.jpg" class="thumbnail">
        <img src="resources/images/9.jpg" style="width:600px;height:250px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/images/10.jpg" class="thumbnail">
        <img src="resources/images/10.jpg" style="width:600px;height:250px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/images/11.jpg" class="thumbnail">
        <img src="resources/images/11.jpg" style="width:600px;height:250px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/images/12.jpg" class="thumbnail">
        <img src="resources/images/12.jpg" style="width:600px;height:250px">
      </a>
    </div>
    <div class="col-md-4">
      <a href="resources/images/13.jpg" class="thumbnail">
        <img src="resources/images/13.jpg" style="width:6000px;height:250px">
      </a>
    </div>
  </div>

</div>
</html>