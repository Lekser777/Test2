<%@ page import="javax.persistence.EntityManager" %>
<%@ page import="javax.persistence.Persistence" %>
<%@ page import="Controller.BuyController" %>
<%@ page import="Model.PurchaseEntity" %>
<%@ page import="View.View" %>
<%@ page import="javax.persistence.PersistenceContext" %><%--
  Created by IntelliJ IDEA.
  User: Глеб
  Date: 17.01.2018
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Hi,there. The item with id=</h1>



  <h1>is </h1>
  <h2>
    <%=request.getAttribute("products")%>>
  </h2>

  </body>
</html>
