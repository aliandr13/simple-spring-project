<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Home Page</h1>
<h3>Controllers:</h3>
<a href="${pageContext.request.contextPath}/welcome">Welcome</a><br/>
<a href="${pageContext.request.contextPath}/employees">Employee</a><br/>
<a href="${pageContext.request.contextPath}/employees/add">Add new Employee</a><br/>
<h3>REST API:</h3>
<a href="${pageContext.request.contextPath}/api/employees">Employees</a>
</body>
</html>
