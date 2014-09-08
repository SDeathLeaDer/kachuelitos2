<%@ include file="/WEB-INF/views/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mis trabajos</title>

<c:url var="estiloscss" value="/resource/styles/page.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss}">

<c:url var="estiloscss2" value="/resource/styles/tab2.css"></c:url>
<link rel="stylesheet" type="text/css" href="${estiloscss2}">

<c:url var="js" value="/resource/js/jquery-1.10.1.min.js"></c:url>
<script type="text/javascript" src="${js}"></script>

<c:url var="currentStyle" value="/resource/css/demo_table_jui.css"></c:url>
<link rel="stylesheet" type="text/css" href="${currentStyle}">

<c:url var="jquery_ui"
	value="/resource/css/jquery-ui-1.9.2.custom.min.css"></c:url>
<link rel="stylesheet" type="text/css" href="${jquery_ui}">

<c:url var="js2" value="/resource/js/jquery.dataTables.min.js"></c:url>
<script type="text/javascript" src="${js2}"></script>

<c:url var="js3" value="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></c:url>
<script type="text/javascript" src="${js3}"></script>

<c:url var="js4" value="/resource/js/my-demo-table-script.js"></c:url>
<script type="text/javascript" src="${js4}"></script>


<!-- <script src="./resource/js/jquery-1.8.3.min.js"></script>
<script src="./resource/js/jquery.dataTables.min.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<script src="./resource/js/my-demo-table-script.js"></script>

  -->

<style>
.table-container {
	width: 610px;
}

tr.odd {
	background: #c1c1c1 !important;
}

tr.odd td.sorting_1 {
	background: #c1c1c1 !important;
}

tr.even td.sorting_1 {
	background: #FFFFFF !important;
}
</style>


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


	<div id='content2' >
		<div id='contentSearh' align="center">

			<div class="table-container">
				<table cellpadding="0" cellspacing="0" border="0"
					class="display jqueryDataTable">
					<thead>
						<tr>
							<th>DNI</th>
							<th>NOMBRE</th>
							<th>APELLIDO</th>
							<th>TELEFONO</th>
							<th>DIRECCION</th>
							<th>VER</th>

						</tr>
					</thead>
					<tbody>
					</tbody>
				</table>
			</div>
		</div>

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