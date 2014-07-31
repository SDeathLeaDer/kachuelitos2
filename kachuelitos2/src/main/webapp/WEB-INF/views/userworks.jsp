<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="/WEB-INF/views/include.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trabajos</title>

<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url var="estiloscss2" value="/resource/styles/tab.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss2}">


</head>
<body>
	<div id='header'>
		<img id='logo' src='resource/images/logo.jpg' width='250px' />
		<form action='loginout.htm' method='post'>

			<div id='buttonTop'>
				Bienvenido
				<c:out value="${sessionScope.user.nombreUser}" />
				<c:out value="${sessionScope.user.apellidoUser}" />


				<button>Cerrar Sesion</button>
			</div>
		</form>
	</div>

	<div id='tabContainer'>
		<ul id='topTab'>
			<li><a href='useraccount.htm' title='Home'>Mi Cuenta</a></li>
			<li><a href='userservices.htm' title='Home'>Servicios</a></li>
			<li><a href='userworks.htm' title='Home' class='current'>Mis
					Trabajos</a></li>
			<%--  <li><a href='usercv.jsp' title='Home' >Mi CV</a></li> --%>
		</ul>
	</div>
	<div id='content'>
		<p>
			<s:label>Bienvenido !!!</s:label>
			<s:property value="user.name" />
			<s:property value="user.lasname" />
		</p>
	</div>
	<div id="footercontent" align='center'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>

</body>
</html>