<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>商品列表</title>
</head>
<body>
	<h1>商品列表</h1>
	<a href="${pageContext.request.contextPath}/user/regist">注册</a>
	<a href="${pageContext.request.contextPath}/user/login">登录</a>
	<hr />
	<table border="1">
		<tr>
			<th>序号</th>
			<th>商品</th>
			<th>价格</th>
			<th>操作</th>
		</tr>

		<c:forEach items="${products}" var="product" varStatus="s">
			<tr>
				<td>${s.count}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
				<td><a href="${pageContext.request.contextPath}/user/login">添加购物车</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/user/login">查看购物车</a>
</body>
</html>
