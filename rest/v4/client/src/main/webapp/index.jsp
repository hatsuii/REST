<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ajout formation</title>
</head>
<body>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>

	<nav class="navbar navbar-expand-lg navbar-light bg-warning">
		<a class="navbar-brand" href="#"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item active"><a class="nav-link" href="#"
					onclick="document.location.href='index.jsp';">Ajouter une
						formation</a></li>
				<li class="nav-item active"><a class="nav-link" href="#"
					onclick="document.location.href='';">Supprimer une formation</a></li>
				<li class="nav-item active"><a class="nav-link" href="#"
					onclick="document.location.href='listeFormation.jsp';">Liste
						formation</a></li>
			</ul>
		</div>
	</nav>

	<h2>Bienvenue. ci-dessous, vous pourrez ajouter une formation en
		choississant le nom !</h2>
	<form action="ajoutFormation" method="post">
		<div class="form-group">
			<label for="nomformation">Nom de formation</label> <input type="text"
				class="form-control" id="nomformation" aria-describedby="emailHelp"
				name="nomformation"> <small id="emailHelp"
				class="form-text text-muted">choisissez le nom que vous
				voulez ! ;)</small>
		</div>
		<button type="submit" class="btn btn-primary" data-toggle="modal"
			data-target="#staticBackdrop">Submit</button>
	</form>

	<br>
	<button class="btn btn-primary" href="#"
		onclick="document.location.href='listeFormation.jsp';">Afficher
		liste formation</button>
</body>
</html>
