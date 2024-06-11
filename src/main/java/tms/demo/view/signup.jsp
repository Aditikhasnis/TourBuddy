<!-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Sign Up</title>
</head>
<body>
    <h2>Sign Up</h2>
    <form:form method="POST" action="${pageContext.request.contextPath}/signup" modelAttribute="customer">
        <div>
            <form:label path="username">Username</form:label>
            <form:input path="username" />
        </div>
        <div>
            <form:label path="password">Password</form:label>
            <form:password path="password" />
        </div>
        <div>
            <form:label path="name">Name</form:label>
            <form:input path="name" />
        </div>
        <div>
            <form:label path="gender">Gender</form:label>
            <form:input path="gender" />
        </div>
        <div>
            <form:label path="country">Country</form:label>
            <form:input path="country" />
        </div>
        <div>
            <form:label path="phone">Phone</form:label>
            <form:input path="phone" />
        </div>
        <div>
            <button type="submit">Sign Up</button>
        </div>
    </form:form>
    <c:if test="${not empty success}">
        <div class="alert alert-success">${success}</div>
    </c:if>
    <c:if test="${not empty error}">
        <div class="alert alert-danger">${error}</div>
    </c:if>
</body>
</html> -->
