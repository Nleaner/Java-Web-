<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>员工列表</title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!--引用本地Bootstrap-->
		<link href="${base}/dist/css/bootstrap.min.css" rel="stylesheet">
		
		<link rel="stylesheet" type="text/css" href="${base }/css/style.css">
		<script src="${base }/js/emp.js"></script>
		<script src="${base }/js/jj.js"></script>
	</head>
	<h1>员工列表</h1>
	<hr />
	<h3>
		欢迎
	</h3>
	<hr />
	<input type="button" value="添加员工"
		onclick="window.location.href='${base}/add/preadd'">
	<hr />
	<table>
		<tr>
			<th>员工编号</th>
			<th>姓名</th>
			<th>部门名称</th>
			<th>入职日期</th>
			<th>修改</th>
			<th>删除</th>
		</tr>
			<c:forEach items="${emplist}" var="e" varStatus="status">
				<tr>
				    <th hidden="true">${e.empid }</th>
					<th>${status.count}</th>
					<th><a href="${base}/dis/display?id=${e.empid}">${e.ename }</a></th>
					<th>${e.depid<2?"人力资源":"市场"}</th>
					<th><fmt:formatDate value="${e.empdate }"
							pattern="yyyy-MM-dd" /></th>
					<th><a href="${base}/edit/preedit?id=${e.empid}">修改</a></th>		
					<th><a onclick="js_method(this)">删除</a></th>
				</tr>
			</c:forEach>
	</table>
	<hr />
	<%-- <ul class="pagination">
		<li
			<c:if test="${pageBean.isHavePrePage == false}">
				class="disabled"
			</c:if>><a
			href="#">&lt;&lt;</a></li>
		<li
			<c:if test="${pageBean.isHavePrePage == false}">
				class="disabled"
			</c:if>><a
			href="#">&lt;</a></li>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
		<li><a href="#">5</a></li>
		<li
			<c:if test="${pageBean.isHaveNextPage == false}">
				class="disabled"
			</c:if>><a
			href="#">&gt;</a></li>
		<li
			<c:if test="${pageBean.isHaveNextPage == false}">
				class="disabled"
			</c:if>><a
			href="#">&gt;&gt;</a></li>
	</ul> --%>

	<script src="${base }/js/jquery-3.1.1.min.js"></script>
	<script src="${base }/dist/js/bootstrap.min.js"></script>
</body>
</html>