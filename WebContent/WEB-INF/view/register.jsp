<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
    <head>
           <title>Register</title> 
        
        <meta name="keywords" content="" />
		<meta name="description" content="" />
        <meta charset="UTF-8">

<!-- 
MajdoorDekho
http://www.majdoordekho.com 
-->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link rel="shortcut icon" href="PUT YOUR FAVICON HERE">-->
        
        <!-- Google Web Font Embed -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
        
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
        <link href="js/colorbox/colorbox.css"  rel='stylesheet' type='text/css'>
        <link href="css/templatemo_style.css"  rel='stylesheet' type='text/css'>
         <link rel="stylesheet" href="md adil/login-form/css/style.css">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
          <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    
    <body>

        <div class="templatemo-top-bar" id="templatemo-top">
            <div class="container">
                <div class="subheader">
                    <div id="phone" class="pull-left">
                            <img src="images/phone.png" alt="phone"/>
                            882-414-4497
                    </div>
                    <div id="email" class="pull-center">
                            <img src="images/email.png" alt="email"/>
                            contact@MajdoorDekho.com
							<!-- <div class="navbar-collapse collapse" id="templatemo-nav-bar"> -->
							<ul class="nav navbar-nav navbar-right" style="margin-top: 0px;">
							<li><a href="login?action=as"> Login</a></li>	
							<li><a href="signup"> SignUp</a></li>
							</ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="templatemo-top-menu">
            <div class="container">
                <!-- Static navbar -->
                <div class="navbar navbar-default" role="navigation">
                    <div class="container">
                        <div class="navbar-header">
                                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                </button>
                                <a href="#" class="navbar-brand"><img src="images/a.PNG" alt="MajdoorDekho" title="MajdoorDekho" /></a>
                        </div>
                        <div class="navbar-collapse collapse" id="templatemo-nav-bar">
                            <ul class="nav navbar-nav navbar-right" style="margin-top: 40px;">
                                <li><a href="home">HOME</a></li>
                                <li><a href="about">ABOUT</a></li>
                                <li class="active"><a href="register">REGISTER A LABOUR</a></li>
                                <li><a href="team">TEAM</a></li>
                                <li><a href="contact">CONTACT</a></li>
                            </ul>
                        </div><!--/.nav-collapse -->
                    </div><!--/.container-fluid -->
                </div><!--/.navbar -->
            </div> <!-- /container -->
        </div>
        <div id="templatemo-portfolio" >
            <div class="container">
                <div class="row">
                    <div class="templatemo-line-header" >
                        <div class="text-center">
                            <hr class="team_hr team_hr_left hr_gray"/><span class="txt_darkgrey">Register a Labour</span>
                            <hr class="team_hr team_hr_right hr_gray" />
                        </div>
                    </div>
                    
                </div> <!-- /.row -->


 <div id="login">
 	<%=request.getAttribute("msg") %>
  <h1>MajdoorDekho</h1>
  <form action="register" method="post">
    	<h3>Your Personal Information</h3>
      	<input type="text" name="Firstname" value="" placeholder="Enter Your Firstname">
	 	<input type="text" name="Lastname" value="" placeholder="Enter Your Lastname">
	 	<input type="text" name="Date Of Birth" value="" placeholder="DD/MM/YYYY">
	 <br>
     <select name="gender">
				<option>Gender</option>
				<option>Male</option>
				<option>Female</option>		
			</select>
      <h3>Your Contact Information</h3>
	  <input type="text" name="mobile no" value="" placeholder="Enter Your Mobile No.">
	  <input type="email" name="email" value="" placeholder="Enter your email(if exist)">
      <input type="Address" name="Address" value="" placeholder="Enter Your Full Address">
	  <select name="city">
				<option>City</option>
				<option>Jaipur</option>
				<option>Chandigarh</option>
				<option>Varanasi</option>
				<option>Mumbai</option>
				<option>Rewadi</option>
				<option>Delhi</option>
     </select>				
     <select name="state">
				<option>State</option>
				<option>Rajasthan</option>
				<option>Punjab</option>
				<option>Uttar Pradesh</option>
				<option>Maharashtha</option>
				<option>Haryana</option>
				<option>Delhi</option>
				
	 </select>
     <input type="text" name="Pincode" value="" placeholder="Enter Your Postal Code">
	  <h3>Your Work Experience</h3>
     <select name="work-type">
				<option>Work-type</option>
				<option>Karigar</option>
				<option>Baildar</option>
	 </select>
	 <input type="text" name="year" value="" placeholder="Enter Your Work-Experience">
	   <!--  <label>
	  <input type="checkbox" name="remember_me" id="remember_me">
	  I accept  <a href="http://www.MajdoorDekho.com/"> MajdoorDekho </a>Terms & Condition
      </label> -->
	  <input type="submit" name="commit" value="Sign Up">
      

  </div>
            </div><!-- /.container -->
        </div> <!-- /.templatemo-team -->       

        <div class="templatemo-footer" >
            <div class="container">
                <div class="row">
                    <div class="text-center">

                        <div class="footer_container">
                            <ul class="list-inline">
                                <li>
                                    <a href="#">
                                        <span class="social-icon-fb"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="social-icon-rss"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="social-icon-twitter"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="social-icon-linkedin"></span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="social-icon-dribbble"></span>
                                    </a>
                                </li>
                            </ul>
                            <div class="height30"></div>
                            <a class="btn btn-lg btn-orange" href="#" role="button" id="btn-back-to-top">Back To Top</a>
                            <div class="height30"></div>
                        </div>
                        <div class="footer_bottom_content">
                   			Copyright © 2015 <a href="#">MajdoorDekho</a>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>