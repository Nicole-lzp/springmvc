<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
	<h1>登陆</h1>
	<form action="${pageContext.request.contextPath }/user/checkLogin" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input id="username" name="username" type="text" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input id="password" name="password" type="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="登陆" /></td>
				<td><input type="button" value="注册" onclick="window.location.href='${pageContext.request.contextPath }/user/regist'" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>