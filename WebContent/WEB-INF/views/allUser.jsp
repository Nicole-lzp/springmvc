<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContentType();
	String basePath = request.getScheme()+"//"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>查询用户列表</title>
<script type="text/javascript" src="${pageContext.request.contextPath }jquery-easyui-1.7.0/jquery-3.3.1.min.js"></script>
<script type="text/javascript">  
    function del(id){  
        $.get("<%=basePath%>user/delUser?id=" + id,function(data){  
            if("success" == data.result){  
                alert("删除成功");  
                window.location.reload();  
            }else{  
                alert("删除失败");  
            }  
        });  
    }  
</script>
</head>
<body>
<h6>添加用户</h6>  
<table border="1">  
    <tbody>  
        <tr>  
            <th>姓名</th>  
            <th>密码</th>  
            <th>操作</th>  
        </tr>  
        <c:if test="${!empty userList }">  
            <c:forEach items="${userList}" var="user">  
                <tr>  
                    <td>${user.username }</td>  
                    <td>${user.password }</td>  
                    <td>  
                        <a>编辑</a>  
                        <a>删除</a>  
                    </td>  
                </tr>               
            </c:forEach>  
        </c:if>  
    </tbody>  
</table>  
</body>
</html>