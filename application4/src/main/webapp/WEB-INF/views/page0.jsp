<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>


<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">


  <title>VINTAGE CARS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
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
<center>
hi ${username}
<br>
<h2>VINTAGE CARS</h2>
</center>
  	
  </div>
  </form>
</div>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators"> 
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">  
     	<img src="<x:url value="/resources/images/alfa romeo.jpg"/>" alt="Router 1" width="460" height="345">
      </div>

      <div class="item">
    <!-- 
        <img src="resources/images/sw1.JPG" alt="Switch 1" width="460" height="345">
        -->
        	<img src="<x:url value="/resources/images/2.jpg"/>" alt="Switch 1" width="460" height="345">
   
      </div>
    
      <div class="item">
      <!--       
        <img src="resources/images/wifi1.JPG" alt="Wifi 1" width="460" height="345">
        -->
        <img src="<x:url value="/resources/images/3.jpg"/>" alt="Wifi 1" width="460" height="345">
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


			</br>
			</br>
			</br>
		
	<div class="item" >
	
	<center>
			 <a href = "device?name=1">
	         <img src="<x:url value="/resources/images/1.jpg"/>" alt="Router 1" width="400" height="250">
	         </a>
	          <a href = "device?name=2">
         <img src="<x:url value="/resources/images/2.jpg"/>" alt="Switch 1" width="400" height="250">
         </a>
  	<a href = "device?name=3">
  	  <img src="<x:url value="/resources/images/3.jpg"/>" alt="Wifi 1" width="400" height="250">  
  	   </a> 
         </center> 
         
         <center>
			 <a href = "device?name=4">
	         <img src="<x:url value="/resources/images/4.jpg"/>" alt="Router 2" width="400" height="250">
	         </a>
	          <a href = "device?name=5">
         <img src="<x:url value="/resources/images/5.jpg"/>" alt="Switch 2" width="400" height="250">
         </a>
  	<a href = "device?name=W2000">
  	  <img src="<x:url value="/resources/images/6.jpg"/>" alt="Wifi 2" width="400" height="250">  
  	   </a> 
         </center> 
         <br>
                
      </div>
    <br>
    <center>
    <a href="device?name=alldev">
    All Products    
    </a>
    </center>

<%@include file="/WEB-INF/views/footer.jsp"%>

