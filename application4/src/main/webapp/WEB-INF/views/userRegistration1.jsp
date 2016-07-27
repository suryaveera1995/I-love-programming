
<html>
		<title>User Registration</title>
	</head>
	<body>
	<form action="registerUser" method="POST">
	UserId <input type="text" name="UserId">
	<br>
	Password <input type="password" name="password">
	<br>
	EMail ID <input type="text" name="emailid">
	<br>
	Mobile No. <input type="text" name="mobilenumber">
	<br>
	Address <input type="text" name="address">
	<br>
	City <input type="text" name="city">
	<br>
	State <input type="text" name="state">
	<br>
	Country <input type="text" name="country">
	<br>
	<input type="submit" value="Register">


</form>
<%@include file="/WEB-INF/views/footer.jsp"%>
	
	
	
	
	</body>
</html>