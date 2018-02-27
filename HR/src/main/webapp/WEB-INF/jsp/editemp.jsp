<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>修改员工</title>
	</head>
	<body>
	<form action="${base}/edit/edit">
		<table>
			<tr>
			<th>员工姓名</th>
			<th><input type="text" name="ename" value="${emp.ename}"></th>
			<th hidden="true"><input type="text" name="id" value="${emp.empid}"></th>
			</tr>
			
			<tr>
				<th>员工性别</th>
				<th>
				<c:choose>
				<c:when test="${emp.egendar==1}">
				<input type="radio" name="nan" id="nan" checked="checked" value="1" /><label for="nan">男</label>
				<input type="radio" name="nan" id="nv" value="0" /><label for="nv">女</label>
				</c:when>
				<c:otherwise>
				<input type="radio" name="nan" id="nan" value="1" /><label for="nan">男</label>
				<input type="radio" name="nan" id="nv" checked="checked" value="0" /><label for="nv">女</label>
				</c:otherwise>
				</c:choose>			
				
				<%-- <c:if test="${emp.egendar==1}">
				<input type="radio" name="nan" id="nan" checked="checked" value="1" /><label for="nan">男</label>
				<input type="radio" name="nan" id="nv" value="0" /><label for="nv">女</label>
				</c:if>
				<input type="radio" name="nan" id="nan" value="1" /><label for="nan">男</label>
				<input type="radio" name="nan" id="nv" checked="checked" value="0" /><label for="nv">女</label> --%>
				
				
				</th>
			</tr>
			
			<tr>
				<th>部门名称</th>
				<th>
				<select id="province" name="bumen" value="${emp.depid}">
				<c:forEach items="${deptlist}" var="item" varStatus="vs">
					<option value="${item.deptid}">${item.dname}</option>
				</c:forEach>
				</select>
				</th>
			</tr>
			
			<tr>
				<th><input type="reset" /><input type="submit" /></th>
			</tr>
			
		</table>
	</form>
	</body>
</html>