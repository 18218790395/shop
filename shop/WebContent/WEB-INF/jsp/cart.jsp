<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>我的购物车</title>
</head>
<body>
	<h1>我的购物车</h1>
	<hr />
		<table border="1">
			<tr>
				<th>序号</th>
				<th>商品</th>
				<th>数量</th>
				<th>价格</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${carts}" var="cart" varStatus="s">
				<tr>
					<td>${s.count}</td>
					<td>${cart.name}</td>
					<td>${cart.num}</td>
					<td>${cart.price}</td>
					<td><a
						href="${pageContext.request.contextPath}/cart/deleteCart?id=${cart.id}"
						onclick="return confirm('是否确认删除？');">删除</a> <a href="#">修改</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	----------------------------------------------------
	<br /> 总计：${price}
	<br />
	<a href="${pageContext.request.contextPath}/cart/clearCart">清空购物车</a>
	<a href="${pageContext.request.contextPath}/user/index">继续购物</a>
	<a href="${pageContext.request.contextPath}/cart/order">结算</a>
</body>
</html>
