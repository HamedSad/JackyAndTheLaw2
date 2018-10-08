<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>

<!-- Required meta tags -->

<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">



<title>Hello, world!</title>

</head>
<header> </header>
<body>

	<h1>INSCRIPTION</h1>

	<p>${errorMotdePasse}</p>

	<form action="InscriptionLet" method="post">
	
		

			<div class="col">

				<label for="exampleInputEmail1">Nom *</label> 
				<input name="nomUser" required
					class="d-flex justify-content-cente" type="text"
					class="form-control">

			</div>

			<div class="col">

				<label for="exampleInputEmail2" >Prenom *</label> 
				<input name="prenomUser" required
					class="d-flex justify-content-cente" type="text"
					class="form-control">

			</div>

			<div class="col">
				<label for="exampleInputEmail3"> Mail *</label> 
				<input name="mail" required type="email"
					class="d-flex justify-content-cente" type="text"
					class="form-control">

			</div>

			<div class="col">
				<label for="exampleInputEmail4">Entreprise</label> 
				<input name="entreprise"
					class="d-flex justify-content-cente" type="text"
					class="form-control">

			</div>

			<div class="col">

				<label for="exampleInputEmail5" >Domaine Professionel</label> <input
				name="domaineProfessionel"
					class="d-flex justify-content-cente" type="text"
					class="form-control">

			</div>

			<div class="col">
				<label for="exampleInputPassword6">Mot de passe *</label> 
				<input name="motDePasse" required
					class="d-flex justify-content-cente" type="password"
					class="form-control" id="exampleInputPassword6">
			</div>
			
			<div class="col">
				<label for="exampleInputPassword6">Confirmation Mot de passe *</label> 
				<input name="motDePasse2" required
					class="d-flex justify-content-cente" type="password"
					class="form-control" id="exampleInputPassword6">
			</div>

			<br>
	<input type="submit" value="Inscription">

	</form>

</body>
</html>