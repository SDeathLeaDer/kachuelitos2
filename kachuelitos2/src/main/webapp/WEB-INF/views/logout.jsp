<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/views/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cerrar sessión</title>

<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">


</head>
<body>

	<div id="header" align="center">
		<img id='mainlogo' alt='logo' src='resource/images/logo.jpg' width='300px'>
	</div>

	<div id='main' align='center'>
		<p>Se cerro de manera satifactoria !!!</p>

		<form action='login.htm' method='get'>
			<p class='maincontent2'>
				Regresar a la pagina de inicio de =)
				<button>Regresar</button>
			</p>
		</form>
	</div>
	<div id="footercontent" align='center'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
</body>
</html>