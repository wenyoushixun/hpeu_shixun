function Main() {
	var username = document.getElementById("username").value;
	var password = document.getElementById("password").value;
	var repassword = document.getElementById("repassword").value;
	var email = document.getElementById("email").value;

	if (username == "") {
		alert("用户名不能为空！");
		return false;
	} else if (password == "") {
		alert("密码不能为空！");
		return false;
	} else if (repassword == "") {
		alert("确认密码不能为空！");
		return false;
	} else if (password != repassword) {
		alert("两次输入的密码不一致！");
		return false;
	} else if (email == "") {
		alert("邮箱不能为空！");
		return false;
	} else if (username.length < 6 || username.length > 20) {
		alert("用户名必须输入6位数以上，20位以下！");
		return false;
	} else if (password.length < 6 || password.length > 20) {
		alert("密码必须输入6位数以上，20位以下！");
		return false;
	} else if (repassword.length < 6 || repassword.length > 20) {
		alert("确认必须输入6位数以上，20位以下！");
		return false;
	}
	return true;
}
function login() {
	document.location = "login.jsp";
}

//登陆验证函数
function logins() {
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
	return true;
}

function index() {
	document.location = "index.jsp";
}