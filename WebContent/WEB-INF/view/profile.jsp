<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
         <title>Profile</title>
        
        <meta name="keywords" content="" />
		<meta name="description" content="" />
<!-- 
MajdoorDekho
http://www.majdoordekho.com 
--> <meta charset="UTF-8">
   
    
    
    
    
        
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link rel="shortcut icon" href="PUT YOUR FAVICON HERE">-->
        
        <!-- Google Web Font Embed -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
        
        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.css" rel='stylesheet' type='text/css'>

        <!-- Custom styles for this template -->
		<link rel="stylesheet" href="md adil/login-form/css/style.css">
        <link href="js/colorbox/colorbox.css"  rel='stylesheet' type='text/css'>
        <link href="css/templatemo_style.css"  rel='stylesheet' type='text/css'>

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
                            978-524-6002
                    </div>
                    <div id="email" class="pull-right">
                            <img src="images/email.png" alt="email"/>
                            contact@MajdoorDekho.com
							<!-- <div class="navbar-collapse collapse" id="templatemo-nav-bar"> -->
							<ul class="nav navbar-nav navbar-right" style="margin-top: 0px;">
							<li class="active"><a href="login?action=logout"> LogOut</a></li>
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
                                <li class="active"><a href="profile">BOOK A LABOUR</a></li>
                                <li><a href="cancelb">CANCEL BOOKING</a></li>
                                <!-- <li><a href="cancel">CANCEL A LABOUR</a></li> -->
                                <li><a href="rate">RATE A LABOUR</a></li>
                               
                            </ul>
                        </div><!--/.nav-collapse -->
                    </div><!--/.container-fluid -->
                </div><!--/.navbar -->
            </div> <!-- /container -->
        </div>
		
    <div class="row">
                    <div class="templatemo-line-header" >
                        <div class="text-center">
                            <hr class="team_hr team_hr_left hr_gray"/><span class="txt_darkgrey">Book a Labour</span>
                            <hr class="team_hr team_hr_right hr_gray" />
                        </div>
                    </div>
                    
                </div> <!-- /.row -->

<div id="login">
 <script type="text/javascript"> function succ(){
	  alert("Thank you for your booking your bpn '"+<%=request.getAttribute("name")%>+"'");
  } </script>
  
  <h1>MajdoorDekho</h1>
  <form action="profile" method="post">
  <select name="type">
         <option>labour type</option>
		 <option>Karigar</option>
		 <option>Baildar</option>
		 <option>Both</option>
  </select>	 
	<input type="text" name="nkarigar" placeholder="Enter no. of Karigar" />
    <input type="text" name="nbaildar" placeholder="Enter no. of Baildar"/>
	<input type="text" name="conplace" placeholder="Enter The Place of Construction"/>
	 <!-- <label>
	  <input type="checkbox" name="remember_me" id="remember_me">
	  I accept  <a href="http://www.MajdoorDekho.com/"> MajdoorDekho </a>Terms & Condition
      </label> -->
    <input type="submit" name="commit" onclick="succ();" value="Confirm" />
	
                            
  </form>
</div>
 
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

    <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

        <script src="md aadil/login-form/js/index.js"></script>
		</body>
		</html>
        