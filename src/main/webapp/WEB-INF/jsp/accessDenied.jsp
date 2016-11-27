<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>404 - Bootstrap Admin Template</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-responsive.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
<link
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,600italic,400,600"
	rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.7.2.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.js" />"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="navbar navbar-fixed-top">

		<div class="navbar-inner">

			<div class="container">

				<a class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-collapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" href="index.html"> Bootstrap Admin Template </a>

				<div class="nav-collapse">
					<ul class="nav pull-right">

						<li class=""><a href="index.html" class=""> <i
								class="icon-chevron-left"></i> Back to Dashboard
						</a></li>
					</ul>

				</div>
				<!--/.nav-collapse -->

			</div>
			<!-- /container -->

		</div>
		<!-- /navbar-inner -->

	</div>
	<!-- /navbar -->



	<div class="container">

		<div class="row">

			<div class="span12">

				<div class="error-container">
					<h1>404</h1>

					<h2>Who! bad trip man. No more pixesl for you.</h2>

					<div class="error-details">
						Sorry, an error has occured! Why not try going back to the <a
							href="index.html">home page</a> or perhaps try following!

					</div>
					<!-- /error-details -->

					<div class="error-actions">
						<a href="index.html" class="btn btn-large btn-primary"> <i
							class="icon-chevron-left"></i> &nbsp; Back to Dashboard
						</a>



					</div>
					<!-- /error-actions -->

				</div>
				<!-- /error-container -->

			</div>
			<!-- /span12 -->

		</div>
		<!-- /row -->

	</div>
	<!-- /container -->
</body>
</html>