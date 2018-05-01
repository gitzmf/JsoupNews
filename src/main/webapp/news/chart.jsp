<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>统计</title>
</head>
<body>
<table><tr>
<!-- 通过随机数的产生避免的缓存的使用 -->
<td><img alt="1" src="${pageContext.request.contextPath}/jfreechart_lineChart.action?number=<%=100*Math.random()%>"/>
<td><img alt="2" src="${pageContext.request.contextPath}/jfreechart_pieChart.action?number=<%=10*Math.random()%>"/>
</tr>
</table>
</body>
</html>