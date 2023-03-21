<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="fplStats.css">
    <title> FPL STATS</title>
<style type="text/css">
.container {
    font-size: 19px;
    background-color: rgb(31, 35, 70);
    color: white;
    display: flex;
}

.navbar {
    background-color: rgb(31, 35, 70);
    list-style-type: none;
    margin: 0px 90px;
    padding: 20px 20px;
    text-align: center;
}

.navbar li {
    display: inline;
    font-size: 20px;
    padding: 20px 20px;
    left: 250px;
    height: 70px;
}

.list2 {
    position: relative;
    bottom: 20px;
}

.list1 {
    position: relative;
    bottom: 3px;
}

.navbar li a {
    text-decoration: none;
    color: white;
}

.navbar li a:hover {
    text-decoration: none;
    color: black;
    background-color: white;
}

.navbar img {
    margin-top: 6px;
}

.container2 h1 {
    text-align: center;
    font-size: 40px;
    color: rgb(31, 35, 70);
}

.container3 {
    height: 400px;
    width: 1450px;
    margin-left: 90px;
    margin-top: 30px;
}

.container3 h1 {
    display: inline;
    margin-left: 80px;
    position: relative;
    font-size: 30px;
    top: 30px;
}

.btns {
    position: relative;
    font-size: 20px;
    top: 25px;
    background-color: rgb(31, 35, 70);
    color: white;
    height: 50px;
    width: 140px;
    left: 10px;
    margin-left: 20px;
    cursor: pointer;
}

.btns:hover {
    position: relative;
    font-size: 20px;
    top: 25px;
    background-color: white;
    color: rgb(31, 35, 70);
    height: 50px;
    width: 140px;
    left: 10px;
    margin-left: 20px;
    cursor: pointer;
    border-radius: 10px;
}

.table {
    position: relative;
    top: 100px;
    left: 310px;
    font-size: 22px;
    width: 800px;
    border: 2px solid black;
}

.table th {
    border: 2px solid black;
}

.table tr {
    border: 2px solid black;
    height: 25px;
    width: 30px;
}

.table td {
    border: 2px solid black;
}

.btn {
    height: 25px;
    width: 30px;
    margin: 10px;
}
</style>
</head>
<body>
	<header>
        <div class="container">
            <nav class="navbar">
                <li class="list1"><img src="${path}/r/logo3.png" alt="" height="60px" width="60px" id="logo"></li>
                <li class="list2"><a href="https://fantasy.premierleague.com/">About FPL</a></li>
                <li class="list2"><a href="https://www.premierleague.com/">About PL</a></li>
                <li class="list2"><a href="https://www.indiansuperleague.com/">About ISL</a></li>
                <li class="list2"><a href="${path}/aboutus">About Us</a></li>
                <li class="list2"><a href="${path}/contact">Contact Us</a></li>

                <li class="list2"><a href="${path}/logout">LogOut</a></li>
                <li></li>

            </nav>

        </div>
        <hr>
    </header>
    <div class="container2">
        <h1>Stats For FPL</h1>
    </div>
    <div class="container3">
        <h1>CATEGORIES : </h1>
        <a class="btns" href="${path}/user/fpl/stats/g"> Goals </a>
		<a class="btns" href="${path}/user/fpl/stats/a"> Assists </a>
		<a class="btns" href="${path}/user/fpl/stats/r"> Red Cards </a>
		<a class="btns" href="${path}/user/fpl/stats/y"> Yellow Cards </a>
		<a class="btns" href="${path}/user/fpl/stats/cs"> Clean Sheets </a>
        <table class="table">
            <tr>
                <th class="tablecontent">Rank</th>
                <th class="tablecontent">Player</th>
                <th class="tablecontent">Club</th>
                <th class="tablecontent">Total</th>
            </tr>
            <c:forEach items="${listOfPlayers}" var="item">
				<tr>
					<td>${item.rank}</td>
					<td>${item.name}</td>
					<td>${item.team}</td>
					<td>${item.score}</td>
				</tr>
			</c:forEach>
        </table>
    </div>
</body>
</html>