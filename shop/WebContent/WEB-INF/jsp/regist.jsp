<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>用户注册</title>
</head>
<body>
	<h1>用户注册</h1>
	<hr />
	<form action="${pageContext.request.contextPath}/user/checkName"
		method="post">
		用户名：<input type="text" name="username"
			placeholder="${msg eq null? '请输入用户名':msg}" autofocus required /><br />
		密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"
			placeholder="请输入密码" required /><br /> 电&nbsp;&nbsp;&nbsp;话：<input
			type="text" name="phone" placeholder="请输入电话" required /><br />
		地&nbsp;&nbsp;&nbsp;址：<input type="text" name="address"
			placeholder="请输入地址" required /><br /> <input type="submit"
			value="注册" />
	</form>
	<a href="${pageContext.request.contextPath}/product/list">返回</a>
</body>
</html>
