<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login de Usuario</title>

<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">

<c:url var="validationjs" value="/resource/js/validationLogin.js"></c:url>
<script type="text/javascript" src="${validationjs}"></script>

</head>
<body>
	<div id="header" align="center">
		<img id='mainlogo' alt='logo' src='resource/images/logo.jpg'
			width='300px'>
	</div>

	<div id='main' align='center'>

		<form action="validateLogin.htm" method="post"
			onsubmit="return validationSubmit();">

			<table id="tablelogin" cellspacing="0px">

				<tr>
					<td colspan="3" align="center">Inicio de Sesi�n</td>
				</tr>
				<tr>
					<td class="tdLabel"><label for="quizBasic_name" class="label">DNI:</label>
					</td>
					<td><input id='idni' name="idni" onchange="validation('idni')" /></td>

					<td class="tdLabel"><img id="dni_check"></td>
				</tr>
				<tr>
					<td class="tdLabel"><label for="quizBasic_age" class="label">Contrase�a:</label>
					</td>
					<td><input id='spassword' name="spassword" value='123Abcde'
						type="password" onchange="validation('spassword')" /></td>
					<td class="tdLabel"><img id="password_check"></td>
				</tr>

				<tr>
					<td colspan="3" align="center">
						<button>Iniciar Sesi�n</button>
					</td>
				</tr>
				<tr>
					<td colspan="3" align="center" class="tdLabel"><div
							id="imessageregistration">
							<c:out value="${smessage}" />
						</div></td>
				</tr>
				<tr>
					<td colspan="3" align="center" class="tdLabel"><div
							id="imessage"></div></td>
				</tr>
			</table>

		</form>

		<form action='registration.htm' method='get'>
			<p class='maincontent2'>
				�Quiere ser parte de la red de trabajadores de 101 Kachuelitos?
				<button>Unete</button>
			</p>
		</form>
	</div>
	<div id="footercontent" align='center'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>
</body>
</html>