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

<title>QueTomamos | Recetas con Onda</title>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<!-- <link href="css/bootstrap-theme.min.css" rel="stylesheet">-->

</head>

<body class="login" role="document">

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
				<a class="navbar-brand" href="#">Panel de Administración</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">

				<ul class="nav navbar-nav navbar-right">

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" data-hover="dropdown"> Menu <b
							class="caret"></b>
					</a>
						<ul class="dropdown-menu">
							<li><a href="lista">Ver Recetas</a></li>
							<li><a href="cargarReceta">Cargar Receta</a></li>
							<li><a href="listaUsuario">Ver Usuarios</a></li>
							<li><a href="index">Cerrar Sesión</a></li>
						</ul></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">
		<div class="col-md-2"></div>
		<div class="col-md-8 fondoTabla">
			<!-- Comienzo contenedor de receta -->
			<h3>Editar receta</h3>

			<form:form action="agregarReceta" method="POST" commandName="receta">
				<div class="form-group has-feedback has-feedback-left">

					<form:label path="IdReceta"></form:label>
							<form:hidden path="IdReceta" value="${receta.getIdReceta()}" class="form-control" />
							
							<form:label path="titulo">titulo:</form:label>
							<form:input path="titulo" value="${receta.getTitulo()}" class="form-control" />


				</div>

				<div class="form-group has-feedback has-feedback-left">

					<form:label path="descripcion">descripcion:</form:label>
					<form:textarea path="descripcion" value="${receta.getDescripcion()}" class="form-control recetaDescripcion" rows="10"/>
				</div>

				<input type="submit" value="Editar" class="btn btn-primary" />
				
			</form:form>

		</div>
		<div class="col-md-2"></div>

	</div>

	</div>
	<!-- /Fin contenedor de receta -->
	</div>


	<div class="col-md-2"></div>
	</div>
	<!-- /container -->

	<footer class="footer">
		<div class="col-md-3"></div>
		<div class="col-md-6">
			<p>®Todos los derechos reservados | 2016</p>
		</div>
		<div class="col-md-3"></div>

	</footer>
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
	<script src="js/menu.js" type="text/javascript"></script>
</body>
</html>
