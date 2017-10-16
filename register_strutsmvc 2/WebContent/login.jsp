<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>

<body>
	<div id="loginContainer" class="login-container">

		<div class="container-left">
			<img src="images/login.jpg">
		</div>
		<div class="container-right">
			<h1>系统登录</h1>
			<form name="login" onsubmit="return logins()" action="login"
				method="post">
				<div class="input-group">
					<label>用户名：</label> <input type="text" name="user.username"
						class="input" id="username" placeholder="请输入您的用户名！">
				</div>
				<div class="input-group">
					<label class="letter">密&nbsp;&nbsp;&nbsp;码：</label> <input
						type="password" name="user.password" class="input" id="passWord"
						placeholder="请输入您的登录密码！">
				</div>
				<div class="remember-me">
					<input type="checkbox" id="remember" name="rememberInput">
					<label for="remember">记住密码</label>
				</div>
				<div class="login-control">
					<button type="submit" class="">登陆</button>
					<button type="reset" class="">重置</button>
					<button type="button" onclick="index();" class="">注册</button>
				</div>
				<h1>${message} ${messages}</h1>
			</form>
		</div>
	</div>
	<script src="js/type.js" type="text/javascript"></script>
</body>

</html>