<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" isELIgnored="false"%>
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
                    <li class="list2"><a href="${path}/aboutus">About Us</a></li>
                    <li class="list2"><a href="${path}/contact">Contact Us</a></li>
                </ul>
            </nav>

        </div>
        <div class="content">
            <p>Football, also called association football or soccer, game in which two teams of 11 players, using any part of their bodies except their hands and arms, try to maneuver the ball into the opposing team’s goal. Only the goalkeeper is permitted
                to handle the ball and may do so only within the penalty area surrounding the goal. The team that scores more goals wins. Football is the world’s most popular ball game in numbers of participants and spectators. Simple in its principal
                rules and essential equipment, the sport can be played almost anywhere, from official football playing fields (pitches) to gymnasiums, streets, school playgrounds, parks, or beaches. Football’s governing body, the Fédération Internationale
                de Football Association (FIFA), estimated that at the turn of the 21st century there were approximately 250 million football players and over 1.3 billion people interested in football; in 2010 a combined television audience of more than
                26 billion watched football’s premier tournament, the quadrennial month-long World Cup finals. Modern football originated in Britain in the 19th century. Since before medieval times, “folk football” games had been played in towns and villages
                according to local customs and with a minimum of rules.</p>
            <button class="btn"><a href="${path}/user/fpl">FPL</a></button>
            <button class="btn"><a href="${path}/user/isl">ISL</a></button>
        </div>

    </header>
</body>

</html>