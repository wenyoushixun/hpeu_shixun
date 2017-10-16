<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<title>ajaxservlet 练习</title>
</head>
<body>
	<form action="AjaxServlet" method="post">
		<button class="get-btn">get请求</button>
		<button class="post-btn">poat请求</button>
	</form>
	<script type="text/javascript">
		$(function() {

			//进入get方法
			$(".get-btn").on("click", function() {
				$.get("AjaxServlet", {
					"name" : "getTom",
					"gender" : "getmale"
				}, function(data) {
					//回调函数
					alert("true");
				}, "text");
			});
			
			//进入post方法
			$(".post-btn").on("click", function() {
				$.get("AjaxServlet", {
					"name" : "postTom",
					"gender" : "postmale"
				}, function(data) {
					//回调函数
					alert("false");
				}, "text");
			});

		});
	</script>
</body>
</html>