<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<style>     
.blue-button{
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);
	padding:3px 5px;
	color:#fff;
	font-family:'Helvetica Neue',sans-serif;
	font-size:12px;
	border-radius:2px;
	-moz-border-radius:2px;
	-webkit-border-radius:4px;
	border:1px solid #1A87B9
}  
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
                width: 25%;
                text-align: left;
                padding: 5px 10px;
                text-style:Italic;
            }
</style>   
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New/Edit Contact</title>
</head>
<body>
<div class=container>
    <div align="center">
        <h1>Login Employee</h1>
        <form:form method="post" modelAttribute="employee" action="check">
<table>
		<tr>
			<th colspan="2">Login Employee</th>
		</tr>
		<tr>
	
          <td><form:label path="Name"> Name:</form:label></td>
          <td><form:input path="Name" size="30" maxlength="30"></form:input></td>
        </tr>
		
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
        </div>
    </div>
</body>
</html>