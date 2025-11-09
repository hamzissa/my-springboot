<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Car List</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>

<div class="container">
    <h1 class="page-title"> My Cars</h1>

    <c:forEach items="${cars}" var="car">
        <div class="car-card">
            <h3>${car.brand} ${car.model}</h3>
            <p><strong>Year:</strong> ${car.year}</p>
            <p><strong>Engine:</strong> ${car.engine}</p>
            <p><strong>Stage:</strong> ${car.modifications.stage}</p>
            <p><strong>Turbo:</strong> ${car.modifications.turbo}</p>
            <p><strong>Nitro:</strong> ${car.modifications.nitro}</p>
            <p><strong>Id:</strong> ${car.id}</p>
            <a href="<c:url value='/editcar?id=${car.id}'/>">Edit</a>
        </div>
    </c:forEach>
</div>


<br/>
<br/>
<br/>
<br/>


<form:form action = "/addcar"  modelAttribute="car">
    <form:label path="brand">Enter name of brand:</form:label>
    <form:select path="brand" items="${brandlist}"/>
    <form:errors path="brand"/><br/>
    <br/>

    <form:label path="model">enter model:</form:label>
    <form:input path="model"/>
    <form:errors path="model"/><br/>

    <form:label path="engine">enter engine:</form:label>
    <form:input path="engine" />
    <form:errors path="engine"/><br/>

    <form:label path="year">enter year:</form:label>
    <form:input path="year" />
    <form:errors path="year"/><br/>
    <br/>


    <input type="submit"/>
</form:form>


</body>
</html>
