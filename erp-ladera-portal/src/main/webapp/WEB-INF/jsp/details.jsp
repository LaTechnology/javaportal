
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<title>
details
</title>
<style>
table {
  width:100%;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
   background-color: #eee;
}
th, td {
  padding: 15px;
  text-align: left;
}

</style>
</head>
<body>
<TABLE>


<tr>
    <td><c:out value="FirstName"/></td>
    <td><c:out value="LastName"/></td>
    <td><c:out value="Gender"/></td>
    <td><c:out value="Email"/></td>
    <td><c:out value="options"/></td>
  </tr>
<c:forEach var="detail" items="${detailList}" >

  <tr>
    <td><c:out value="${detail.firstName}"/></td>
    <td><c:out value="${detail.lastName}"/></td>
    <td><c:out value="${detail.gender}"/></td>
    <td><c:out value="${detail.email}"/></td>
    <td><form action="/erp-ladera-portal/api/v1/update/${detail.id}">
  <input type="submit" value="Update">
</form> 
<form action="/api/v1/delete/${detail.id}">
 <input type="submit" value="Delete">
</form>

<form action="/erp-ladera-portal/api/v1/view/${detail.id}">
 <input type="submit" value="view">
</form>
 </td>
    
  </tr>
</c:forEach>
</TABLE>


</body>


</html>