<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FPL FAV TEAM</title>
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

.container2 {
    height: 500px;
    width: 1000px;
    position: relative;
    left: 300px;
    top: 50px;
    border: 2px solid black;
    background-color: rgb(31, 35, 70);
    color: white;
}

.container3 {
    height: 280px;
    width: 700px;
    position: relative;
    top: 40px;
    left: 150px;
    border: 2px solid rgb(31, 35, 70);
    background-color: rgb(205, 205, 205);
    color: black;
}

.container2 h1 {
    position: relative;
    top: 20px;
    left: 20px;
}

.container2 label {
    font-size: 22px;
    font-family: 'Times New Roman', Times, serif;
    font-weight: bold;
    position: relative;
    top: 100px;
    left: 90px;
}

.container2 select {
    font-size: 22px;
    font-family: 'Times New Roman', Times, serif;
    font-weight: bold;
    position: relative;
    top: 100px;
    left: 100px;
    width: 200px;
}

.container2 select:hover {
    font-size: 22px;
    font-family: 'Times New Roman', Times, serif;
    font-weight: bold;
    position: relative;
    top: 100px;
    left: 100px;
    width: 200px;
    background-color: rgb(31, 35, 70);
    color: white;
}

.container2 button {
    position: relative;
    top: 310px;
    right: 200px;
    height: 40px;
    width: 110px;
    background-color: rgb(205, 205, 205);
    color: rgb(31, 35, 70);
    font-size: 20px;
    cursor: pointer;
}

.container2 button:hover {
    position: relative;
    top: 310px;
    right: 200px;
    height: 40px;
    width: 110px;
    background-color: rgb(255, 245, 245);
    color: rgb(31, 35, 70);
    font-size: 20px;
    cursor: pointer;
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
        <h1>Welcome ${username}!</h1>
        <div class="container3">
            <label for="">Pick the team that you support</label>
            <select name="" id="">
            <option value="">ATK Mohun Bagan FC
            </option>
            <option value="">Bengaluru FC
            </option>
            <option value="">Chennaiyin FC

            </option>
            <option value="">East Bengal FC
            </option>
            <option value="">Goa FC
            </option>
            <option value="">Hyderabad FC
            </option>
            <option value="">Jamshedpur FC
            </option>
            <option value="">Kerala Blasters FC
            </option>
            <option value="">Mumbai City FC
            </option>
            <option value="">NorthEast United FC
            </option>
            
        </div>

        </select>
            <button> <a href="${path}/user/isl/"> Done </a></button>
        </div>
</body>

</html>