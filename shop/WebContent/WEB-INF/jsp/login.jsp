<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户登录</title>
</head>
<body>
	<h1>用户登录</h1>
	<hr />
	<form action="${pageContext.request.contextPath}/user/toLogin"
		method="post">
		用户名：<input type="text" name="username"
			placeholder="${msg eq null? '请输入用户名':msg}" autofocus required /><br />
		密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"
			placeholder="请输入密码" required /><br /> <input type="submit"
			value="登录" />
	</form>

	<a href="${pageContext.request.contextPath}/product/list">返回</a>
</body>
</html>
