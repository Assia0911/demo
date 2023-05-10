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

.cls {
	border-radius: 25px;
	margin-top: 12px;
	transition: 0.4s ease;
}

.form {
	margin-left: 42%;
	margin-top: 6%;
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

.btn {
	margin-left: 32%;
	width: 50%;
}

.nav-link:hover {
	border-bottom: 0.5px solid rgb(177, 177, 177);
	color: white;
}

.form-select {
	width: 50%;
}

.label {
	width: 30%;
}

.imgl {
	height: 24px;
	width: auto;
}
</style>
</head>
<body class="bg-light my-5">
	<div class="container side bg-dark">
		<a href="nav" class="col-md-6"><img src="logout.jpg"
			class="imgl my-2" /></a><br> <img src="LOGO-ENSAK-800.png"
			class="img">
		<div class="container-fluid my-5">
			<div class="row my-3">
				<a href="HomeProf.jsp" class="nav-link">Tableau de bord</a>
			</div>
			<div class="row my-3">
				<a href="GestionNotes.jsp" class="nav-link">Notes</a>
			</div>
			<div class="row my-3 active">
				<a href="#" class="nav-link">Exporter les elements validés</a>
			</div>
		</div>
	</div>
	<div class="container pro my-5">
		<h3>Expoter vos données:</h3>
		<div class="row">
			<div class="col-md-6">
				<label for="semestre" class="label">Semestre:</label> <select
					class="form-select text-center" name="semestre">
					<option value="null">--select--</option>
					<option value="S1">S1</option>
					<option value="S2">S2</option>
				</select>
			</div>
			<div class="col-md-6">
				<label for="modalite" class="label">Modalite:</label> <select
					class="form-select text-center" name="modalite">
					<option value="null">--select--</option>
					<option value="cc1">Tout</option>
					<option value="cc1">CC1</option>
					<option value="cc2">CC2</option>
					<option value="tp">TP</option>
					<option value="projet">Projet</option>
				</select>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6">
				<label for="element" class="label">Element:</label> <select
					class="form-select text-center" name="element">
					<option value="null">--select--</option>
					<c:forEach items="${prof.getElementsValide()}" var="p">
						<option value="${p.idElement}">${p.nom}</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="row my-4">
			<div class="col-md-6">
				<input type="submit" value="Exporter Excel"
					class="btn btn-outline-secondary">
			</div>
			<div class="col-md-6">
				<input type="submit" value="Exporter PDF"
					class="btn btn-outline-primary">
			</div>
		</div>
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