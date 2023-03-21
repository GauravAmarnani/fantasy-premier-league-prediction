<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> ISL STATS</title>
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

.container2 h1 {
    text-align: center;
    font-size: 40px;
    color: rgb(31, 35, 70);
}

.container3 {
    height: 600px;
    width: 1450px;
    margin-left: 90px;
    border: 2px solid black;
    margin-top: 30px;
}
.container3 h1 {
    display: inline;
    margin-left: 80px;
    position: relative;
    font-size: 30px;
    top: 30px;
}

.container4 {
    height: 250px;
    width: 1450px;
    margin-left: 90px;
    border: 2px solid black;
    margin-top: 30px;
}
.container4 h1 {
    display: inline;
    margin-left: 80px;
    position: relative;
    font-size: 30px;
    top: 30px;
}
.container5 {
    height: 400px;
    width: 1450px;
    margin-left: 90px;
    border: 2px solid black;
    margin-top: 30px;
}
.container5 h1 {
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
        <h1>Stats For ISL</h1>
    </div>
    <div class="container3">
        <h1>CATEGORIES : </h1>
        <button class="btns">Goals</button>
        
        <table class="table">
            <tr>
                <th class="tablecontent">Rank</th>
                <th class="tablecontent">Player</th>
                <th class="tablecontent">Club</th>
                <th class="tablecontent">Games Played</th>
                <th class="tablecontent">Goals </th>
            </tr>
            <tr>
                <td>1</td>
                <td>Dimitri Perratos</td>
                <td>ATK Mohun Bagan FC</td>
                <td>3</td>
                <td>3</td>
            </tr>
            <tr>
                <td>2</td>
                <td>IVAN KALIUZHNYI</td>
                <td>Kerela Blasters FC</td>
                <td>4</td>
                <td>3</td>
            </tr>
            <tr>
                <td>3</td>
                <td>BARTHOLOMEW OGBECHE</td>
                <td>Hyderabad FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>4</td>
                <td>DANIEL CHIMA CHUKWU</td>
                <td>Jamshedpur FC</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>5</td>
                <td>DIEGO MAURICIO</td>
                <td>Odhisa FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>6</td>
                <td>HALICHARAN NARZARY</td>
                <td>Hyderabad FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>7</td>
                <td>Manvir Singh</td>
                <td>ATK Mohun Bagan</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>8</td>
                <td>cleiton silva</td>
                <td>East Bengal FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>9</td>
                <td>Joao Viktor</td>
                <td>Hyderabad FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>10</td>
                <td>Adrian Luna</td>
                <td>Kerela Blasters FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
        </table>
    </div>
    <div class="container3">
        <h1>CATEGORIES : </h1>
        <button class="btns">Assists</button>
        
        <table class="table">
            <tr>
                <th class="tablecontent">Rank</th>
                <th class="tablecontent">Player</th>
                <th class="tablecontent">Club</th>
                <th class="tablecontent">Games Played</th>
                <th class="tablecontent">Assits </th>
            </tr>
            <tr>
                <td>1</td>
                <td>Greg Stewart</td>
                <td>Mumbai City FC</td>
                <td>4</td>
                <td>3</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Dimitri Perratos</td>
                <td>ATK Mohun Bagan FC</td>
                <td>3</td>
                <td>3</td>
            </tr>
            <tr>
                <td>3</td>
                <td>Mohammad yasir</td>
                <td>Hyderabad FC</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>4</td>
                <td>Liston Colaco</td>
                <td>ATK Mohun Bagan FC</td>
                <td>2</td>
                <td>2</td>
            </tr>
            <tr>
                <td>5</td>
                <td>Adrian Luna</td>
                <td>Kerela Blasters FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>6</td>
                <td>HALICHARAN NARZARY</td>
                <td>Hyderabad FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>7</td>
                <td>Hugo Boumous</td>
                <td>ATK Mohun Bagan</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>8</td>
                <td>BARTHOLOMEW OGBECHE</td>
                <td>Hyderabad FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>9</td>
                <td>SIVASAKTHI NARAYANAN</td>
                <td>Bengaluru FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>10</td>
                <td>HARMANJOT KHABRA</td>
                <td>Kerela Blasters FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
        </table>
    </div>
    <div class="container5">
        <h1>CATEGORIES : </h1>
        <button class="btns">Clean Sheets</button>
        
        <table class="table">
            <tr>
                <th class="tablecontent">Rank</th>
                <th class="tablecontent">Player</th>
                <th class="tablecontent">Club</th>
                <th class="tablecontent">Games Played</th>
                <th class="tablecontent">Clean Sheets </th>
            </tr>
            <tr>
                <td>1</td>
                <td>LAXMIKANT K</td>
                <td>Hyderabad FC</td>
                <td>4</td>
                <td>3</td>
            </tr>
            <tr>
                <td>2</td>
                <td>PHURBA LACHENPA</td>
                <td>Mumbai City FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>3</td>
                <td>AMRINDER SINGH</td>
                <td>Odhisa FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>4</td>
                <td>Vishal Kaith</td>
                <td>ATK Mohun Bagan FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>5</td>
                <td>Gurpreet Singh Sandhu</td>
                <td>Bengaluru FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            
        </table>
    </div>
    <div class="container3">
        <h1>CATEGORIES : </h1>
        <button class="btns">Yellow Cards</button>
        <table class="table">
            <tr>
                <th class="tablecontent">Rank</th>
                <th class="tablecontent">Player</th>
                <th class="tablecontent">Club</th>
                <th class="tablecontent">Games Played</th>
                <th class="tablecontent">Yellow Cards </th>
            </tr>
            <tr>
                <td>1</td>
                <td>IVAN KALIUZHNYI</td>
                <td>Kerela Blasters FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>2</td>
                <td>LALCHUNGNUNGA</td>
                <td>East Bengal FC</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>3</td>
                <td>REDEEM TLANG</td>
                <td>FC GOA</td>
                <td>4</td>
                <td>2</td>
            </tr>
            <tr>
                <td>4</td>
                <td>AHMED JAHOUH</td>
                <td>Mumbai City FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>5</td>
                <td>AJITH KUMAR</td>
                <td>Chennaiyin FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>6</td>
                <td>AKASH MISHRA</td>
                <td>Hyderabad FC</td>
                <td>2</td>
                <td>1</td>
            </tr>
            <tr>
                <td>7</td>
                <td>ALBERTO NOGUERA</td>
                <td>Mumbai City FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>8</td>
                <td>AMRINDER SINGH</td>
                <td>Odhisa FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>9</td>
                <td>ANIRUDH THAPA</td>
                <td>Chennaiyin FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
            <tr>
                <td>10</td>
                <td>ANKIT MUKHERJEE</td>
                <td>East Bengal FC</td>
                <td>4</td>
                <td>1</td>
            </tr>
        </table>
    </div>
    <div class="container4">
        <h1>CATEGORIES : </h1>
        <button class="btns">Red Cards</button>
        
        <table class="table">
            <tr>
                <th class="tablecontent">Rank</th>
                <th class="tablecontent">Player</th>
                <th class="tablecontent">Club</th>
                <th class="tablecontent">Games Played</th>
                <th class="tablecontent">Red Cards </th>
            </tr>
            <tr>
                <td>1</td>
                <td>DEBJIT MAJUMDER</td>
                <td>Chennaiyin FC</td>
                <td>2</td>
                <td>1</td>
            </tr>
            
        </table>
    </div>



</body>

</html>