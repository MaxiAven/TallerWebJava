<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<link rel="stylesheet" type="text/css" href="css/stylo.css">

<title>QueTomamos | Recetas con Onda</title>

<!-- Bootstrap core CSS -->
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
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
			<div id="navbar" class="navbar-collapse collapse">

				<form class="navbar-form navbar-left" action="buscarReceta" method="GET">
					<div class="form-group">
						<input type="text" name="id" class="form-control"	placeholder="Busca un trago">
					</div>
					<input type="submit" value="Buscar" class="btn btn-default"></input>
				</form>

				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="index">Home</a></li>
					<li><a href="login">Ingresar</a></li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">
		<div class="col-md-2"></div>
		<div class="col-md-8 contenido">
				<!-- Comienzo contenedor de receta -->
	
			
			<div class="panel panel-default md">
				<div class="panel-heading tcolor">
					<!-- Comienzo contenedor de receta -->

					<h3 align="center">LISTA DE RECETAS</h3>
				</div>
				<table class="table table-hover fondoTabla">
					<tr>
						<th>TITULO</th>
						<th>DESCRIPCION</th>
					
					</tr>
					<c:forEach items="${recetas}" var="receta">
						<tr class="filas">
						<td width="50%">${receta.getTitulo()}</td>
						<td width="50%">${receta.getDescripcion()}</td>
						
						
					</c:forEach>
				</table>

			</div>

		</div>
		<!-- /Fin contenedor de receta -->


		</div>
		<div class="col-md-2"></div>
	</div>
	<!-- /container -->




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