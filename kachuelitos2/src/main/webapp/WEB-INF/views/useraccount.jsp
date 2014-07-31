<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mi cuenta</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
			<li><a href='useraccount.htm' title='Home' class='current'>Mi
					Cuenta</a></li>
			<li><a href='userservices.htm' title='Home'>Servicios</a></li>
			<li><a href='userworks.htm' title='Home'>Mis Trabajos</a></li>
			<%--  <li><a href='usercv.jsp' title='Home' >Mi CV</a></li> --%>
		</ul>
	</div>
	<div id='content' align='center'>

		<br> <br> <br>

		<form>

			<p class="maincontent">
				Nombre <input id="iname" name="iname" onchange="validation('iname')"
					value=<c:out value="${user.nombreUser}" /> /> <img
					id="name_check" />
			</p>
			<p class="maincontent">
				Apellidos <input id="ilastname" name="ilastname"
					onchange="validation('ilastname')"
					value=<c:out value="${user.apellidoUser}" /> /> <img
					id="lastname_check" />
			</p>
			<p class="maincontent">
				Correo <input id="iemail" name="iemail"
					onchange="validation('iemail')"
					value=<c:out value="${user.correoUser}" /> /> <img
					id="email_check" />
			</p>
			<p class="maincontent">
				Ubigeo <input id="iubigeo" name="iubigeo"
					onchange="validation('iubigeo')"
					value=<c:out value="${user.ubigeoIdUbigeo1}" /> /> <img
					id="ubigeo_check" />
			</p>
			<p class="maincontent">
				Telefono <input id="itelefono" name="itelefono"
					onchange="validation('itelefono')"
					value=<c:out value="${user.telefonoUser}"/> /> <img
					id="dni_check">
			</p>

			<p class="maincontent">
				Direccion <input id="idireccion" name="idireccion"
					onchange="validation('idireccion')"
					value=<c:out value="${user.direccionUser}"/> /> <img
					id="password_check" />
			</p>

			<p class="maincontent">
				Eres trabajador <input type=checkbox name=trab>
			</p>
			<p class="maincontent">
				<button>Guardar</button>
			</p>

		</form>
	</div>
	
	<div  id="footercontent" align='center'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>

</body>
</html>