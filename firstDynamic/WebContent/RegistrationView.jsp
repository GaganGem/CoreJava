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
		if (form.fname.value == '') {
			document.getElementById("fspan").innerHTML = "first name is required";
			flag = false;
		}
		if (form.lname.value == '') {
			document.getElementById("lspan").innerHTML = "last name is required";
			flag = false;
		}
		if (form.email.value == '') {
			document.getElementById("loginspan").innerHTML = "login id is required";
			flag = false;
		}
		if (form.pass.value == '') {
			document.getElementById("passspan").innerHTML = "password is required";
			flag = false;
		}
		if (form.conpass.value == '') {
			document.getElementById("conpassspan").innerHTML = "confirm password is required";
			flag = false;
		}
		if (form.conpass.value != form.pass.value) {
			document.getElementById("conpassspan").innerHTML = "password must be same";
			flag = false;
		}
		if (form.gender.value == '') {
			document.getElementById("genspan").innerHTML = "gender is required";
			flag = false;
		}
		if (form.dob.value == '') {
			document.getElementById("dobspan").innerHTML = "dob is required";
			flag = false;
		} 
		return flag;
	}
</script>
</head>

<body>
	<div style="margin-bottom: 30px;">
		<div style="float: right">
			<img src="logo.png ">
		</div>
		<h4>Hi, Guest</h4>

		<br>
	</div>
	<hr>


	<center>
		<h1 style="color: red;">User Registration</h1>
	</center>
	<br>
	<br>
	<center>
		<form onsubmit="return validate(this)" action="RegistrationClt" method="post">
			<table>
				<tr>
					<td>First Name*</td>
					<td><input type="text" name="fname"></td>
					<td><span id="fspan"></span></td>
				</tr>
				<tr>
					<td>Last Name*</td>
					<td><input type="text" name="lname"></td>
					<td><span id="lspan"></span></td>

				</tr>
				<tr>
					<td>Login ID*</td>
					<td><input type="email" name="email" placeholder="must be mail id"></td>
					<td><span id="loginspan"></span></td>

				</tr>
				<tr>
					<td>Password*</td>
					<td><input type="password" name="pass"></td>
					<td><span id="passspan"></span></td>

				</tr>
				<tr>
					<td>Confirm Password*</td>
					<td><input type="password" name="conpass"></td>
					<td><span id="conpassspan"></span></td>

				</tr>
				<tr>
					<td>Gender*</td>
					<td><select name="gender">
							<option>Select</option>
							<option value="male">Male</option>
							<option value="female">Female</option>
							<option>Other</option>
							
					</select></td>
					<td><span id="genspan"></span></td>

				</tr>

				<tr>
					<td>Date of Birth*</td>
					<td><input type="date" value="dd/MM/yyyy" name="dob"></td>
					<td><span id="dobspan"></span></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Submit"></td>
				</tr>
			</table>
		</form>
	</center>
	<hr>
	<h5>
		<center>© Copyright SunilOS Infotech Pvt Ltd.</center>
	</h5>

</body>
</html>