<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resource/css/bootstrap.css">
<script type="text/javascript" src="/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
<script type="text/javascript">
function fenye(pageNum) {
	$("[name=pageNum]").val(pageNum);
	$("#myForm").submit();
}
</script>
</head>
<body>
<form action="PlanList" method="post" id="myForm">
  <input type="hidden" name="pageNum" value="${page.pageNum}">
  项目名称:<input type="text" name="name" value="${name}">
  <input type="submit" class="btn btn-dark" value="搜索">
  
</form>
<table class="table">
 <thead class="thead-dark">
 <tr>
    <th scope="col">
     <button name="xz" class="btn btn-info" onclick="xz(this.value)" value="1">全选</button>
     <button class="btn btn-info" onclick="fx()">反选</button>      
    </th>
    <th scope="col">主键</th>
    <th scope="col">项目名称</th>
    <th scope="col">投资金额</th>
    <th scope="col">分管领导</th>
    <th scope="col">部门</th>
    <th scope="col">操作</th>
 </tr>
 </thead>
 <tbody>
    <c:forEach items="${page.list}" var="p">
    <tr>
        <td><input type="checkbox" name="ch" value="${p.id}"></td>
        <th scope="row">${p.id}</th>
        <th>${p.name}</th>
        <th>${p.amount}</th>
        <th>${p.manager}</th>
        <th>${p.d.dname}</th>
        <td>
          <a href="getOne?id=${p.id}">查看详情</a>
          <a href="toUpd?id=${p.id}">编辑</a>
        </td>
    </tr>
    </c:forEach>
 </tbody>
</table>
<jsp:include page="/resource/jsp/page.jsp"></jsp:include>
页码:${page.pageNum}
</body>
</html>