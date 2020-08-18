<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>get employee</title>
</head>
<body>
    <div align="center">
        <h1>GET  Employee</h1>
        <form:form action="getemp" method="get" modelAttribute="employee">
        <table>
            <form:hidden path="id"/>
            <tr>
                <td>ID:</td>
                <td><form:input path="Id" /></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><form:input path="Name" /></td>
            </tr>
            <tr>
                <td>Designation:</td>
                <td><form:input path="Designation" /></td>
            </tr>
           <tr>
                <td>address:</td>
                <td><form:input path="permanentadress" /></td>
            </tr>
            
            <td>
            <a href="EmployeeForm" > update</a>
            </td>
           
           
        </table>
        </form:form>
    </div>
</body>
</html>