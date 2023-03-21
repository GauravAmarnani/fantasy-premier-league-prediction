<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CONTACT US</title>
    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>

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
        position: absolute;
        top: 390px;
        left: 245px;
        height: 40px;
        width: 500px;
        font-size: 16px;
        font-family: sans-serif;
        background-color: black;
        color: white;
        cursor: pointer;
        border-radius: 5px;
        font-size: 16px;
        font-family: sans-serif;
        font-style: normal;
    }
    
    .btn:hover {
        background-color: rgba(255, 255, 255, 0.13);
        border-radius: 10px;
        backdrop-filter: blur(12px);
        border: 2px solid rgba(255, 255, 255, 0.1);
        box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
        z-index: 1;
        font-size: 16px;
        color: black;
        font-size: 16px;
        font-family: sans-serif;
        font-style: normal;
    }
    
    .content h1 {
        font-size: 26px;
        font-weight: bold;
        font-family: sans-serif;
        text-align: center;
        text-decoration: underline;
    }
    
    .inputbox {
        height: 250px;
        width: 500px;
        position: relative;
        top: 50px;
        left: 210px;
        font-size: 20px;
        font-family: sans-serif;
    }
    
    .contact {
        position: absolute;
        top: 500px;
        left: 450px;
    }
    
    #insta {
        position: relative;
        top: 200px;
        left: 400px;
        height: 50px;
        font-size: 20px;
    }
    
    #whatsapp {
        position: relative;
        top: 152px;
        left: 460px;
        height: 50px;
        font-size: 22px;
    }
    
    #facebook {
        position: relative;
        top: 102px;
        left: 520px;
        height: 50px;
        font-size: 22px;
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
            <h1>Send us your feedback</h1>
            <textarea name="" id="f1" cols="30" rows="10" class="inputbox"></textarea>
            <button onclick="takeFeedback()" class="btn" id="b1">Submit</a></button>
            <h4 class="contact">Contact us at : </h4>
            <p>
                <a href="https://www.instagram.com">
                    <i class='fa fa-instagram' id="insta"></i>
                </a>
            </p>
            <p>
                <a href="https://www.whatsapp.com">
                    <i class='fa fa-whatsapp' id="whatsapp"></i>
                </a>
            </p>
            <p>
                <a href="https://www.Facebook.com">
                    <i class='fa fa-facebook' id="facebook"></i>
                </a>
            </p>

        </div>


    </header>
    <script>
        function takeFeedback() {
            var ans = document.getElementById('inputbox');
            alert('feedback submitted');
        }
    </script>
</body>

</html>