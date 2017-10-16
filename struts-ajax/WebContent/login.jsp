<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
<title>strutsajax text</title>
</head>
<script type="text/javascript">
	alert("sdfsf");
	$(function() {
		$(".get-btn").on("click", function() {
			$.get("ajaxAction", function(data) {
				console.dir(data);
				alert("true");
				alert(data.message);
			});
		});
	});
</script>
<body>
	<form action="login" method="post">
		<button type="button" class="get-btn">get请求</button>
	</form>
</body>
</html>