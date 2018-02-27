<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>员工详情</title>
	</head>
	<body>
		<table>
			<tr>
			<th>员工编号</th>
			<th>${emp.empid}</th>
			</tr>
			
			<tr>
			<th>员工姓名</th>
			<th>${emp.ename}</th>
			</tr>
			
			<tr>
			<th>员工性别</th>
			<th>${emp.egendar>0?"男":"女"}</th>
			</tr>
			
			<tr>
			<th>部门名称</th>
			<th>${emp.depid<2?"人力资源":"市场"}</th>
			</tr>
			
			<tr>
				<th colspan='2'><a href="${base}/emp/list">返回</a></th>
			</tr>
			
		</table>
	</body>
</html>