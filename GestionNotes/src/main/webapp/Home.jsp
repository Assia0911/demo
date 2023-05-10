<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
	 <style>
        .side{
            position:absolute;
            left:0;
            top:0;
            height:100%;
            width:20%;
        }
        .img{
            margin-top:6%;
            margin-left:15%;
            width:50%;
            height:12%;
        }
        .main{
            width:50%;
        }
        .cls{
            border-radius:25px;
            margin-top:12px;
            transition:0.4s ease;
        }
        .form{
            margin-left:42%;
            margin-top:6%;
        }
        .err{
            border:1px solid red;
        }
        .alert{
           border-radius:25px;
           text-align:top;
        }
        .pro{
        width:58%;
        margin-left:30%;
        margin-top:8%;
        }
     	.active{
     	border-bottom:0.5px solid white;
     	
     	}
     	.nav-link{
     	color:white;
     	width:100%;
     	}
     	.btn{
     	margin-left:32%;
     	width:50%;
     	}
     	.nav-link:hover{
     	border-bottom:0.5px solid rgb(177,177,177);
     	color:white;
     	}
     	.form-select{
     	width:50%;
     	}
     	.label{
     	width:30%;
     	}
     	.imgl{
height:24px;
width:auto;
}
.card-body, .card {
	border-radius: 22px;
	margin-right: 12px;
}
.imgl{
height:24px;
width:auto;
}

    </style>
</head>
<body>
<c:choose>
<c:when test="${!empty nom}">
 <div class="container side bg-dark">
 		<a href="nav" class="col-md-6"><img src="logout.jpg" class="imgl my-2"/></a><br>
        <img src="LOGO-ENSAK-800.png" class="img">
        <div class="container-fluid my-5">
         <div class="row my-3 active"><a href="Home.jsp"  class="nav-link">Home</a></div>
        <div class="row my-3"><a href="Liste_prof.jsp"  class="nav-link">Professeur</a></div>
        <div class="row my-3"><a href="List_filieres.jsp" class="nav-link">Filières</a></div>
        <div class="row my-3"><a href="liste_module.jsp" class="nav-link">Modules</a></div>
        <div class="row my-3"><a href="liste_compte.jsp" class="nav-link">Comptes</a></div>
        <div class="row my-3"><a href="" class="nav-link">Elements</a></div>
    	</div>
    </div>
    <div class="container pro my-5 d-flex">
    	<div class="card" style="width: 18rem;">
				<div class="card-body bg-dark text-light">
					<h5 class="card-title text-left">Elements en total:</h5>
					<h2 class="card-text text-right">
					65
					</h2>
				</div>
			</div>
			<div class="card" style="width: 18rem;">
				<div class="card-body bg-dark text-light">
					<h5 class="card-title text-left">Professeurs en total:</h5>
					<h2 class="card-text text-right">
					39
					</h2>
				</div>
			</div>
			<div class="card" style="width: 18rem;">
				<div class="card-body bg-danger text-light">
					<h5 class="card-title text-left">Etudiants en total:</h5>
					<h2 class="card-text text-right">
					847
					</h2>
				</div>
			</div>
			</div><br>
			 <div class="container pro my-5 d-flex">
			<div class="card" style="width: 50%;">
				<div class="card-body bg-primary text-light">
					<h5 class="card-title text-left">Modules en total:</h5>
					<h2 class="card-text text-right">
					27
					</h2>
				</div>
			</div>
			<div class="card" style="width: 50%;">
				<div class="card-body bg-dark text-light">
					<h5 class="card-title text-left">Filieres en total:</h5>
					<h2 class="card-text text-right">
					7
					</h2>
				</div>
			</div>
			
		</div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>




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