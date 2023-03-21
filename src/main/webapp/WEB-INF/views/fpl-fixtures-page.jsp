<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FPL Fixtures</title>
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

#keyimg {
    position: relative;
    left: 23%;
}

#imgs {
    margin-top: 10px;
    width: 1600px;
}

p {
    font-size: 18px;
    font-weight: bold;
    word-spacing: 2px;
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
    <div class="fixtures">

        <h1 align="center">Fixtures for FPL</h1>
        <hr>
        <p>The FDR is based on a complex algorithm developed by FPL experts. A set of formulas process key Opta data variables, along with each team's home and away form for the past six matches, to generate a rank for the perceived difficulty of each Gameweek
            opponent. The FDR is designed to help FPL managers plan their transfer and team selection strategy. It is reviewed on a weekly basis and updated as the season</p> 
        <img src="${path}/r/fdr key.png" alt="" height="150px" width="800px" id="keyimg">
        <img src="${path}/r/1.png" alt="" id="imgs">
        <img src="${path}/r/2.png" alt="" id="imgs">
        <img src="${path}/r/3.png" alt="" id="imgs">
        <img src="${path}/r/4.png" alt="" id="imgs">
        <img src="${path}/r/5.png" alt="" id="imgs">
        <img src="${path}/r/6.png" alt="" id="imgs">
        <img src="${path}/r/7.png" alt="" id="imgs">
        <img src="${path}/r/8.png" alt="" id="imgs">
        <img src="${path}/r/9.png" alt="" id="imgs">
        <img src="${path}/r/10.png" alt="" id="imgs">
        <img src="${path}/r/11.png" alt="" id="imgs">
        <img src="${path}/r/12.png" alt="" id="imgs">
        <img src="${path}/r/13.png" alt="" id="imgs">
        <img src="${path}/r/14.png" alt="" id="imgs">
        <img src="${path}/r/15.png" alt="" id="imgs">
        <img src="${path}/r/16.png" alt="" id="imgs">
        <img src="${path}/r/17.png" alt="" id="imgs">
        <img src="${path}/r/18.png" alt="" id="imgs">
        <img src="${path}/r/19.png" alt="" id="imgs">
        <img src="${path}/r/20.png" alt="" id="imgs">
        <img src="${path}/r/21.png" alt="" id="imgs">
    </div>
</body>
</html>