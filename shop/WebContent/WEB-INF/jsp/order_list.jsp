<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>历史订单</title>
</head>
<body>
	<h1>历史订单</h1>
	<hr />
	<table border="1">
		<tr>
			<th>序号</th>
			<th>订单号</th>
			<th>创建日期</th>
		</tr>
		<c:forEach items="${orders}" var="order" varStatus="s">
			<tr>
				<td>${s.count}</td>
				<td><a
					href="${pageContext.request.contextPath}/order/order_detail?id=${order.id}">${order.id}</a>
				</td>
				<td>${order.date}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="${pageContext.request.contextPath}/user/index">返回</a>
</body>
</html>
