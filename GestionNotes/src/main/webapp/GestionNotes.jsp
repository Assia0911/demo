<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="Model.ModelEtudiant"%>
<%!ModelEtudiant et = new ModelEtudiant();%>
<%request.setAttribute("listeet", et.getListeet());
	request.setAttribute("nb", et.getNb());%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=0.5">
<title>Notes</title>
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
	width: 70%;
	margin-left: 10%;
	transform: scale(0.8);
}

.cls {
	border-radius: 25px;
	margin-top: 12px;
	transition: 0.4s ease;
}

.form {
	margin-left: 22%;
	margin-top: 1%;
}

.err {
	border: 1px solid red;
}

.alert {
	border-radius: 25px;
	text-align: top;
}

.pro {
	width: 80%;
	margin-left: 30%;
	transform: scale(0.8);
}

.active {
	border-bottom: 0.5px solid white;
}

.nav-link {
	color: white;
	width: 100%;
}

.fluid {
	width: 50%;
}

.nav-link:hover {
	border-bottom: 0.5px solid rgb(177, 177, 177);
	color: white;
}

.scroll {
	width: 100%;
	height: 30%;
	overflow: hidden;
	overflow-y: scroll;
}

.btn {
	margin-top: 1px;
	width: 42%;
	height: 87%;
}

.crt {
	width: 80%;
	margin-left: 0;
}

.example {
	margin-left: 0;
}

.page {
	margin-left: 60%;
	margin-top: 0;
	width: 10px;
}

.form-check-input {
	width: 45%;
	height: 41%;
	margin-left: 15%;
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
					<div class="row my-3">
						<a href="HomeProf.jsp" class="nav-link">Tableau de bord</a>
					</div>
					<div class="row my-3 active">
						<a href="HomeProf.jsp" class="nav-link">Notes</a>
					</div>
					<div class="row my-3">
						<a href="ElementsVal.jsp" class="nav-link">Exporter les
							elements validés</a>
					</div>
				</div>
			</div>
			<div class="container pro my-1">
				<div class="row">
					<div class="col-md-4">
						<label for="semestre" class="label">Semestre:</label> <select
							class="form-select text-center" name="semestre">
							<option value="null">-select-</option>
							<option value="S1">S1</option>
							<option value="S2">S2</option>
						</select>
					</div>
					<div class="col-md-4">
						<label for="modalite" class="label">Modalite:</label> <select
							class="form-select text-center" name="modalite" id="modalite">
							<option value="null">-select-</option>
							<c:forEach items="${element.modalites}" var="p">
								<option value="${p.idMod}">${p.nom}</option>
							</c:forEach>
						</select>
					</div>
					<div class="col-md-4">
						<input type="submit" value="Valider"
							class="btn btn-primary disabled">
					</div>
				</div>
				<div class="row">
					<div class="col-md-4">
						<label for="element">Element:</label> <select
							class="form-select text-center" name="element" id="element">
							<option value="null">-select-</option>
							<c:forEach items="${prof.elements}" var="p">
								<option value="${p.idElement}">${p.nom}</option>
							</c:forEach>
						</select>
					</div>
					<div class="col-md-4">
						<input type="text" placeholder="Rechercher"
							class="form-control crt">
					</div>
					<div class="col-md-4">
						<input type="submit" value="Enregister"
							class="btn btn-outline-secondary">
					</div>
				</div>
			</div>
			<div class="main">
				<table width="100%" class="table form">
					<tr class="row">
						<td class="col-md-2 bg-dark text-light text-center">Id</td>
						<td class="col-md-2 bg-dark text-light text-center">Nom</td>
						<td class="col-md-2 bg-dark text-light text-center">Prenom</td>
						<td class="col-md-2 bg-dark text-light text-center">Note</td>
						<td class="col-md-2 bg-dark text-light text-center">Abs</td>
					</tr>
					<c:forEach items="${listeet}" var="p">
						<tr class="row">
							<td class="col-md-2">${p.cne}</td>
							<td class="col-md-2">${p.nom}</td>
							<td class="col-md-2">${p.prenom}</td>
							<td class="col-md-2"><input type="number"
								class="form-control" name="note${p.cne}" id="note${i}">
								<input type="hidden" name="cne${p.cne}" value="${p.cne}" /> <input
								type="hidden" name="modalite" value="${p.cne}" /></td>
							<td class="col-md-2"><input type="checkbox" value="abs"
								name="s+${p.cne }" class="form-check-input" id="abs${i}">
							</td>
						</tr>
					</c:forEach>
				</table>
				<div class="container page">
					<nav aria-label="Page navigation example">
						<ul class="pagination">
							<li class="page-item"><a class="page-link" href="#">Previous</a></li>
							<li class="page-item"><a class="page-link" href="#">1</a></li>
							<li class="page-item"><a class="page-link" href="#">2</a></li>
							<li class="page-item"><a class="page-link" href="#">3</a></li>
							<li class="page-item"><a class="page-link" href="#">Next</a></li>
						</ul>
					</nav>
				</div>
			</div>
			<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
			<script>
    	$(document).ready(function(){
    		$('#element').change(function(){
    			 var id=$("#element").val();
    			 $.ajax({
    				 type:'GET',
    				 data:{id:id},
    				 url:'select',
    				 success: function(){}
    			 });
    		});
    	});
    	
    </script>
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