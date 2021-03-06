<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.3.2/semantic.min.css">
<link rel="stylesheet" href="Style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
	integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
	integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="">
<title>Cahiers des charges</title>
</head>

<body>

	<h1>CAHIERS DES CHARGES</h1>

	<div class="CahiersDesCharges" style="width: 20rem">
		<c:forEach items="${cahiers}" var="archivesDeCasConcrets">
			<img class="card-img-top" src=".../100px180/" alt="Card image cap">
			<div class="card-body">
				<h5>
					Cahier des charges numero

					<c:out value="${archivesDeCasConcrets.getIdArchives()}" />
				</h5>
				<h5 class="card-title">
					<c:out value="${archivesDeCasConcrets.getSujetArchives()}" />
				</h5>
				<p class="card-text">
					<c:out value="${archivesDeCasConcrets.getContenuArchives()}" />
				</p>


				<form action="CahierUnitaireLet" method="post">
					<input type="hidden" name="idCahier" value="${archivesDeCasConcrets.getIdArchives()}" />
					<p>
						<button type="submit" style="background-color: #ff5c39"
							class="btn" value="">En savoir plus</button>
					</p>
					
					
				</form>

				


			</div>
		</c:forEach>
	</div>
</body>
</html>