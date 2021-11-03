<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="LandingpageStyle.css">
<style>
.botom {
	margin-top: 500px;
}

.cpy {
	margin-left: 636px;
}
.h3{
	@import url('https://fonts.googleapis.com/css2?family=Lora&display=swap');
	font-family: 'Lora', serif;
	font-size:40px;
	margin-top: -400px;
	text-align: center;
	position: absolute;
	left: -3%;
color:black;
}
.im{
height:100vh;
width:100vw;
}
</style>
<script type="text/javascript">
function message(){
	alert("Please Select The Options From Dropdown To Register");
}

</script>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-primary fixed-top">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="aboutus navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="Aboutus.html">About Us</a></li>
				</ul>
				<div class="d dropdown">
					<Button class="bn btn dropdown-toggle btn-outline-warning"
						data-toggle="dropdown">
						Login Options <span class="caret"></span>
					</Button>
					<ul class="menu dropdown-menu">
						<li><a class="dropdown-item" href="Admin.html">ADMIN</a></li>
						<li><a class="dropdown-item" href="StudentLanding.html">STUDENT</a></li>
						<li><a class="dropdown-item" href="InstituteLanding.html">INSTITUTE</a></li>
					</ul>
				</div>
			</div>
		</div>
	</nav>
	<section class="top-hero-section">

	<div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
	  <ol class="carousel-indicators">
         <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
         <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
         <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
      </ol>
	  <div class="carousel-inner">
	    <div class="carousel-item active">
	      <img src="C:/Users/HARSH/Desktop/FCS/LandingPage1.jpg" class="im" data-bs-interval="1000" >
	      <div class="carousel-caption d-none d-md-block">
	        <h3>Welcome To Training Institute</h3>
						
	         <button class="in btn btn-primary extra" onclick = "message()"><b>Get Started</b></button>
	      </div>
	    </div>
	    <div class="carousel-item">
	      <img src="C:/Users/HARSH/Desktop/FCS/LandingPage2.jpg" class="im" data-bs-interval="1000" >
	      <div class="carousel-caption d-none d-md-block">
	        <h3  class = h3>Take Your Learnings To Next Level</h3>
	         <a class="in btn btn-primary extra"  href="StudentLanding.html"><b>Register Now!</b></a>
	      </div>
	    </div>
	    <div class="carousel-item">
	      <img src="C:/Users/HARSH/Desktop/FCS/LandingPage3.jpg" class="im" data-bs-interval="1000" >
	      <div class="carousel-caption d-none d-md-block">
	        <h3>Take Your Campus To Web</h3>
	         <a class="in btn btn-warning extra"  href="InstituteLanding.html"><b>Register Now!</b></a>
	      </div>
	    </div>
	  </div>
	</div>
		<!--  <div class="c1 container-fluid">
			<h3 class="display-4">
				<b>Welcome To Training Institute</b>
			</h3>
			<div class="row align-item-center">
				<div class="col-md-5">

					<blockquote class="b blockquote">
						<p>Education is the most powerful weapon which you can use to
							change the world...</p>
						<footer class="blockquote-footer">NELSON MANDELA</footer>
					</blockquote>
				</div>
			</div>
		</div>-->
		<nav class="botom navbar navbar-expand-lg navbar-light bg-primary fixed-bottom">
			<div class="container-fluid">
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="cpy nav-item"><a class="nav-link active"
							aria-current="page">Copyrights @2021</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</section>

</body>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</html>
