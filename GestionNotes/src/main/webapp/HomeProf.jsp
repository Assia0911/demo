<%@page import="org.apache.catalina.connector.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome</title>
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
	width: 90%;
	margin-left: 26%;
	display:;
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
	margin-left: 42%;
	margin-top: 6%;
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

.pro {
	width: 58%;
	margin-left: 30%;
	margin-top: 8%;
}

.active {
	border-bottom: 0.5px solid white;
}

.nav-link {
	color: white;
	width: 100%;
}

.nav-link:hover {
	border-bottom: 0.5px solid rgb(177, 177, 177);
	color: white;
}

.card-body, .card {
	border-radius: 22px;
	margin-right: 12px;
}

.imgl {
	height: 24px;
	width: auto;
}
</style>
</head>

<body class="bg-light">
	<c:choose>
		<c:when test="${!empty prof}">
			<div class="container side bg-dark">
				<a href="nav" class="col-md-6"><img src="logout.jpg"
					class="imgl my-2" /></a><br> <img src="LOGO-ENSAK-800.png"
					class="img">
				<div class="container-fluid my-5">
					<div class="row my-3 active">
						<a href="HomeProf.jsp" class="nav-link">Tableau de bord</a>
					</div>
					<div class="row my-3">
						<a href="GestionNotes.jsp" class="nav-link">Notes</a>
					</div>
					<div class="row my-3">
						<a href="ElementsVal.jsp" class="nav-link">Exporter les
							elements validés</a>
					</div>
				</div>
			</div>
			<div class="container main">
				<div class="container my-3">
					<h3 class="text-primary col-md-6">${prof.nom} ${prof.prenom}</h3>
					<p>
				</div>
				<div class="d-flex my-5">
					<div class="card" style="width: 18rem;">
						<div class="card-body bg-dark text-light">
							<h5 class="card-title text-left">Elements en total:</h5>
							<h2 class="card-text text-right">
								<c:out value="${prof.elements.size()}"></c:out>
							</h2>
						</div>
					</div>
					<div class="card" style="width: 18rem;">
						<div class="card-body bg-primary text-light">
							<h5 class="card-title text-left">Elements Validés:</h5>
							<h2 class="card-text text-right">
								<c:out value="${prof.getElementsValideNb()}"></c:out>
							</h2>
						</div>
					</div>
					<div class="card" style="width: 18rem;">
						<div class="card-body bg-danger text-light">
							<h5 class="card-title text-left">Elements en attente:</h5>
							<h2 class="card-text text-right">
								<c:out
									value="${prof.elements.size()-prof.getElementsValideNb()}"></c:out>
							</h2>
						</div>
					</div>
				</div>
			</div>

			<div class="container pro">
				<p class="text-dark">Avancement:</p>
				<div class="progress">
					<div
						class="progress-bar progress-bar-striped progress-bar-animated"
						role="progressbar"
						aria-valuenow="${prof.getElementsValideNb()/prof.elements.size()}"
						aria-valuemin="0" aria-valuemax="100"
						style="width: ${ ( prof.getElementsValideNb() / prof.elements.size() ) *100}%"></div>
				</div>
				<p class="text-primary">${ ( prof.getElementsValideNb() / prof.elements.size() ) *100}%</p>
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
		</c:when>
		<c:otherwise>
			<div class="container text-danger my-4">
				<h3>You should connect to see content</h3>
				<a href="index.jsp" class="link">Conenct</a>
			</div>
		</c:otherwise>
	</c:choose>
</body>
</html>
