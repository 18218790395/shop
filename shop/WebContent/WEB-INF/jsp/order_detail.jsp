<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>我的订单</title>
</head>
<body>
	<h1>我的订单</h1>
	<hr />
	${user.username}用户 ${orderandcart.id}订单
	<br /> ------------------------------------
	<table border="0">
		<tr>
			<th>序号</th>
			<th>商品</th>
			<th>数量</th>
			<th>价格</th>
		</tr>
		<c:forEach items="${orderandcarts}" var="orderandcart" varStatus="s">
			<tr>
				<td>${s.count}</td>
				<td>${orderandcart.name}</td>
				<td>${orderandcart.num}</td>
				<td>${orderandcart.price}</td>
			</tr>
		</c:forEach>
	</table>
	------------------------------------
	<br /> 共1条&nbsp;&nbsp;&nbsp;&nbsp;总计：${price}
	<br />
	<a href="${pageContext.request.contextPath}/order/order_list">返回</a>
</body>
</html>
