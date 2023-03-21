<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Predictions.</title>
<style type="text/css">
#img1 {
    position: fixed;
    left: 600px;
    margin-top: 25px;
    width: 75px;
}
#img2 {
    position: fixed;
    left: 800px;
    margin-top: 25px;
    width: 75px;
}
#img3 {
    position: fixed;
    left: 300px;
    margin-top: 200px;
    width: 75px;
}
#img4 {
    position: fixed;
    left: 500px;
    margin-top: 200px;
    width: 75px;
}
#img5 {
    position: fixed;
    left: 700px;
    margin-top: 200px;
    width: 75px;
}
#img6 {
    position: fixed;
    left: 900px;
    margin-top: 200px;
    width: 75px;
}
#img7 {
    position: fixed;
    left: 1100px;
    margin-top: 200px;
    width: 75px;
}
#img8 {
    position: fixed;
    left: 300px;
    margin-top: 400px;
    width: 75px;
}
#img9 {
    position: fixed;
    left: 500px;
    margin-top: 400px;
    width: 75px;
}
#img10 {
    position: fixed;
    left: 700px;
    margin-top: 400px;
    width: 75px;
}
#img11 {
    position: fixed;
    left: 900px;
    margin-top: 400px;
    width: 75px;
}
#img12 {
    position: fixed;
    left: 1100px;
    margin-top: 400px;
    width: 80px;
}
#img13 {
    position: fixed;
    left: 500px;
    margin-top: 600px;
    width: 75px;
}
#img14 {
    position: fixed;
    left: 700px;
    margin-top: 600px;
    width: 80px;
}
#img15 {
    position: fixed;
    left: 900px;
    margin-top: 600px;
    width: 75px;
}


#pl1 {
    position: fixed;
    left: 575px;
    margin-top: 125px;
    color: white;
}
#pl2 {
    position: fixed;
    left: 775px;
    margin-top: 125px;
	color: white;
}
#pl3 {
    position: fixed;
    left: 275px;
    margin-top: 300px;
    color: white;
}
#pl4 {
    position: fixed;
    left: 475px;
    margin-top: 300px;
    color: white;
}
#pl5 {
    position: fixed;
    left: 675px;
    margin-top: 300px;
    color: white;
}
#pl6 {
    position: fixed;
    left: 875px;
    margin-top: 300px;
    color: white;
}
#pl7 {
    position: fixed;
    left: 1075px;
    margin-top: 300px;
    color: white;
}
#pl8 {
    position: fixed;
    left: 275px;
    margin-top: 500px;
    color: white;
}
#pl9 {
    position: fixed;
    left: 475px;
    margin-top: 500px;
    color: white;
}
#pl10 {
    position: fixed;
    left: 675px;
    margin-top: 500px;
    color: white;
}
#pl11 {
    position: fixed;
    left: 875px;
    margin-top: 500px;
    color: white;
}
#pl12 {
    position: fixed;
    left: 1075px;
    margin-top: 500px;
    color: white;
}
#pl13 {
    position: fixed;
    left: 475px;
    margin-top: 700px;
    color: white;
}
#pl14 {
    position: fixed;
    left: 675px;
    margin-top: 700px;
    color: white;
}
#pl15 {
    position: fixed;
    left: 875px;
    margin-top: 700px;
    color: white;
}

</style>
</head>
<body style="background: green;">
	
	<img src="${path}/r/${g1}.png" id="img1"> 
	<p id="pl1"> ${g1_team} </p>
	
	<img src="${path}/r/${g2}.png" id="img2"> 
	<p id="pl2"> ${g2_team} </p>
	
	<img src="${path}/r/${d1}.png" id="img3"> 
	<p id="pl3"> ${d1_team} </p>
	
	<img src="${path}/r/${d2}.png" id="img4"> 
	<p id="pl4"> ${d2_team} </p>

	<img src="${path}/r/${d3}.png" id="img5"> 
	<p id="pl5"> ${d3_team} </p>

	<img src="${path}/r/${d4}.png" id="img6"> 
	<p id="pl6"> ${d4_team} </p>

	<img src="${path}/r/${d5}.png" id="img7"> 
	<p id="pl7"> ${d5_team} </p>

	<img src="${path}/r/${m1}.png" id="img8"> 
	<p id="pl8"> ${m1_team} </p>

	<img src="${path}/r/${m2}.png" id="img9"> 
	<p id="pl9"> ${m2_team} </p>

	<img src="${path}/r/${m3}.png" id="img10"> 
	<p id="pl10"> ${m3_team} </p>

	<img src="${path}/r/${m4}.png" id="img11"> 
	<p id="pl11"> ${m4_team} </p>

	<img src="${path}/r/${m5}.png" id="img12"> 
	<p id="pl12"> ${m5_team} </p>

	<img src="${path}/r/${f1}.png" id="img13">
	<p id="pl13"> ${f1_team} </p>

	<img src="${path}/r/${f2}.png" id="img14"> 
	<p id="pl14"> ${f2_team} </p>

	<img src="${path}/r/${f3}.png" id="img15"> 
	<p id="pl15"> ${f3_team} </p>
	
</body>
</html>