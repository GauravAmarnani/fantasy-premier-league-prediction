<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ISL HOME</title>
</head>

<body>
    <style>
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
    
    .container1 {
        height: 200px;
        width: 100%;
    }
    
    p {
        font-size: 19px;
        word-spacing: 2px;
    }
    
    .content1 {
        position: relative;
        top: 20px;
        background-color: rgb(237, 236, 236);
        width: 25%;
        text-align: center;
        height: 700px;
    }
    
    .btn1 {
        margin: 20px 105px;
        display: block;
        height: 35px;
        width: 200px;
        background-color: rgb(171, 170, 170);
        font-weight: bold;
        cursor: pointer;
    }
    
    .btn2 {
        margin: 20px 105px;
        display: block;
        height: 35px;
        width: 200px;
        background-color: rgb(171, 170, 170);
        font-weight: bold;
        cursor: pointer;
    }
    
    .btn3 {
        margin: 20px 105px;
        display: block;
        height: 35px;
        width: 200px;
        background-color: rgb(171, 170, 170);
        font-weight: bold;
        cursor: pointer;
    }
    
    .btn4 {
        margin: 20px 105px;
        display: block;
        height: 35px;
        width: 200px;
        background-color: rgb(171, 170, 170);
        font-weight: bold;
        cursor: pointer;
    }
    
    .btn1:hover {
        background-color: rgb(31, 35, 70);
        color: white;
    }
    
    .btn2:hover {
        background-color: rgb(31, 35, 70);
        color: white;
    }
    
    .btn3:hover {
        background-color: rgb(31, 35, 70);
        color: white;
    }
    
    .btn4:hover {
        background-color: rgb(31, 35, 70);
        color: white;
    }
    
    label {
        font-size: 22px;
        font-weight: bold;
        font-family: 'Times New Roman', Times, serif;
    }
    
    .buttons {
        display: block;
        width: 100%;
        height: 50px;
        font-size: 22px;
        background-color: rgb(171, 170, 170);
        color: black;
        position: relative;
        top: 20px;
    }
    
    .buttons:hover {
        display: block;
        width: 100%;
        height: 50px;
        font-size: 22px;
        background-color: rgb(31, 35, 70);
        color: white;
    }
    
    .content2 {
        position: relative;
        bottom: 545px;
        left: 450px;
    }
    
    .contentcombined {
        display: inline;
    }
    
    .combined {
        height: 400px;
        width: 100%;
        background-color: rgb(31, 35, 70);
    }
    
    .combinedd {
        display: flex;
    }
    
    .combined4 {
        margin: 20px;
    }
    
    .combined5 {
        margin: 20px;
    }
    
    .card-title button {
        color: black;
        font-size: 15px;
        font-weight: bold;
        background-color: rgb(171, 171, 171);
    }
    
    .card-title button:hover {
        color: black;
        font-size: 17px;
        background-color: rgb(31, 35, 70);
        color: white;
    }
    
    .fixt {
        display: inline;
        position: absolute;
        top: 0px;
        left: 1210px;
        background-color: rgb(237, 236, 236);
        width: 400px;
        height: 700px;
    }
    
    #fixture {
        font-size: 35px;
        margin-top: 0px;
        margin-left: 2px;
    }
    
    #red {
        background-color: red;
        color: white;
        font-weight: bold;
        cursor: pointer;
    }
    
    #pink {
        background-color: rgb(244, 135, 153);
        color: black;
        font-weight: bold;
        cursor: pointer;
    }
    
    #nude {
        background-color: rgb(240, 189, 226);
        color: black;
        font-weight: bold;
        cursor: pointer;
    }
    
    #light-blue {
        background-color: lightskyblue;
        font-weight: bold;
        cursor: pointer;
    }
    
    #dark-blue {
        background-color: blue;
        color: black;
        font-weight: bold;
        cursor: pointer;
    }
    
    #red:hover {
        background-color: red;
        color: black;
        font-weight: bold;
        cursor: pointer;
        border: 2px solid black;
        border-radius: 3px;
    }
    
    #pink:hover {
        background-color: rgb(244, 135, 153);
        color: white;
        font-weight: bold;
        cursor: pointer;
        border: 2px solid black;
        border-radius: 3px;
    }
    
    #nude:hover {
        background-color: rgb(240, 189, 226);
        color: white;
        font-weight: bold;
        cursor: pointer;
        border: 2px solid black;
        border-radius: 3px;
    }
    
    #light-blue:hover {
        background-color: lightskyblue;
        color: white;
        font-weight: bold;
        cursor: pointer;
        border: 2px solid black;
        border-radius: 3px;
    }
    
    #dark-blue:hover {
        background-color: blue;
        color: white;
        font-weight: bold;
        cursor: pointer;
        border: 2px solid black;
        border-radius: 3px;
    }
    
    .fixttable {
        position: relative;
        top: 20px;
        left: 80px;
    }
    
    .fixttable button {
        height: 25px;
        width: 60px;
    }
    </style>
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
    </header>
    <hr>


    <div class="container2 ">

        <h1 id="title ">Welcome ${username}! </h1>
    </div>
    <div class="container1">
        <p>Football, also called association football or soccer, game in which two teams of 11 players, using any part of their bodies except their hands and arms, try to maneuver the ball into the opposing team’s goal. Only the goalkeeper is permitted to
            handle the ball and may do so only within the penalty area surrounding the goal. The team that scores more goals wins. Football is the world’s most popular ball game in numbers of participants and spectators. Simple in its principal rules
            and essential equipment, the sport can be played almost anywhere, from official football playing fields (pitches) to gymnasiums, streets, school playgrounds, parks, or beaches. Football’s governing body, the Fédération Internationale de Football
            Association (FIFA), estimated that at the turn of the 21st century there were approximately 250 million football players and over 1.3 billion people “interested” in football; in 2010 a combined television audience of more than 26 billion watched
            football’s premier tournament, the quadrennial month-long World Cup finals. Modern football originated in Britain in the 19th century. Since before medieval times, “folk football” games had been played in towns and villages according to local
            customs and with a minimum of rules. Industrialization and urbanization, which reduced the amount of leisure time and space available to the working class, combined with a history of legal prohibitions against particularly violent and destructive
            forms of folk football to undermine the game’s status from the early 19th century onward.</p>

    </div>
    <hr>
    <div class="content1">
        <div class="contentcombined">
            <label for="">Best Player</label>
            <hr>
            <button class="btn1">Petratos</button>
            <button class="btn2">Stewert</button>
            <button class="btn3">Manvir Singh</button>
            <button class="btn4">Ogbeche</button>


            <a class="buttons" href="${path}/user/isl/stats">Stats</a>
            <a class="buttons" href="${path}/user/isl/fixtures">Fixtures</a>
            <a class="buttons" href="${path}/user/isl/favteam">Favorite Team</a>
            <a class="buttons" href="${path}/user/isl/#">My Team</a>
            <a class="buttons" href="${path}/user/isl/#">Prediction</a>


            <div class="content2">


                <div class="combinedd">
                    <div class="combined4">
                        <div class="card" style="width: 320px;">
                            <img class="card-img-top" src="https://www.indiansuperleague.com/static-resources/waf-images/content/71/94/7d/16-9/796-597/QYAnusSsN2.jpg" alt="Card image cap" height="200px" width="320px" id="art1">
                            <div class="card-body">
                                <p class="card-title"><b><button>ISL</button></b></p>
                                <p class="card-text">Kolkota Derby Tactics</p>
                                <a href="https://www.indiansuperleague.com/features/talking-tactics-key-battles-to-watch-out-for-in-the-kolkata-derby" class="btn btn-primary">Click here for more...</a>
                            </div>
                        </div>
                        <div class="card" style="width: 320px;">
                            <img class="card-img-top" src="https://www.indiansuperleague.com/static-resources/waf-images/content/d0/43/18/16-9/388-218/GL5dgW5rfU.jpg" alt="Card image cap" height="200px" width="320px" id="art1">
                            <div class="card-body">
                                <h5 class="card-title"><b><button>ISL</button></b></h5>
                                <p class="card-text"> look forward to for gameweek 4</p>
                                <a href="https://www.indiansuperleague.com/news/hero-isl-2022-23-what-to-look-forward-to-in-matchweek-4" class="btn btn-primary">Click here for more...</a>
                            </div>
                        </div>

                    </div>
                    <div class="combined5">
                        <div class="card" style="width: 320px;">
                            <img class="card-img-top" src="https://www.indiansuperleague.com/static-resources/waf-images/content/91/cb/0f/16-9/388-218/zC4kz5S4Bs.png" alt="Card image cap" height="200px" width="320px" id="art1">
                            <div class="card-body">
                                <p class="card-title"><b><button>ISL</button></b></p>
                                <p class="card-text">Darrens team for the gameweek</p>
                                <a href="https://www.indiansuperleague.com/features/hero-isl-2022-23-darren-caldeira-picks-the-team-of-matchweek-3" class="btn btn-primary">Click here for more...</a>
                            </div>
                        </div>
                        <div class="card" style="width: 320px;">
                            <img class="card-img-top" src="https://static.sportskeeda.com/editor/2022/10/32c9f-16670587012705-1920.jpg" alt="Card image cap" height="200px" width="320px"
                                id="art1">
                            <div class="card-body">
                                <p class="card-title"><b><button>Kolkota Derby</button></b></p>
                                <p class="card-text">Mohun reigns over rivals</p>
                                <a href="https://www.sportskeeda.com/indian-football/isl-2022-23-atk-mohun-bagan-2-0-east-bengal-mariners-blow-away-red-gold-brigade-s-stern-effort?key1=fotmob" class="btn btn-primary">Click here for more...</a>
                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </div>
        <div class="fixt">
            <h1 id="fixture">Fixture Ticker</h1>
            <p> overall fixtures GW3 to GW4
            </p>
            
            <table class="fixttable">
                <tr>
                    <th>Team</th>
                    <th>GW-3</th>
                    <th>GW-4</th>
                </tr>
                <hr>
                <tr>
                    <td id="country"><b>Hyderabad FC</b></td>
                    <td><button id="red">ODH</button></td>
                    <td><button id="dark-blue">JAM&nbsp;&nbsp;&nbsp;</button></td>
                </tr>
                <tr>
                    <td id="country"><b>Odhisa FC</b></td>
                    <td><button id="red">HYD</button></td>
                    <td><button id="nude">EAS</button></td>
                </tr>

                <tr>
                    <td id="country"><b>Mumbai city FC</b></td>
                    <td><button id="dark-blue">MOH</button></td>
                    <td><button id="nude">CHE</button></td>
                </tr>
                <tr>
                    <td id="country"><b>ATK Mohun Bagan FC</b></td>
                    <td><button id="nude">MUM</button></td>
                    <td><button id="dark-blue">NOR</button></td>
                </tr>
                <tr>
                    <td id="country"><b>FC Goa</b></td>
                    <td><button id="light-blue">JAM</button></td>
                    <td><button id="pink">KER</button></td>
                </tr>
                <tr>
                    <td id="country"><b>Chennaiyin FC</b></td>
                    <td><button id="nude">EAS</button></td>
                    <td><button id="nude">MUM</button></td>
                </tr>
                <tr>
                    <td id="country"><b>Bengaluru FC</b></td>
                    <td><button id="nude">EAS</button></td>
                    <td><button id="light-blue">MUM</button></td>
                </tr>
                <tr>
                    <td id="country"><b>East Bengal FC</b></td>
                    <td><button id="light-blue">CHE</button></td>
                    <td><button id="nude">BAN</button></td>
                </tr>
                <tr>
                    <td id="country"><b>Kerela Blasters FC</b></td>
                    <td><button id="light-blue">NOR</button></td>
                    <td><button id="pink">GOA</button></td>
                </tr>

                <tr>
                    <td id="country"><b>Jamshedpur FC</b></td>
                    <td><button id="nude">NOR</button></td>
                    <td><button id="light-blue">GOA</button></td>
                </tr>
                <tr>
                    <td id="country"><b>North east united FC</b></td>
                    <td><button id="nude">JAM</button></td>
                    <td><button id="red">KER</button></td>
                </tr>
                

            </table>
        </div>
</body>

</html>