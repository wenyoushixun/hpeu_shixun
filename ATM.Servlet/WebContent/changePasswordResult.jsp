<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ATM-修改密码</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div id="atmMain" class="atm-main">
		<div class="main-left">
			<ul class="menu">
				<li>
					<button type="button" onclick="returnMain();">返回</button>
				</li>
			</ul>
		</div>
		<div class="main-content">
			<h3>${newpassword }</h3>
			<h2>${password}</h2>
		</div>
		<div class="main-right"></div>
	</div>

	<script src="js/common.js" type="text/javascript"></script>
</body>
</html>