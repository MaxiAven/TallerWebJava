<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">

<title>QueTomamos | Recetas con Onda</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<!-- <link href="css/bootstrap-theme.min.css" rel="stylesheet">-->


</head>
<body role="document">

	<!-- Fixed navbar -->
	<nav class="menu navbar navbar-inverse">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">TomemosAlgo.com</a>
		</div>
		<form class="navbar-form navbar-left">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Busca un trago">
			</div>
			<a href="lista" class="btn btn-success btnLista">Buscar</a>
		</form>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="index">Home</a></li>
				<li><a href="login">Ingresar</a></li>
				

			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">


		<div class="ingredientes">

			<div class="panel panel-default md">
				<div class="panel-heading tcolor">
					<h3 align="Center">INGREDIENTES FAVORITOS</h3>
				</div>
				<div class="panel-body">

					<form:form action="buscarIngrediente" method="POST"
						commandName="buscarIngrediente1">

						<div class="form-group has-feedback has-feedback-left">

							<form:label path="ingrediente">Ingrediente 1:</form:label>
							<form:input path="ingrediente" class="form-control" />


						</div>
						<div class="form-group has-feedback has-feedback-left">

							<form:label path="ingrediente2">Ingrediente 2:</form:label>
							<form:input path="ingrediente2" class="form-control" />


						</div>





						<input type="submit" value="Buscar Recetas"
							class="btn btn-primary" />
					</form:form>



				</div>


			</div>

		</div>
		<div class="container">
			<div class="panel panel-default md">
				<div class="panel-heading tcolor">
					<!-- Comienzo contenedor de receta -->

					<h3 align="center">LISTA DE RECETAS</h3>
				</div>
				<table class="table table-hover fondoTabla">
					<tr>
						<th>TITULO</th>
						<th>DESCRIPCION</th>
						<th></th>
						<th></th>
					</tr>
					<c:forEach items="${recetasingrediente}" var="receta">
						<tr class="filas">
							<td width="50%">${receta.getTitulo()}</td>
							<td width="50%">${receta.getDescripcion()}</td>
					</c:forEach>
				</table>

			</div>
			<!-- /Fin contenedor de receta -->
		</div>




		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<script>
			window.jQuery
					|| document
							.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')
		</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
</body>
</html>