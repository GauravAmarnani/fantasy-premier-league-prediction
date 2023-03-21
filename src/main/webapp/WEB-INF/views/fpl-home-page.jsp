<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HOME</title>
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
        height: 150vh;
        background: linear-gradient(to bottom, rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.8)), url('https://cdn.pixabay.com/photo/2017/03/15/23/02/football-2147773__340.jpg') center repeat-y;
        background-size: cover;
    }
    
    .container {
        max-width: 120rem;
        width: 90%;
        margin: 10px auto;
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
    position:relative;
    left:100px;
        font-size: 3rem;
        font-weight: 300;
        transform: translate(-100rem);
        animation: slideIn .5s forwards;
        
    }
    
    nav ul {
    position:relative;
    left:100px;
        display: flex;
    }
    
    nav ul li {
    position:relative;
    left:200px;
    top:50px;
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
            transform: translateX(0)
        }
    }
    
    .content {
        margin-top: 260px;
        height: 970px;
        width: 1480px;
        background-color: rgba(255, 255, 255, 0.13);
        position: absolute;
        transform: translate(-50%, -50%);
        top: 50%;
        left: 50%;
        border-radius: 10px;
        backdrop-filter: blur(4px);
        border: 2px solid rgba(255, 255, 255, 0.1);
        box-shadow: 0 0 10px rgba(8, 7, 16, 0.6);
        padding: 50px 35px;
        z-index: 1;
        font-size: 16px;
        color: white;
    }
    
    .content p {
        justify-content: center;
    }
    
    .btn {
        margin-top: 60px;
        height: 200px;
        width: 49.5%;
        font-size: 30px;
        font-family: sans-serif;
        background-color: black;
        color: white;
        cursor: pointer;
    }
    
    .content1 {
        margin-top: 40px;
        font-size: 20px;
        font-weight: bold;
    }
    
    .content1 label {
        margin-left: 22px;
    }
    
    .contentcombined button {
        display: block;
        height: 60px;
        width: 240px;
        cursor: pointer;
        font-size: 18px;
        font-weight: bold;
        color: black;
    }
    
    .contentcombined button a {
        color: black;
    }
    
    .contentcombined button a:hover {
        color: white;
        background-color: rgb(50, 50, 50);
    }
    
    .contentcombined button:hover {
        background-color: rgb(50, 50, 50);
        color: white;
    }
    
    a .buttons {
        display: block;
        height: 40px;
        width: 200px;
    }
    
    .contentcombined .seperator {
        background-color: black;
        cursor: none;
    }
    
    .content2 {
        position: absolute;
    }
    
    .combinedd {
        display: flex;
        position: absolute;
        left: 300px;
        top: -630px;
        margin: 30px;
    }
    
    .combined5 {
        margin: 0px 40px;
    }
    
    .card-img-top {
        height: 200px;
        width: 300px;
        opacity: 1;
        background-color: black;
    }
    
    .card-body {
        height: 100px;
        width: 300px;
    }
    
    .card-title button {
        font-size: 18px;
        width: 300px;
        text-align: center;
    }
    
    .card-text {
        font-size: 14px;
        width: 300px;
        text-align: center;
    }
    
    .btn {
        height: 40px;
        width: 300px;
        font-size: 15px;
        font-family: sans-serif;
        background-color: white;
        color: black;
        text-align: center;
        margin-top: 5px;
        margin-left: 80px;
    }
    
    .fixt {
        position: absolute;
        left: 1080px;
        top: 260px;
    }
    
    #fixture {
        font-size: 28px;
        font-family: sans-serif;
    }
    
    #red {
        background-color: red;
        height: 30px;
        width: 55px;
        cursor: pointer;
    }
    
    #pink {
        background-color: palevioletred;
        height: 30px;
        width: 55px;
        cursor: pointer;
    }
    
    #nude {
        background-color: pink;
        height: 30px;
        width: 55px;
        cursor: pointer;
    }
    
    #light-blue {
        background-color: rgb(84, 196, 245);
        height: 30px;
        width: 55px;
        cursor: pointer;
    }
    
    #dark-blue {
        background-color: blue;
        height: 30px;
        width: 55px;
        cursor: pointer;
    }
    
    #best {
        margin-right: 20px;
    }
</style>

<body>
    <header>
        <div class="container">
            <nav>
                <ul>
                <a href="fpl-home-page.jsp"><img src="${path}/r/logo3.png" alt="" height="80px" width="80px"></a>
                    <li class="list2"><a href="https://fantasy.premierleague.com/">About FPL</a></li>
                    <li class="list2"><a href="https://www.premierleague.com/">About PL</a></li>
                    <li class="list2"><a href="https://www.indiansuperleague.com/">About ISL</a></li>
                    <li class="list2"><a href="${path}/aboutus">About Us</a></li>
                    <li class="list2"><a href="${path}/contact">Contact Us</a></li>
                </ul>
            </nav>

        </div>
        <div class="content">
        	<h1 id="title ">Welcome ${username}! </h1>
            <p>Football, also called association football or soccer, game in which two teams of 11 players, using any part of their bodies except their hands and arms, try to maneuver the ball into the opposing team's goal. Only the goalkeeper is permitted
                to handle the ball and may do so only within the penalty area surrounding the goal. The team that scores more goals wins. Football is the world's most popular ball game in numbers of participants and spectators. Simple in its principal
                rules and essential equipment, the sport can be played almost anywhere, from official football playing fields (pitches) to gymnasiums, streets, school playgrounds, parks, or beaches. Football's governing body, the Fédération Internationale
                de Football Association (FIFA), estimated that at the turn of the 21st century there were approximately 250 million football players and over 1.3 billion people “interested” in football; in 2010 a combined television audience of more than
                26 billion watched football's premier tournament, the quadrennial month-long World Cup finals. Modern football originated in Britain in the 19th century. Since before medieval times, “folk football” games had been played in towns and villages
                according to local customs and with a minimum of rules. Industrialization and urbanization, which reduced the amount of leisure time and space available to the working class, combined with a history of legal prohibitions against particularly
                violent and destructive forms of folk football to undermine the game's status from the early 19th century onward.</p>

            <div class="content1">
                <div class="contentcombined">
                    <label for="">VOTE CAPTAIN</label>

                    <button class="btn1">Haaland (FUL)</button>
                    <button class="btn2">De Bruyne (FUL)</button>
                    <button class="btn3">Salah (TOT)</button>
                    <button class="btn4">Kane (LIV)</button>

                    <button class="seperator"></button>
                    <button><a href="${path}/user/fpl/stats">Stats</a></button>
                    <button><a href="${path}/user/fpl/fixtures">Fixtures</a></button>
                    <button><a href="${path}/user/fpl/favteam">Favorite Team</a></button>
                    <button><a href="${path}/user/fpl/#">My Team</a></button>
                    <button><a href="${path}/user/fpl/predictions">Prediction</a></button>


                    <div class="content2">


                        <div class="combinedd">
                            <div class="combined4">
                                <div class="card">
                                    <img class="card-img-top" src="https://www.fantasyfootballhub.co.uk/_next/image?url=https%3A%2F%2Fcms.fantasyfootballhub.co.uk%2Fwp-content%2Fuploads%2F2022%2F08%2FGuide.jpg&w=1920&q=75" alt="Card image cap" height="200px" width="320px" id="art1">
                                    <div class="card-body">
                                        <p class="card-title"><b><button>Fantasy Football</button></b></p>
                                        <p class="card-text">FPL Guide</p>
                                        <a href="https://www.fantasyfootballhub.co.uk/fantasy-premier-league-ultimate-guide-fpl-tips" class="btn btn-primary">Click here for more...</a>
                                    </div>
                                </div>
                                <div class="card">
                                    <img class="card-img-top" src="https://www.fantasyfootballhub.co.uk/_next/image?url=https%3A%2F%2Fcms.fantasyfootballhub.co.uk%2Fwp-content%2Fuploads%2F2022%2F10%2FHaaland-injury-news.jpg&w=1920&q=75" alt="Card image cap" height="200px" width="320px"
                                        id="art1">
                                    <div class="card-body">
                                        <h5 class="card-title"><b><button>Fantasy Preimer League</button></b></h5>
                                        <p class="card-text">Inury news</p>
                                        <a href="https://www.fantasyfootballhub.co.uk/erling-haaland-and-joao-cancelo-injury-news-ahead-of-fpl-gameweek-14" class="btn btn-primary">Click here for more...</a>
                                    </div>
                                </div>

                            </div>
                            <div class="combined5">
                                <div class="card">
                                    <img class="card-img-top" src="https://www.fantasyfootballhub.co.uk/_next/image?url=https%3A%2F%2Fcms.fantasyfootballhub.co.uk%2Fwp-content%2Fuploads%2F2022%2F10%2Fbest-defenders-gw14.jpg&w=1920&q=75" alt="Card image cap" height="200px" width="320px"
                                        id="art1">
                                    <div class="card-body">
                                        <p class="card-title"><b><button>Fantasy Preimer League</button></b></p>
                                        <p class="card-text">Best defenders for gameweek 14</p>
                                        <a href="https://www.fantasyfootballhub.co.uk/best-fpl-players-for-gameweek-14-top-5-best-defenders" class="btn btn-primary">Click here for more...</a>
                                    </div>
                                </div>
                                <div class="card">
                                    <img class="card-img-top" src="https://www.fantasyfootballhub.co.uk/_next/image?url=https%3A%2F%2Fcms.fantasyfootballhub.co.uk%2Fwp-content%2Fuploads%2F2022%2F10%2Fbest-mids-gw14.jpg&w=1920&q=75" alt="Card image cap" height="200px" width="320px" id="art1">
                                    <div class="card-body">
                                        <p class="card-title"><b><button>Champions League</button></b></p>
                                        <p class="card-text">best midfielders for gameweek 14</p>
                                        <a href="https://www.fantasyfootballhub.co.uk/best-fpl-players-for-gameweek-14-top-5-best-midfielders" class="btn btn-primary">Click here for more...</a>
                                    </div>
                                </div>

                            </div>

                        </div>
                    </div>
                </div>
                <div class="fixt">
                    <h1 id="fixture">Fixture Ticker</h1>
                    <p>Sorted by Easiest overall fixtures GW10 to GW11
                    </p>
                    <label for="" id="worst">WORST</label><button id="red">&nbsp;&nbsp;</button><button id="pink">&nbsp;&nbsp;</button><button id="nude">&nbsp;&nbsp;</button><button id="light-blue">&nbsp;&nbsp;</button><button id="dark-blue">&nbsp;&nbsp;</button>
                    <label for="" id="best">BEST</label>
                    <table class="fixttable">
                        <tr>
                            <th>Team</th>
                            <th>Gameweek-10</th>
                            <th>Gameweek-11</th>
                        </tr>
                        <hr>
                        <tr>
                            <td id="country"><b>Bournemouth</b></td>
                            <td><button id="light-blue">LEE</button></td>
                            <td><button id="nude">EVE&nbsp;&nbsp;&nbsp;</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Leicester</b></td>
                            <td><button id="light-blue">EVE</button></td>
                            <td><button id="dark-blue">WHU</button></td>
                        </tr>

                        <tr>
                            <td id="country"><b>Crystal Palace</b></td>
                            <td><button id="dark-blue">WHU</button></td>
                            <td><button id="nude">NOT</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Fulham</b></td>
                            <td><button id="nude">MCI</button></td>
                            <td><button id="dark-blue">MUN</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Newcastle</b></td>
                            <td><button id="light-blue">SOU</button></td>
                            <td><button id="pink">CHE</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Brighton</b></td>
                            <td><button id="nude">WOL</button></td>
                            <td><button id="nude">AVL</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Man Utd</b></td>
                            <td><button id="nude">AVL</button></td>
                            <td><button id="light-blue">FUL</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Aston Villa</b></td>
                            <td><button id="light-blue">MUN</button></td>
                            <td><button id="nude">BHA</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Chelsea</b></td>
                            <td><button id="light-blue">ARS</button></td>
                            <td><button id="pink">NEW</button></td>
                        </tr>

                        <tr>
                            <td id="country"><b>Spurs</b></td>
                            <td><button id="nude">LIV</button></td>
                            <td><button id="light-blue">LEE</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>BrentFord</b></td>
                            <td><button id="nude">NOT</button></td>
                            <td><button id="red">MCI</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Wolves</b></td>
                            <td><button id="pink">BHA</button></td>
                            <td><button id="dark-blue">ARS</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>Not'm Forest</b></td>
                            <td><button id="light-blue">BRE</button></td>
                            <td><button id="pink">CRY</button></td>
                        </tr>
                        <tr>
                            <td id="country"><b>West Ham</b></td>
                            <td><button id="dark-blue">CRY</button></td>
                            <td><button id="nude">LEI</button></td>
                        </tr>

                        <tr>
                            <td id="country"><b>Southampton</b></td>
                            <td><button id="red">NEW</button></td>
                            <td><button id="light-blue">LIV</button></td>
                        </tr>
                    </table>
                </div>

            </div>

    </header>
</body>

</html>