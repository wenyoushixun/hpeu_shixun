<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<title>register</title>
<link rel="stylesheet" type="text/css" href="css/type.css">
</head>

<body>
	<div id="all">
		<h1>${messages }</h1>
		<div id="container">
			<header>
				<h1>
					<img src="images/logo.png">用户注册
				</h1>
			</header>
			<form action="index" name="index" onsubmit="return Main()"
				method="post">
				<div class="forms">
					用户名称： <input class="input" type="text" name="user.username"
						id="username" autofocus placeholder="请输入您的用户名！" required>
				</div>
				<div class="forms">
					登录密码： <input class="input" type="password" name="user.password"
						id="password" placeholder="请输入您的密码!" maxlength="20" required>
				</div>
				<div class="forms">
					重复密码： <input class="input" type="password"
						name="user.repeatPassword" id="repassword"
						placeholder="请输入您的确认密码!" maxlength="20" required>
				</div>
				<div class="forms">
					电子邮箱： <input class="input" type="email" name="user.email"
						id="email" placeholder="请输入您的邮箱！" required>
				</div>
				<div>
					<p>
						性 别：
						<!-- 单选框 -->
						<input type="radio" name="user.gender" checked="checked" value="男">男
						<input type="radio" name="user.gender" value="女">女
					</p>
				</div>
				<div>
					<p>
						职 业：
						<!-- 下拉选择框 -->
						<select id="" class="profession" name="user.profession">
							<option>学生</option>
							<option>老师</option>
							<option>程序员</option>
							<option>工程师</option>
							<option>ui美工</option>
						</select>
					</p>
				</div>
				<div>
					<p>
						爱 好： <select id="" name="user.hobby" class="hobby" multiple>
							<option>书法</option>
							<option>音乐</option>
							<option>运动</option>
							<option>编程</option>
							<option>游泳</option>
						</select>
					</p>
				</div>
				<hr>
				<div>
					<button class="button" type="submit">注册</button>
					<button class="button" type="reset" class="">重置</button>
					<button class="button" onclick="login();">返回登录</button>
				</div>
			</form>
		</div>
		<footer id="footer">Copyright&copy;2017.轻实训版权所有</footer>
	</div>
	<script src="js/type.js" type="text/javascript"></script>
</body>

</html>