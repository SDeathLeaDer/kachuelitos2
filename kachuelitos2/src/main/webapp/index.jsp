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
		<form action="/Kachuelitos/EmployeeSearch" method="get">
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
		<p>Como ubicarnos</p>
		<iframe
		 src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d7654.701839428713!2d-71.521631506928!3d-16.406994684523248!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses!2ses!4v1407412458828" width="600" height="450" frameborder="0" style="border:0">
		 </iframe>
	</div>

	<div id="footercontent" align="center">
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>

</body>
</html>
