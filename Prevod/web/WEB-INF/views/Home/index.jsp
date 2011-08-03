<%@page import="mutabene.model.entity.Todo"%>
<%@page import="java.util.List"%>
<%@page import="mutabene.manager.TodoManager"%>
<%@include file="../../parts/header.jspf"%>
<%@page pageEncoding="UTF-8"%>
<%@page session="true"%>
    <h2>Vítejte!</h2>
    <p>
        Vítejte na stránkách MUTABENE. ...asfj oaijo avhjohoúhg sohgo dfhgphgdf hgodfh ...
    </p>
<div class="img"><img src="<spring:theme code="background"/>"/></div>
                <%
            TodoManager tm = new TodoManager();
            tm.add("2", "s","d", "u");
            List<Todo> list = tm.getTodos("2");
            if (list.size() == 0) {
                out.print("Ahoj");
            }
        %>

<%@include file="../../parts/footer.jspf"%>