<%-- 
    Document   : listCards
    Created on : 29.7.2011, 9:59:59
    Author     : Anysek
--%>

<%@include file="../../parts/header.jspf"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page pageEncoding="UTF-8"%>
<%@page session="true"%>
<h2>Seznam nabízených karet</h2>
<table>
    <tr>
        <td>
            <c:forEach items="${listCards}" var="listItem">
                <a href="<c:url value=""/>"></a>
                <a href="
                   <%out.print(response.encodeURL(request.getContextPath())+"/detailCard?card=");%>
                   ">${listItem['value']}</a>              
            </c:forEach>>
        </td>
    </tr>
</table>