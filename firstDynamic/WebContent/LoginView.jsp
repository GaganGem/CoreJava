<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
span {
	color: red;
}
</style>
<script>
	function validate(form) {
		var flag = true;
		if (form.login.value == '') {
			document.getElementById("lspan").innerHTML = "login id is required";
			flag = false;
		}
		if (form.password.value == '') {
			document.getElementById("pspan").innerHTML = "password is required";
			flag = false;
		}
		return flag;
	}
</script>
</head>

<body>


	<div style="float: right;">
		<img src="logo.png">
	</div>
	<div style="float: left;">
		<H4>Hi,Guest</H4>
	</div>

	<br>
	<hr style="margin-top: 100px;">
	<center>
		<h1 style="color: red;">Login</h1>
		<form onsubmit="return validate(this)" method="post" action="LoginClt" >
			<table>
				<tr>
					<td><label style="font-size: 20px;" for="login"><b>LoginId*</b></label></td>
					<td><input type="text" name="login"></td>
					<td><span id="lspan"></span></td>
				</tr>
				<tr>
					<td><label style="font-size: 20px;" for="password"><b>Password*</b></label></td>
					<td><input type="password" name="password">
					<td><span id="pspan"></span></td>
					
				</tr>
				<tr>
					<td><input style="margin-top: 10px; margin-bottom: 20px;"
						type="submit" name="lgnbtn" value="SignIn"></td>
				</tr>


			</table>

		</form>
		<div style="font-size: 17px;">
			<a href="Signup.html">Sign Up</a> | <a href="ForgotPassword.html">Forget
				my password</a>
		</div>
		
	</center>
	<hr>
	<CENTER>
		<H3>(c) Copyrights SunilOS Infotech Pvt. Ltd.</H3>
	</CENTER>


</body>
</html>