<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品信息</title>
<link rel="stylesheet" href="/resource/mystyles.css">
<script type="text/javascript" src="/resource/jquery-3.2.1.js"></script>
</head>
<body>
   <form action="selects" method="post">
           价格:<input type="text" name="p1" value="${vo.p1}">---
       <input type="text" name="p2" value="${vo.p2}">
       销售百分比:<input type="text" name="t1" value="${vo.t1}">---
          <input type="text" name="t2" value="${vo.t2}">
          排序:<select name="ass">
             <option value="price">价格</option>
             <option value="percent">百分比</option>
       </select>
       <select name="dess">
             <option value="asc">正序</option>
             <option value="desc">倒序</option>
       </select>
       <input type="submit" value="查询">
   </form><br><br>
   <div>
      <table>
         <tr>
            <td>商品</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品销售百分比</td>
         </tr>
         <c:forEach items="${goods}" var="g">
            <tr>
              <td>${g.id}</td>
              <td>${g.name}</td>
              <td>${g.price}</td>
              <td>${g.percent}</td>
            </tr>
         </c:forEach>
      </table>
   <div style="clear:both;">${pageNum}</div>
   </div>
</body>
</html>