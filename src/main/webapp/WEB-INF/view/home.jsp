<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Ruzal
  Date: 7/14/2017
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form modelAttribute="user" method="post" action="/insert">
    <form:input path="name"/>
    <form:input path="address"/>
    <input type="submit" value="submit">
</form:form>
</body>
</html>
