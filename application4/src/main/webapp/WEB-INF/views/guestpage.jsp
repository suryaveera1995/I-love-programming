<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Product Info</title>

<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<script	src="//ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
<script	src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>

<script>
var app = angular.module('myApp', []);

function HomeController($scope, $http) {

	  $scope.sortType     = 'name'; // set the default sort type
	  $scope.sortReverse  = false;  // set the default sort order
	  $scope.searchProductName   = '';     // set the default search/filter term

        $scope.getDataFromServer = function() {
                $http({
                        method : 'GET',
                        url : 'GsonCon'
                }).success(function(data, status, headers, config) {
                        $scope.Products = data; alert(data);
                }).error(function(data, status, headers, config) {
                        
                });

        };
};

</script>
<style>
body { padding-top:50px; }
</style>
</head>

<body>

<div class="container" ng-app="myApp" ng-controller="HomeController">
  
  
  
  <form>
    <div class="form-group">
      <div class="input-group">
        <div class="input-group-addon"><i class="fa fa-search"></i></div>
        <input type="text" class="form-control" placeholder="Search Product Name" ng-model="searchProductName">
     
      </div>      
    </div>
  </form>


  <div ng-init="getDataFromServer();">
  <table class="table table-bordered table-striped">
    
   <thead>
   
      <tr>
     	 <td>
            <a href="#" ng-click="sortType = 'ProductID'; sortReverse = !sortReverse">
             <b>Product ID</b> 
             <span ng-show="sortType == 'ProductID' && !sortReverse" class="fa fa-caret-down"></span>
             <span ng-show="sortType == 'ProductID' && sortReverse" class="fa fa-caret-up"></span>
           </a>
        </td>
        <td>
          <a href="#" ng-click="sortType = 'ProductName'; sortReverse = !sortReverse">
            <b>Product Name</b>
            <span ng-show="sortType == 'ProductName' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ProductName' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>        
       <td>
          <a href="#" ng-click="sortType = 'ProductCategory'; sortReverse = !sortReverse">
          	<b>Product Category</b> 
            <span ng-show="sortType == 'ProductCategory' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ProductCategory' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>        
       <td>
          <a href="#" ng-click="sortType = 'ProductDetails'; sortReverse = !sortReverse">
          <b>Product Details</b> 
            <span ng-show="sortType == 'ProductDetails' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ProductDetails' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>        
       <td>
          <a href="#" ng-click="sortType = 'ProductPrice'; sortReverse = !sortReverse">
         	<b>Product Price</b> 
            <span ng-show="sortType == 'ProductPrice' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ProductPrice' && sortReverse" class="fa fa-caret-up"></span>
          </a>
        </td>        
       
        <td>
         <a href="#" ng-click="sortType = 'ProductPhotoURL'; sortReverse = !sortReverse"></a>
         <b>Image view</b>
            <span ng-show="sortType == 'ProductPhotoURL' && !sortReverse" class="fa fa-caret-down"></span>
            <span ng-show="sortType == 'ProductPhotoURL' && sortReverse" class="fa fa-caret-up"></span>
        </td>           
       </tr>
      
    </thead>
       
    <tbody>
   
      <tr ng-repeat="roll in Products | orderBy:sortType:sortReverse | filter:searchProductName">
       
        <td>{{ roll.ProductID }}</td>
        <td>{{ roll.ProductName }}</td>
        <td>{{ roll.ProductCategory }}</td>
        <td>{{ roll.ProductDetails }}</td>
         <td>{{ roll.ProductPrice }}</td>
        <td>{{ roll.ProductPhotoUrl }}</td>
        
      
             
        <td>
        <img src= "{{roll.ProductPhotoURL}}"  alt="No preview is available" width="200" height="150"/>
        </td>
        <td>
           
         

</td>
        
  </tr>
  
    </tbody>
    
  </table>
  </div>
</div>

  </body>
  