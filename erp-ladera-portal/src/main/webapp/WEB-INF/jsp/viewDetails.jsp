<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html><head>
<title>view</title>

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
<table>
<tr>
    <td><c:out value="FirstName"/></td>
    <td><c:out value="LastName"/></td>
    <td><c:out value="Gender"/></td>
    <td><c:out value="Email"/></td>
    <td><c:out value="address"/></td>
  </tr>
 <tr>
    <td><c:out value="${registerPage.firstName}"/></td>
    <td><c:out value="${registerPage.lastName}"/></td>
    <td><c:out value="${registerPage.gender}"/></td>
    <td><c:out value="${registerPage.email}"/></td>
        <td>
        <c:out value="${registerPage.addressVo.line1},"/><br>
         <c:out value="${registerPage.addressVo.line2},"/><br>
          <c:out value="${registerPage.addressVo.city},"/><br>
          <c:out value="${registerPage.addressVo.state},"/><br>
           <c:out value="${registerPage.addressVo.country},"/><br>
            <c:out value="${registerPage.addressVo.pincode}"/>
         </td>
    
    </tr>

</table>


</body>

</html>