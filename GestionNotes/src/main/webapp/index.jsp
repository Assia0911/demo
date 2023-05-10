<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Index</title>
<link rel="icon" href="LOGO-ENSAK-800.png">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<style>
.side {
	position: absolute;
	left: 0;
	top: 0;
	height: 100%;
	width: 20%;
}

.img {
	margin-top: 6%;
	margin-left: 15%;
	width: 50%;
	height: 12%;
}

.main {
	width: 50%;
}

.cls, .btn {
	border-radius: 25px;
	margin-top: 12px;
	transition: 0.4s ease;
}

.btn {
	width: 100%
}

.form {
	margin-left: 36%;
	margin-top: 36%;
}

.btn:hover {
	background: #2c2d2e;
	border: 0.5px solid white;
	color: white;
	transition: 0.4s ease;
}

.err {
	border: 1px solid red;
}

.alert {
	border-radius: 25px;
	text-align: top;
}
</style>
</head>
<body class="bg-light">
	<div class="container side bg-dark">
		<img src="LOGO-ENSAK-800.png" class="img">
	</div>
	<div class="container main">
		<form class="form" action="Login" method="post" id="form">
			<input type="text" class="form-control cls" placeholder="Login"
				id="log" name="Login"> <input type="password"
				class="form-control cls" placeholder="Password" id="pass"
				name="Password"> <input type="submit" value="Login"
				class="btn btn-danger">
			<div id="err" class="my-xl-5 text-center ${style}">
				<c:out value="${msg}" />
			</div>
		</form>
	</div>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>