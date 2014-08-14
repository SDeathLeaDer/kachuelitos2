<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contactenos</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url var="estiloscss2" value="/resource/styles/tab2.css"></c:url>
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
			<li><a href='useraccount.htm' title='Home' >Búsqueda</a></li>
			<li><a href='userservices.htm' title='Home'>Otro</a></li>
			<li><a href='contact2.htm' title='Home'class='current'>Contáctenos</a></li>
			<%--  <li><a href='usercv.jsp' title='Home' >Mi CV</a></li> --%>
		</ul>
	</div>

	<div id='content2'>
		<form action="sendContact.htm" method="post"
			style="width: 200px; float: left; margin-left: 36px; margin-top: 36px; " 
			onsubmit="return validationSubmit(); ">
			<!--  <fieldset style="width: 300px; padding: 10px; margin-left: 10px; margin-top: 10px">-->

				<legend align="left">Como contactarnos</legend>
				<p class="maincontent">
					DNI <input id="idni" name="idni" type="text"
						onchange="validation('idni')" /> <img id="dni_check">
				</p>

				<p class="maincontent">
					Nombre <input id="iname" name="iname"
						onchange="validation('iname')" /> <img id="name_check" />
				</p>
				<p class="maincontent">
					Apellidos <input id="ilastname" name="ilastname"
						onchange="validation('ilastname')" /> <img id="lastname_check" />
				</p>
				<p class="maincontent">
					Correo <input id="iemail" name="iemail"
						onchange="validation('iemail')" /> <img id="email_check" />
				</p>
				<p class="maincontent">
					Mensaje <textarea id="imessage" name="imessage"cols="30"rows"6"></textarea>  <img
						id="password_check" />
				</p>
				<br>
				<p class="maincontent">Telefonos.</p>
				<p class="maincontent">054 441163</p>

				<p class="maincontent">
					<button>Enviar</button>
				</p>


				<div id="imessage">
					<c:out value="${smessage}" />
				</div>

			<!--  </fieldset>  -->
		</form>


		<form action="Como encontrarnos" style="width: 600px; float: right">
			<fieldset style="width: 550px; padding: 10px">
				
				
				<iframe src="https://mapsengine.google.com/map/embed?mid=zzt-ahlKlsxM.kAyKItcOgTpo" 
				width="550" height="450" frameborder="0" style="border: 0">
					
				</iframe>
			</fieldset>
		</form>



	</div>

	<div id="footercontent" align='center'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>

</body>
</html>