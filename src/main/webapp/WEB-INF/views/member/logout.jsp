<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>logout</title>
</head>
<body>
<h1>로그아웃</h1>
	${test }<br><br> <%-- <=이거랑 getAttribute랑 같다 --%>
<%--<%= request.getParameter("test") --%><br>
<%-- <%= request.getAttribute("test") --%>
<a href="login">로그인 페이지</a>
<a href="index">기본 페이지</a>
</body>
</html>