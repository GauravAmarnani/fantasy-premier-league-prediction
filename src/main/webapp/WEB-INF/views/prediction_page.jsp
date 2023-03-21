<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PREDICTION</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    
    html {
        font-size: 10px;
        font-family: 'Roboto Cn', sans-serif;
    }
    
    a {
        text-decoration: none;
        color: #eee;
    }
    
    body {
        overflow-x: hidden;
    }
    
    header {
        width: 100%;
        height: 100vh;
        background: linear-gradient(to bottom, rgba(0, 0, 0, 0.8), rgba(0, 0, 0, 0.5)), url('https://cdn.pixabay.com/photo/2017/03/15/23/02/football-2147773__340.jpg') center no-repeat;
        background-size: cover;
    }
    
    .container {
        max-width: 120rem;
        width: 90%;
        margin: 0 auto;
        z-index: -1;
    }
    
    nav {
        padding-top: 5rem;
        display: flex;
        justify-content: space-between;
        align-items: center;
        text-transform: uppercase;
        font-size: 1.6rem;
    }
    
    .brand {
        font-size: 3rem;
        font-weight: 300;
        height: 200px;
        width: 200px;
        transform: translate(-100rem);
        animation: slideIn .5s forwards;
    }
    
    nav ul {
        position: relative;
        bottom: 50px;
        display: flex;
    }
    
    nav ul li {
        list-style: none;
        transform: translate(100rem);
        animation: slideIn .5s forwards;
    }
    
    nav ul li:nth-child(1) {
        animation-delay: 0s;
    }
    
    nav ul li:nth-child(2) {
        animation-delay: 0.5s;
    }
    
    nav ul li:nth-child(3) {
        animation-delay: 1s;
    }
    
    nav ul li:nth-child(4) {
        animation-delay: 1.5s;
    }
    
    nav ul li a {
        padding: 1rem 0;
        margin: 0 3rem;
        position: relative;
        letter-spacing: 2px;
    }
    
    nav ul li a:last-child {
        margin-right: 0;
    }
    
    nav ul li a::before,
    nav ul li a::after {
        content: '';
        position: absolute;
        width: 100%;
        height: 2px;
        background-color: crimson;
        left: 0;
        transform: scaleX(0);
        transition: all 0.5s;
    }
    
    nav ul li a::before {
        top: 0;
        transform-origin: left;
    }
    
    nav ul li a::after {
        bottom: 0;
        transform-origin: right;
    }
    
    nav ul li a:hover:before,
    nav ul li a:hover::after {
        transform: scaleX(1);
    }
    
    @keyframes slideIn {
        from {}
        to {
            transform: translateX(0);
        }
    }
    
    .content {
        margin-top: 50px;
        height: 600px;
        width: 1000px;
        background-color: rgba(255, 255, 255, 0.13);
        position: absolute;
        transform: translate(-50%, -50%);
        top: 50%;
        left: 50%;
        border-radius: 10px;
        backdrop-filter: blur(12px);
        border: 2px solid rgba(255, 255, 255, 0.1);
        box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
        padding: 50px 35px;
        z-index: 1;
        font-size: 16px;
        color: white;
    }
    
    .content p {
        font-size: 18px;
    }
    
    .btn {
        margin-top: 60px;
        margin-left: 28px;
        height: 180px;
        width: 45.5%;
        font-size: 30px;
        font-family: sans-serif;
        background-color: black;
        color: white;
        cursor: pointer;
        border-radius: 20px;
        font-size: 40px;
        font-family: sans-serif;
        font-style: normal;
    }
    
    .btn:hover {
        margin-top: 60px;
        margin-left: 28px;
        height: 180px;
        width: 45.5%;
        background-color: rgba(255, 255, 255, 0.13);
        border-radius: 10px;
        backdrop-filter: blur(12px);
        border: 2px solid rgba(255, 255, 255, 0.1);
        box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
        padding: 50px 35px;
        z-index: 1;
        font-size: 16px;
        color: black;
        font-size: 40px;
        font-family: sans-serif;
        font-style: normal;
    }
    .content{
    	display: block;
    }
    .content p{
        font-family: sans-serif;
        font-size: 20px;
        font-weight: bold;
        display: inline;
        text-align: center;
        margin: 10px 10px;
    }
    .first{
        display: flex;
        position: relative;
        top: 50px;
        left: 260px;
    }
    .second{
        display: flex;
        position: relative;
        top: 125px;
        left: 120px;
    }
    .third{
        display: flex;
        position: relative;
        top: 220px;
        left: 0px;
        text-align: center;
        margin: 10px 10px;
    }
    .fourth{
        display: flex;
        position: relative;
        top: 320px;
        left: 260px;
        text-align: center;
        margin: 10px 10px;
    }
</style>

<body>
    <header>
        <div class="container">
            <nav>
                <h1 class="brand">
                    <a href="home.html"><img src="${path}/r/logo3.png" alt="" height="80px" width="80px"></a>
                </h1>
                <ul>
                    <li class="list2"><a href="https://fantasy.premierleague.com/">About FPL</a></li>
                    <li class="list2"><a href="https://www.premierleague.com/">About PL</a></li>
                    <li class="list2"><a href="https://www.indiansuperleague.com/">About ISL</a></li>
                    <li class="list2"><a href="aboutus.html">About Us</a></li>
                    <li class="list2"><a href="contactUs.html">Contact Us</a></li>
                </ul>
            </nav>

        </div>
        <div class="content">
        	<c:forEach items="${goalies}" var="item">
				<p class="first">${item.name}</p>
			</c:forEach>
			
            <br>
            <c:forEach items="${defenders}" var="item">
				<p class="second">${item.name}</p>
			</c:forEach>
			<br>
			<c:forEach items="${midfielders}" var="item">
				<p class="third">${item.name}</p>
			</c:forEach>
			<br>
			<c:forEach items="${forwards}" var="item">
				<p class="fourth">${item.name}</p>
			</c:forEach>
        	
        </div>
    </header>
</body>
</html>