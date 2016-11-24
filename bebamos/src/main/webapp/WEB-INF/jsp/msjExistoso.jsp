<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
				<a class="navbar-brand" href="#">TomemosAlgo.com</a>
			</div>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control"
						placeholder="Busca un trago">
				</div>
				<button type="submit" class="btn btn-default">Buscar</button>
			</form>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="index">Home</a></li>
					<li class="active"><a href="login">Ingresar</a></li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>

	<div class="container">
		<div class="col-md-4"></div>
		<div class="col-md-4 contenido">

			<div class="panel panel-default md">
				<div class="panel-heading tcolor">
					<h3>TomemosAlgo</h3>
				</div>
				<div class="panel-body">

					<p>El usuario fue creado con éxito</p>
					<a href="login">Ir al Login</a>

				</div>
			</div>

		</div>
		<div class="col-md-4"></div>
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
</body>
</html>