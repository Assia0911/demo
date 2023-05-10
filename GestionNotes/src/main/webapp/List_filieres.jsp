<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page import="Model.ModelProfesseur" %>
    <%@ page import="Model.ModelFiliere" %>
	<%!ModelFiliere fil = new ModelFiliere();%>
	<%request.setAttribute("listfil", fil.getListFiliere());
	request.setAttribute("nb", fil.getNb());
	%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=0.5">
    <title>Filieres</title>
    <link rel="icon" href="LOGO-ENSAK-800.png">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
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
            width:70%;
            margin-left:25%;
            transform:scale(0.8);
        }
        .cls{
            border-radius:25px;
            margin-top:12px;
            transition:0.4s ease;
        }

        .form{
            margin-left:22%;
            margin-top:1%;
        }
        .err{
            border:1px solid red;
        }
        .alert{
           border-radius:25px;
           text-align:top;
        }
        .pro{
        width:80%;
        margin-left:30%;
        transform:scale(0.8);
        }
     	.active{
     	border-bottom:0.5px solid white;
     	
     	}
     	.nav-link{
     	color:white;
     	width:100%;
     	}
     	
     	.fluid{
     	width:50%;
     	}
     	
     	.nav-link:hover{
     	border-bottom:0.5px solid rgb(177,177,177);
     	color:white;
     	}
     	.scroll{
     	 width:100%;
     	 height:30%;
         overflow:hidden;
         overflow-y: scroll;
     	}
     	.btn{
     	margin-top:1px;
     	width:42%;
     	height:87%;
     	}
     	
     	.crt{
     	width:80%;
     	margin-left:0;
     	}
     	
     	.example{
     		margin-left:0;
     	}
     	
     	.page{
     	margin-left:60%;
     	margin-top:0;
     	width:10px;
     	}

		.form-check-input{
			width:45%;
			height:41%;
			margin-left:15%;
		}
    </style>
</head>
<body class="bg-light" >
    <div class="container side bg-dark">
        <img src="LOGO-ENSAK-800.png" class="img">
        <div class="container-fluid my-5">
         <div class="row my-3"><a href="Home.jsp"  class="nav-link">Home</a></div>
        <div class="row my-3"><a href="Liste_prof.jsp"  class="nav-link">Professeur</a></div>
        <div class="row my-3 active"><a href="List_filieres.jsp" class="nav-link">Filières</a></div>
        <div class="row my-3 "><a href="liste_module.jsp" class="nav-link">Modules</a></div>
        <div class="row my-3 "><a href="liste_compte.jsp" class="nav-link">Comptes</a></div>
        <div class="row my-3 "><a href="" class="nav-link">Elements</a></div>
    	</div>
    </div>
	<div class="main">
      <table width="100%" class="table form">
      	<tr class="row">
      		<td class="col-md-2 bg-dark text-light text-center">Id</td>
			<td class="col-md-2 bg-dark text-light text-center">Nom</td>
			<td class="col-md-2 bg-dark text-light text-center">Modules</td>
      	</tr>
      	<c:forEach items="${listfil}" var="f">
			<tr class="row">
      			<td class="col-md-2 text-center">${f.idFiliere}</td>
      			<td class="col-md-2 text-center" >${f.nom}</td>
      			<td class="col-md-2 text-center">
            	  		<c:forEach items="${f.modules}" var="m">
                  				<p>${m.nom} <p>        
                		</c:forEach>
            	</td>
      		</tr>
      </c:forEach>
     </table>
</body>
</html>