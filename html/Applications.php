<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Web Browser Applications</h2>
	<table border="1" cellpadding="1" cellspacing="1" style="width: 500px; border-collapse: collapse;">
		<tbody>
			<tr>
				<td>Orbit Viewer<br> <a
					href="http://<?php echo $_SERVER['SERVER_ADDR'];?>:8080/JATnetDevelop/orbitViewer/orbitViewer.html"
					style="color: rgb(0, 98, 160); text-decoration: underline;" target="_parent"><img alt=""
						src="images/orbitViewer.png" style="width: 300px;" /> </a>
				</td>
				<td>Orbit Viewer (without Tomcat)<br> <a
					href="../WebContent/orbitViewer/orbitViewer.html"
					style="color: rgb(0, 98, 160); text-decoration: underline;" target="_parent"><img alt=""
						src="images/orbitViewerNoTomcat.png" style="width: 300px;" /> </a></td>
				</tr>
			<tr>
				<td>Sun Position<br> <a
					href="http://<?php echo $_SERVER['SERVER_ADDR'];?>:8080/JATnetDevelop/sunPosition/sunPosition.html"
					style="color: rgb(0, 98, 160); text-decoration: underline;" target="_parent"><img alt=""
						src="images/sunPosition.png" style="width: 300px;" /> </a></td>
				<td>Sun Position (without Tomcat)<br> <a
					href="../WebContent/sunPosition/sunPosition.html"
					style="color: rgb(0, 98, 160); text-decoration: underline;" target="_parent"><img alt=""
						src="images/sunPosition.png" style="width: 300px;" /> </a></td>
				</td>
			</tr>
		</tbody>
	</table>

	<h2>Java Applications</h2>
	<p>
		<iframe frameborder="1" height="1000" scrolling="yes" src="jat/deploy/index.html" width="100%"></iframe>
	</p>


</body>
</html>
