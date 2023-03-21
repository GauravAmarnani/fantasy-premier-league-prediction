<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="registration.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<link rel="stylesheet" href="registration.js">
<script type="text/javascript" src="registration.js"></script>
<style type="text/css">
body {
    background: url("https://media.istockphoto.com/photos/soccer-ball-in-the-stadium-on-a-black-background-3d-rendering-picture-id1321184801?k=20&m=1321184801&s=612x612&w=0&h=cHsD_0P_GKBWNR7bWabMu_LpuemLegm_r-nyh9SQEdU=");
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
    margin: 0;
    font-family: 'Times New Roman', Times, serif;
}

.container {
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    position: absolute;
    background: rgba(0, 0, 0, 0.5);
    box-shadow: 0 0 10px white;
    border-radius: 20px;
    padding: 20px;
}

.formname {
    color: white;
    text-align: center;
    font-weight: bold;
    font-size: 40px;
    margin-bottom: 20px;
}

.field-name-block {
    text-align: right;
    padding-right: 20px;
    width: 40%;
    display: inline-block;
}

.field-name {
    color: white;
    font-size: 25px;
    text-align: center;
    font-weight: bold;
    margin: 10px;
}

.field-input-block {
    display: inline-block;
}

input {
    margin: 10px;
    padding: 10px;
    width: 300px;
    border-radius: 20px;
    font-size: 20px;
    border: none;
    outline: none;
    text-align: center;
}

.buttons-block {
    text-align: center;
}

.button {
    margin: 20px;
    padding: 10px;
    border: 2px solid white;
    background: rgba(255, 255, 255, 0.5);
    color: white;
    outline: none;
    border-radius: 20px;
    font-size: 20px;
    width: 150px;
}

.button:hover {
    color: black;
    background-color: white;
}

.warning {
    color: red;
    background: white;
    font-size: 20px;
    border-radius: 50%;
}

.warning-hide {
    display: none !important;
}

.register a {
    text-decoration: none;
    color: white;
    margin-left: 320px;
}
</style>
</head>
<body onload="onLoad()">
	<div style="color:white;">
		<c:if test="${param.error != null}">
			<h2 style="color: red;">User details could not be updated because
				of some server issue. Please try again later.</h2>
		</c:if>
	
		<c:if test="${param.errorwfu != null}">
			<h2 style="color: red;">Server Side Issue. Please try again
				later.</h2>
		</c:if>
	
		<c:if test="${param.errorpne != null}">
			<h2 style="color: red;">Phone Number cannot be empty.</h2>
		</c:if>
	
		<c:if test="${param.errorpnb != null}">
			<h2 style="color: red;">Phone Number cannot be blank spaces.</h2>
		</c:if>
	
		<c:if test="${param.errorpnpi != null}">
			<h2 style="color: red;">Phone Number is not valid.</h2>
		</c:if>
	
		<c:if test="${param.erroree != null}">
			<h2 style="color: red;">Email cannot be empty.</h2>
		</c:if>
	
		<c:if test="${param.erroreb != null}">
			<h2 style="color: red;">Email cannot be blank spaces.</h2>
		</c:if>
	
		<c:if test="${param.errorepi != null}">
			<h2 style="color: red;">Email is not valid.</h2>
		</c:if>
		
		<c:if test="${param.errorune != null}">
			<h2 style="color: red;">User Name cannot be empty.</h2>
		</c:if>
	
		<c:if test="${param.errorunb != null}">
			<h2 style="color: red;">User Name cannot be blank spaces.</h2>
		</c:if>
	
		<c:if test="${param.erroruns != null}">
			<h2 style="color: red;">User Name size is not valid. Should be between more than 4 and less than 31.</h2>
		</c:if>
		
		<c:if test="${param.errorunae != null}">
			<h2 style="color: red;">User Name already exists.</h2>
		</c:if>
	
		<c:if test="${param.success != null}">
			<h2 style="color: green;">Successfully Updated Information.</h2>
		</c:if>
		<h1>${error}</h1>
	
	</div>
    <div class="container">
        <div class="formname">Sign Up</div>
        <div>
            <form action="process-registration" id="signup">
                <div class="field-name-block">
                    <label for="firstName" class="field-name">First Name</label>
                </div>
                <div class="field-input-block">
                    <input name="firstName" type="text" placeholder="First Name" maxlength="15">
                    <i id="firstNameWarning" class="fas fa-exclamation-circle warning warning-hide"></i>
                </div>
                <div class="field-name-block">
                    <label for="lastName" class="field-name">Last Name</label>
                </div>
                <div class="field-input-block">
                    <input type="text" name="lastName" placeholder="Last Name" maxlength="15">
                    <i id="lastNameWarning" class="fas fa-exclamation-circle warning warning-hide"></i>
                </div>
                <div class="field-name-block">
                    <label for="name" class="field-name">Email</label>
                </div>
                <div class="field-input-block">
                    <input type="text" name="email" placeholder="email@example.com">
                    <i id="emailWarning" class="fas fa-exclamation-circle warning warning-hide"></i>
                </div>
                <div class="field-name-block">
                    <label for="phoneNumber" class="field-name">Mobile</label>
                </div>
                <div class="field-input-block">
                    <input type="number" name="phoneNumber" placeholder="0000000000" maxlength="10">
                    <i id="mobileWarning" class="fas fa-exclamation-circle warning warning-hide"></i>
                </div>
                <div class="field-name-block">
                    <label for="password" class="field-name">Create Password</label>
                </div>
                <div class="field-input-block">
                    <input type="password" name="password" placeholder="Password" maxlength="20">
                    <i id="createWarning" class="fas fa-exclamation-circle warning warning-hide"></i>
                </div>
                <div class="field-name-block">
                    <label for="confirmPassword" class="field-name">Confirm Password</label>
                </div>
                <div class="field-input-block">
                    <input type="password" name="confirmPassword" placeholder="Password" maxlength="20">
                    <i id="confirmWarning" class="fas fa-exclamation-circle warning warning-hide"></i>
                </div>
                <div class="buttons-block">
                	<input type="submit" value="Sign In" class="button">
                    <input type="reset" value="cancel" class="button">
                </div>
            </form>
        </div>
    </div>
</body>
</html>