<%--
  Created by IntelliJ IDEA.
  User: dalius
  Date: 2017.03.09
  Time: 21:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>AdvertResults</title>
</head>
<body>

<c:choose>
    <c:when test="${not empty adverts}">
        netuscias

    </c:when>
    <c:otherwise>
        na jis yra tuscias
    </c:otherwise>

</c:choose>
</body>
</html>
