<%@ include file="/WEB-INF/views/include.jsp"%>

<%-- Redirected because we can't set the welcome page to a virtual URL. --%>




<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bienvenidos a Kachuelitos</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">

</head>
<body>
	<div id="login">

		<form action="login.htm" method="get">
			<button id="buttonTop">Iniciar Sesión</button>
		</form>
		
	
	</div>

	<div id="header" align="center">
		<img id="mainlogo" src="resource/images/logo.jpg" width="300px">
	</div>

	<div align="center" id="main">
		<form action="searchjobs.htm" method="get">
			<p class="maincontent">¿Qué tipo de trabajador esta buscando?</p>
			<p class="maincontent">
				<input name="typework">
			</p>
			<button>Buscar</button>
		</form>
		<form action="registration.htm">
			<p class="maincontent2">
				¿Quiere ser parte de la red de trabajadores de 101 Kachuelitos o
				quieres contratar a alguien?
				<button>Unete</button>
			</p>
		</form>
		
	</div>
<div align="center" id="blog">
		<form action="searchblogs.htm" method="get">
			<p class="maincontent">Busqueda en blogosphera</p>
			<p class="maincontent">
				<input name="typework" id="typework">
			</p>
			<button>Buscar</button>
		</form>
		</div>
	<div id="footercontent" align="center">
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
	

</body>
</html>
