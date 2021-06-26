<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>生成订单</title>
</head>
<body>
	<h1>生成订单</h1>
	<hr />
	<h1>订单生成成功，订单号：${num}</h1>
	<br />
	<a href="${pageContext.request.contextPath}/user/index">继续购物</a>
</body>
</html>
