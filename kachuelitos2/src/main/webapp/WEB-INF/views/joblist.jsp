<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mis trabajos</title>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url var="estiloscss2" value="/resource/styles/tab2.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss2}">

<c:url var="js" value="/resource/js/jquery-1.10.1.min.js"></c:url>
<script type="text/javascript" src="${js}"></script>

<script>
	$(document).ready(
			function() {
				setInterval(function() {
					var randomnumber = Math.floor(Math.random() * 100);

					$.ajax({
						url : "http://rest-service.guides.spring.io/greeting"
					}).then(
							function(data) {
								$('#greeting-id').text(data.id);
								$('#greeting-content').text(data.content);
								$('#show').text(
										'I am getting refreshed every 3 seconds..! Random Number ==> '
												+ randomnumber);
							});

				}, 5000);
			});
</script>


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
			<li><a href='useraccount.htm' title='Home' class='current'>Búsqueda</a></li>
			<li><a href='userservices.htm' title='Home'>Otro</a></li>
			<li><a href='contact2.htm' title='Home'>Contáctenos</a></li>
			<%--  <li><a href='usercv.jsp' title='Home' >Mi CV</a></li> --%>
		</ul>
	</div>

	<div id='content2'>
		<div id='contentSearh'></div>

		<div id='contentBanner' style="border-left: 1px solid black">
			<div id='socialnetwork'>

				<div>
					<img src="${icon}">
					<c:out value="${title}" />
				</div>
				<br>

				<div id="imessage"
					style="height: 80%; width: 100%; border: 1px solid #ccc; overflow: auto;">


					<div id="greeting-id" align="center"></div>
					<div id="greeting-content" align="center"></div>
					<div id="show" align="center"></div>

					<table>
						<tr>
							<td>Publicado</td>
							<td>Contenido</td>
						</tr>

						<c:forEach items="${listEntry}" var="item">
							<tr>
								<td><c:out value="${item.published}" /></td>
								<td>${item.content}</td>
							</tr>
						</c:forEach>
					</table>
				</div>

			</div>


			<div id='other' align="center">
				<img alt='logo' src='resource/images/bannercompu.jpg' width='150px'
					align="middle">
			</div>
		</div>
	</div>

	<div id="footercontent" align='center'>
		<p>Derechos Reserv@dos 101 Kachuelitos 2014</p>
	</div>

</body>
</html>