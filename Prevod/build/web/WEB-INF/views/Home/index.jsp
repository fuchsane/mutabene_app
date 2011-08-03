
<%@include file="../../parts/header.jspf"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <h2>Vítejte!</h2>
    <p>
        Vítejte na stránkách MUTABENE. ...asfj oaijo avhjohoúhg sohgo dfhgphgdf hgodfh ...
    </p>
<div class="img"><img src="<spring:theme code="background"/>"/></div>

<c:forEach items="${todos}" var="todo">
    <c:out value="${todo['author']}"/>
</c:forEach>

<%@include file="../../parts/footer.jspf"%>