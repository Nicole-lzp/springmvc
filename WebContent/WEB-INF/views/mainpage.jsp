<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>首页</title>
<style type="text/css">
	body,html{
		margin: 0px;
		padding: 0px;
		height: 100%;
		width: 100%;
	}
	.box { height: 100%; width: 100%;}
	.title { background-color: red; height: 32%;font-size: em;}
	.title > h1 { padding-left: 25px; margin: 0px; padding-top: 20px;font-size: em;}
	.title > span { float:right; }
	.tag { background-color: blue; height: 10%}
	.tag > div { width: 80px; float:left; border-left: 4px solid black; text-align:center;}
	.body { height: 58%}
</style>
</head>
<body>
<div class="box">
	<div class="title">
		<h1>多 媒 体 教 室 管 理 系 统</h1>
		<span>欢迎你，${username }！&nbsp;&nbsp; <a href="#">退出</a></span>
	</div>
	<div class="tag">
		<div style="border:0px;">首页</div>
		<div>用户管理</div>
		<div>密码管理</div>
		<div>权限管理</div>
	</div>
	<div class="body">
		<h1>欢迎进入多媒体教室管理系统</h1>
	</div>
</div>
</body>
</html>