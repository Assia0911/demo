<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="Model.ModelCompte"%>
<%@ page import="Model.ModelProfesseur"%>
<%!ModelCompte comp = new ModelCompte();%>
<%!ModelProfesseur pr = new ModelProfesseur();%>
<%request.setAttribute("liste", comp.getListe());
	request.setAttribute("listepr", pr.getListeProf());
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=0.5">
<title>login</title>
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

.imga {
	width: 13%;
	height: 13%;
}

div.bouton-aligne {
	display: inline-block;
	width: 45%;
	margin: 20px 180px 10px 180px;
	text-align: center;
}

div.bouton-aligne1 {
	display: inline-block;
	width: 45%;
	margin: 20px 50px 10px 20px;
	text-align: center;
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

.inline {
	display: inline-block;
}

.form1 {
	margin-left: 25%;
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

.btnl {
	margin-top: 1px;
	margin-left: 90%;
	width: 20%;
	height: 87%;
}

.crt {
	width: 80%;
	margin-left: 0;
}

.example {
	margin-left: 0;
}

.con {
	background-color: black;
	height: 250px;
	width: 450px;
	color: white;
	border-radius: 14px;
}

.y {
	width: 80%;
	margin-left: 10%;
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

.nouveau {
	position: absolute;
	left: 18%;
	top: 100%;
}
</style>
</head>
<body class="bg-light container-fluid">
	<div class="container side bg-dark">
		<img src="LOGO-ENSAK-800.png" class="img">
		<div class="container-fluid my-5">
			<div class="row my-3">
				<a href="Home.jsp" class="nav-link">Home</a>
			</div>
			<div class="row my-3">
				<a href="Liste_prof.jsp" class="nav-link">Professeur</a>
			</div>
			<div class="row my-3 ">
				<a href="List_filieres.jsp" class="nav-link">Filières</a>
			</div>
			<div class="row my-3 ">
				<a href="liste_module.jsp" class="nav-link">Modules</a>
			</div>
			<div class="row my-3 active">
				<a href="liste_compte.jsp" class="nav-link">Comptes</a>
			</div>
			<div class="row my-3 ">
				<a href="" class="nav-link">Elements</a>
			</div>
		</div>
	</div>
	<div class="main">
		<form method="">
			<table width="100%" class="table form1">
				<tr class="row">
					<td class="col-md-3 bg-dark text-light text-center">login</td>
					<td class="col-md-3 bg-dark text-light text-center">nom</td>
					<td class="col-md-3 bg-dark text-light text-center">prenom</td>
					<td class="col-md-3 bg-dark text-light text-center">Supprimer</td>
				</tr>
				<c:forEach items="${liste}" var="c">
					<tr class="row">
						<td class="col-md-3"><input type="text" class="form-control"
							value="${c.login}" name="login"></td>
						<input type="hidden" value="${c.idProf.idProf}" name="idProf" />
						<td class="col-md-3"><input type="text"
							value="${c.idProf.nom}" class="form-control" name="nom" disabled /></td>
						<td class="col-md-3"><input type="text"
							value="${c.idProf.prenom}" class="form-control" name="prenom"
							disabled /></td>
						<td class="col-md-3"><a href="delete?login=${c.login}"
							class="btn1 btn btn-outline-danger">Supprimer</a></td>
					</tr>
				</c:forEach>
			</table>
			<button type="submit" class="btn-outline-primary btnl">Valider</button>
		</form>
	</div>
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
	<div class="nouveau">
		<a data-toggle="collapse" data-target="#contenu"><img
			src="valider.png" class="imga"></a>
		<div class="collapse con" id="contenu">
			<form action="add" method="post" class="form">
				<br> <input type="text" name="login" placeholder="login"
					id="login" class="form-control y" /> <input type="hidden"
					name="Password" value="12345" id="password" class="form-control" /><br>
				<select class="form-control y" name="idProf">
					<c:forEach items="${listepr}" var="c">
						<option value="${c.idProf}">${c.nom}- ${c.prenom}</option>
					</c:forEach>
				</select><br> <input type="submit" value="Enregistrer" name="ok"
					class="btn btn-danger y">
			</form>
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
	<c:if test="${!empty msg}">
		<script type="text/javascript">
	alert("${msg}");
</script>
	</c:if>

</body>
</html>