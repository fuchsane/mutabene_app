<%-- 
    Document   : detailCard
    Created on : 29.7.2011, 10:00:11
    Author     : Anysek
--%>

<%@include file="../../parts/header.jspf"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>
<%@page session="true"%>
<h2>card.name</h2>
<table>
    <tr>
        <td>card.description</td>
    </tr>
    <tr>
        <td>card.serialNumber</td>
        <td>card.price</td>
    </tr>
</table>