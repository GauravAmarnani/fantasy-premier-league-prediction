<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>About us</title>
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
        height: 240vh;
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
        margin-top: 580px;
        height: 1600px;
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
    
    .content h1 {
        text-align: center;
        font-size: 28px;
        font-weight: bold;
        text-decoration: underline;
    }
    
    .content p {
        margin-top: 20px;
        text-align: center;
    }
    
    .content .box {
        height: 310px;
        width: 550px;
        background-color: white;
        display: flex;
        margin-top: 30px;
        margin-left: 200px;
    }
    
    .photoo {
        position: relative;
        top: 13px;
        border: 2px solid black;
        left: 10px;
        height: 282px;
        width: 205px;
    }
    
    #sakshi {
        border: 2px solid black;
        width: 185px;
    }
    
    #kaplesh {
        position: absolute;
        top: -5px;
        height: 292px;
        border: 1px solid black;
    }
    
    .aboutmeCont {
        color: black;
        text-align: left;
        float: left;
        margin-top: 10px;
    }
    
    #name {
        color: crimson;
        text-decoration: none;
        font-size: 28px;
        text-align: center;
        font-weight: bold;
        position: relative;
        left: 5px;
    }
</style>

<body>
    <header>
        <div class="container">
            <nav>
                <h1 class="brand">
                    <a href="home.html"><img src="logo3.png" alt="" height="80px" width="80px"></a>
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
            <h1>About us</h1>
            <p>Welcome to our football prediction website, where our team of experts use their extensive knowledge and statistical analysis to provide you with the most accurate predictions. Our goal is to help you make informed decisions and improve your
                betting experience. With a focus on transparency and reliability, we strive to deliver the highest quality content to our users. Whether you're a casual fan or a seasoned punter, we're here to provide you with the latest tips and insights
                from the world of football. Join us in the quest for successful betting.
            </p>
            <div class="box">
                <div class="photoo">
                    <img src="${path}/r/kesarAboutUs.jpg" alt="" height="280px" width="200px">
                </div>
                <div class="aboutmeCont">
                    <h1 id="name">Kesar Jotwani</h1>

                    <br>
                    <p>Languages Aquainted with : </p>
                    <p>C,Python,HTML,CSS, JavaScript,SQL,Flutter.
                    </p>
                    <p>Certificates : </p>
                    <p>Android App Development</p>

                </div>
            </div>
            <div class="box">
                <div class="photoo" id="sakshi">
                    <img src="${path}/r/SakshiAbout.jpg" alt="" height="280px" width="180px">
                </div>
                <div class="aboutmeCont">
                    <h1 id="name">Sakshi Shahdadpuri</h1>

                    <br>
                    <p>Languages Aquainted with : </p>
                    <p>C,Python,HTML,CSS, JavaScript,SQL,Flutter.
                    </p>
                    <p>Certificates : </p>
                    <p>Intern Program at Data Science</p>

                </div>
            </div>
            <div class="box">
                <div class="photoo">
                    <img src="${path}/r/gauravAboutUs.jpg" alt="" height="280px" width="200px">
                </div>
                <div class="aboutmeCont">
                    <h1 id="name">Gaurav Amarnani</h1>

                    <br>
                    <p>Languages Aquainted with : </p>
                    <p>Python,Java,HTML,CSS, JavaScript,SQL,Figma,PHP.
                    </p>
                    <p>Certificates : </p>
                    <p>OCJAP Se 11</p>

                </div>
            </div>
            <div class="box">
                <div class="photoo">
                    <img src="${path}/r/kapleshAboutUs.jpg" alt="" height="280px" width="200px" id="kaplesh">
                </div>
                <div class="aboutmeCont">
                    <h1 id="name">Kaplesh Mulchandani</h1>

                    <br>
                    <p>Languages Aquainted with : </p>
                    <p style="text-align: center;">C,Java,Python,HTML,CSS,SQL,JS, React ,Rest-API.
                    </p>
                    <p>Certificates : </p>
                    <p>Full Stack Web Development</p>

                </div>
            </div>
        </div>

    </header>
</body>

</html>