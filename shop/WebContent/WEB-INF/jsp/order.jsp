<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>确认订单</title>
</head>
<body>
	<h1>确认订单</h1>
	<hr />
	用户：${user.username}
	<br /> 电话：${user.phone}
	<br /> 地址：${user.address}
	<br />
	<table border="1">
		<tr>
			<th>序号</th>
			<th>商品</th>
			<th>数量</th>
			<th>价格</th>
		</tr>
		<c:forEach items="${carts}" var="cart" varStatus="s">
			<tr>
				<td>${s.count}</td>
				<td>${cart.name}</td>
				<td>${cart.num}</td>
				<td>${cart.price}</td>
			</tr>
		</c:forEach>
	</table>
	----------------------------------------------------
	<br /> 总计：${price}
	<br />
	<a
		href="${pageContext.request.contextPath}/order/success">生成订单</a>
	<a href="${pageContext.request.contextPath}/cart/list">返回</a>
</body>
</html>
