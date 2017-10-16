<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

		body {
			text-align: center;
		}

		#loginContainer {
			margin: 10% auto 0 auto;
			padding: 15px;
			width: 780px;
			height: 360px;
			border: solid 1px #ccc;
		}

		.container-left {
			float: left;
			width: 40%;
		}

		.container-right {
			float: left;
			width: 60%;
		}

		.login-container h1 {
			border-bottom: 1px solid #ddd;
			background: url('images/logo.png') no-repeat 90px;
			background-size: 50px;
			font-weight: 700;
			font-size: 25px;
			line-height: 60px;
		}

		form {
			position: relative;
			width: 100%;
			text-align: center;
		}

		.input-group .input {
			margin-top: 30px;
			padding: 0 10px;
			width: 50%;
			height: 30px;
			font-size: 14px;
		}

		.remember-me {
			margin-top: 30px;
			margin-left: 15%;
			width: 100%;
			text-align: left;
		}

		.login-control {
			margin-top: 20px;
		}

		.login-control button {
			margin: 15px;
			width: 80px;
			height: 25px;
		}
	</style>
</head>

<body>
	<div id="loginContainer" class="login-container">
		<div class="container-left">
			<img src="images/login.jpg">
		</div>
		<div class="container-right">
			<h1>系统登录</h1>
			<form name="loginForm" action="login" onsubmit="return login()" method="post">
				<div class="input-group">
					<label>用户名：</label> <input type="text" name="nameInput" class="input" id="username" placeholder="请输入您的用户名！">
				</div>
				<div class="input-group">
					<label class="letter">密&nbsp;&nbsp;&nbsp;码：</label> <input type="password" name="passwordInput" class="input" id="passWord" placeholder="请输入您的登录密码！">
				</div>
				<div class="remember-me">
					<input type="checkbox" id="remember" name="rememberInput"> <label for="remember">记住密码</label>
				</div>
				<div class="login-control">
					<button type="submit" class="">登陆</button>
					<button type="reset" class="">重置</button>
					<button type="button" class="">注册</button>
				</div>
			</form>
		</div>
	</div>
	<script type="text/javascript">
		// 登陆验证函数
		function login() {
			//获取用户输入的用户名
			var username = document.getElementById("username").value;
			//获取用户输入的密码
			var password = document.getElementById("passWord").value;

			//验证用户输入项
			if (username == "") {
				alert("用户名不允许为空！");
				return false;
			} else if (password == "") {
				alert("密码不允许为空！");
				return false;
			}

			alert("登陆成功！");
			return true;
		}
	</script>
</body>

</html>