<%@page import="cs5200.jwsjpa.dao.SiteDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Site</title>
<script src="jquery-1.11.2.js"></script>
</head>
<body>

	<h1>Hello from Site</h1>

	<!-- <script>
		$(function() {
			alert("Hello from JQuery");
			var site = {
				"id" : 2,
				"name" : "Site 2 Updated",
				"latitude" : 21.33,
				"longitude" : 43.55
			};
			
			//Create Site
			/* $.ajax({
				url: "/CS5200_JWS_JPA/api/site",
				type: "post",
				dataTpe: "json",
				contentType: "application/json; charset=utf-8",
				data: JSON.stringify(site),
				success: function(response) {
					console.log("yahoo");
				}
			}); */
			
			
			// Delete Site
			/* $.ajax({
				url: "/CS5200_JWS_JPA/api/site/3",
				type: "delete",
				//dataTpe: "json",
				//contentType: "application/json; charset=utf-8",
				//data: JSON.stringify(site),
				success: function(response) {
					console.log("yahoo");
				}
			}); */
			
			$.ajax({
				url: "/CS5200_JWS_JPA/api/site/2",
				type: "put",
				dataTpe: "json",
				contentType: "application/json; charset=utf-8",
				data: JSON.stringify(site),
				success: function(response) {
					console.log("yahoo");
				}
			});
			
		});
	</script> -->


</body>
</html>