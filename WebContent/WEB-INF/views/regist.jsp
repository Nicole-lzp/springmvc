<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户注册页面</title>
</head>
<body>
<h3>注册页面</h3>
<hr/>
<form action="${pageContext.request.contextPath }/user/doRegist" mothod="post">
	<table border="1px">
		<tr herght="35px">
			<td width="150px">用户名</td>
			<td width="300px">
				<input type="text" name="username" id="username">
			</td>
		</tr>
		<tr herght="35px">
			<td width="150px">密码</td>
			<td width="300px">
				<input type="text" name="password" id="password">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" id="regist" value="注册" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>