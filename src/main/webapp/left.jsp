<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>菜单</title>
<link href="${pageContext.request.contextPath}/css/left.css" rel="stylesheet" type="text/css"/>
<link rel="StyleSheet" href="${pageContext.request.contextPath}/css/dtree.css" type="text/css" />
</head>
<body>
<table width="100" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="12"></td>
  </tr>
</table>
<table width="100%" border="0">
  <tr>
    <td>
<div class="dtree">

	<a href="javascript: d.openAll();">展开所有</a> | <a href="javascript: d.closeAll();">关闭所有</a>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/dtree.js"></script>
	<script type="text/javascript">
		d = new dTree('d');
		d.add('01',-1,'系统菜单树');
		d.add('0101','01','一级采集管理','','','mainFrame');
		d.add('010101','0101','精选','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=jx','','mainFrame');
		d.add('010102','0101','北京','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=bj','','mainFrame');
		d.add('010103','0101','深读','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=du','','mainFrame');
		d.add('010104','0101','声音','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=sy','','mainFrame'); 
		d.add('010105','0101','京津冀','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=3j','','mainFrame'); 
		d.add('0102','01','二级采集管理','','','mainFrame');
		d.add('010201','0102','头条','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=toutiao','','mainFrame');
		d.add('010202','0102','主题图片','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=tp','','mainFrame');
		d.add('010203','0102','今日聚焦','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=jj','','mainFrame');
		d.add('010204','0102','时事','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=sjc','','mainFrame');
		d.add('010205','0102','身边','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=sbs','','mainFrame');
		d.add('010206','0102','生活','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=shq','','mainFrame');
		d.add('010207','0102','社会','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=btt','','mainFrame');
		d.add('010208','0102','出门清','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=mrq','','mainFrame');
		d.add('010209','0102','出格儿','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=cgr','','mainFrame');
		d.add('0102010','0102','话茬儿','${pageContext.request.contextPath}/news_addNews.action?page=1&classifyName=hcr','','mainFrame');
		d.add('0103','01','信息管理','','','mainFrame');
		d.add('010301','0103','全部查询','${pageContext.request.contextPath}/news_findAllByPage.action?page=1','','mainFrame');
		d.add('0104','01','统计管理','','','mainFrame');
		d.add('010401','0104','管理统计','${pageContext.request.contextPath}/jfreechart_forword.action','','mainFrame');
		d.add('010402','0104','导出','${pageContext.request.contextPath}/news_exportExel.action','','mainFrame');
		d.add('0105','01','清空数据库','','','mainFrame');
		d.add('010501','0105','清空数据库','${pageContext.request.contextPath}/news_deleteNews.action','','mainFrame');
		document.write(d);
	</script>
</div>
</td>
</tr>
</table>
</body>
</html>
