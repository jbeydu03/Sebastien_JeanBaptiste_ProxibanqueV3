<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<div class="col-sm-12  offset-lg-1 col-lg-10">

			<h1>Accueil - ProxiBanque</h1>

			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<span class="navbar-brand">Menu</span>
				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav mr-auto">
						<li class="nav-item active"><a class="nav-link"
							href="accueil.html">Accueil <span class="sr-only">(current)</span></a>
						</li>

						<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Gérer vos clients  </a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
								<a class="dropdown-item" href="SelectAllClients">Liste de vos clients</a> <a
									class="dropdown-item" href="ajoutClient.html">Ajouter un client</a>
							</div></li>
							<li class="nav-item dropdown"><a
							class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> Opérations bancaires</a>
							<div class="dropdown-menu" aria-labelledby="navbarDropdown">
	
								<a class="dropdown-item" href="#">Réaliser un virement</a> 
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="#"> Faire un audit</a>
							
							</div></li>
	
					</ul>
				</div>
			</nav>
			
		<table class="col-sm-12 table table-striped">
		<tr>
			<th>ID</th>
			<th>Nom</th>
			<th>Prénom</th>
			<th>Afficher</th>
			<th>Modifier</th>
			<th>Supprimer</th>

			
		</tr>
		<c:forEach items="${listeclients}" var="client">
			<tr>
				<td><c:out value="${client.id}"/></td>
				<td><c:out value="${client.familyName}" /></td>
				<td><c:out value="${client.name}" /></td>
			<td><a href="AffichageSimpleClient?idclient=${client.id}"><i class="fas fa-eye"></i></a></td>
  				<td><a href="AffichageClient?idclient=${client.id}"><i class="far fa-edit"></i></a></td>
 				<td><button  type="button" class="btn btn-link" name=${client.id} id="delete"  value="${client.id}" >x</button></td>
			</tr>
<%-- 	 <c:set var="item" value="${names} ${joueurC.name}"/> --%>
		</c:forEach>
	</table>

		</div>
		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->

		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
			integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
			integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
			crossorigin="anonymous"></script>
		<script src="js/fonctionREST.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
</body>
</html>