<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
<html>
<head>
<style>
  table {
  font-family: "Helvetica Neue", Helvetica, sans-serif;
   width: 100%;
}
th {
  background: Red;
  color: white;
  text-align: center;
}
 td,th{
                border: 1px solid gray;
                width: 25%;
                text-align: center;
                padding: 5px 10px;
                text-style:Italic;
            }




</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome employee</title>
</head>
<body>
    <div align="center">
        <h1>Welcome  Employee</h1>
        <form:form action="getemp" method="get" modelAttribute="employee">
        <table>
            <form:hidden path="id"/>
           
            <tr>
                <td>Name:</td>
                <td><form:input path="Name" /></td>
                
            </tr>
            <tr>
                <td>Desigantion:</td>
                <td><form:input path="Designation" /></td>
                
            </tr>
             <tr>
                <td>Address:</td>
                <td><form:input path="permanentadress" /></td>
                
            </tr>
             <tr>
                <td>Edit:</td>
               <td><a href="getemp?Id=${employee.id}">Edit</a>
                
            </tr>
           
        </table>
        </form:form>
    </div>
</body>
</html>