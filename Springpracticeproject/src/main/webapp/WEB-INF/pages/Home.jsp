<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<style>           

table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 100%;
}
th {
  background: SteelBlue;
  color: white;
}
 td,th{
                border: 1px solid gray;
                width: 20%;
                text-align: center;
                padding: 5px 10px;
            }
</style>
<meta charset="ISO-8859-1">
<title>EMPLOYEE PORTAL</title>
</head>
<body>
<div align="center" >
<table border="5">
<h1>EMPLOYEES LIS</h1>
<tr>
      
      <th>Employeeid</th>
      
      <th>NAME</th>
       <th>DESIGNATION</th>
       <th>ADDRESS</th>
       <th>ACTION</th>
</tr>
       
       
      <c:forEach  var="employee"  items="${users }" >
      <tr>
         
                
                <tr> 
                <td><c:out value="${employee.employeeId}"></c:out>
                </td>
          <td>   <c:out value="${employee.name}"></c:out> 
               </td>
            <td>  <c:out value="${employee.designation}"></c:out></td>
            
           <td>   <c:out value="${employee.permanentadress}"></c:out></td>
              <td><a href="getemp?Id=${employee.id}">Edit</a>
             
    
      </c:forEach>
      



</table>

</div>
</body>
</html>