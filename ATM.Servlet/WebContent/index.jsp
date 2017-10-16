<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ATM-首页</title>
 <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
 <div id="atmMain" class="atm-main">
        <div class="main-left">
            <ul class="menu">
                <li>
                    <button type="button" onclick="transfer();">转账</button>
                </li>
                <li>
                    <button type="button" onclick="changePassword();">改密</button>
                </li>
                <li>
                    <button type="button" onclick="exit();">退出</button>
                </li>
            </ul>
        </div>
        <div class="main-content">
            <h1>欢迎登录实训银行</h1>
        </div>
        <div class="main-right">
            <ul class="menu">
                <li>
                    <button type="button" onclick="query();">查询</button>
                </li>
                <li>
                    <button type="button" onclick="deposit();">存款</button>
                </li>
                <li>
                    <button type="button" onclick="withdraw();">取款</button>
                </li>
            </ul>
        </div>
    </div>
    <script type="text/javascript">
    // 转账
    function transfer() {
        document.location = "transfer.jsp";
    }

    //修改密码
    function changePassword() {
        document.location = "changePassword.jsp";
    }

    function exit() {
        document.location = "LogoutServlet";
    }

    function query() {
        document.location = "QueryServlet";
    }

    function deposit() {
        document.location = "deposit.jsp";
    }

    function withdraw() {
        document.location = "withdraw.jsp";
    }
    </script>
</body>
</html>