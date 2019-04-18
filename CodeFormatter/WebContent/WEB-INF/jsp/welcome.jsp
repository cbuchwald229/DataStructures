<html>
	<head>
		<title>Spring MVC Tutorial by Crunchify - Hello World Spring MVC Example</title>
		<style type="text/css">
			body {
				background-image: url('https://cdn.crunchify.com/bg.png');
			}
		</style>
	</head>
	<body>${message}
		<div style="font-family: verdana; padding: 10px; border-radius: 10px; font-size: 12px; text-align: center;">
	        <form action = "welcome.jsp" method = "POST">
	         	Code: <input type = "text" name = "code_input">
	            <br/>
	            <input type = "submit" value = "Submit" />
	        </form>
			<br>
			<br>
			<h1>Formatted Code:</h1>
	         <p><%= request.getParameter("code_input")%></p>	 
		</div>
	</body>
</html>