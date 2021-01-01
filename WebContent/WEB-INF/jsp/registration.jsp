<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h4>Registration Page</h4>

		<form action="myreg.do" method="post">
			<table>
				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="eName"></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input type="text" name="eCity"></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input type="email" name="eEmail"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="ePass"></td>
				</tr>
		
				<tr>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</center>

</body>
</html>