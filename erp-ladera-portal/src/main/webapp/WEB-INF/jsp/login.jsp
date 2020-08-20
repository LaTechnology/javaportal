<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<html>
<head>
<title>
Login Form
</title>
<style>
input[type=text],input[type=password]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: #3CBC8D;
  color: white;
}
body{

background-color:yellow;

}



 input[type=submit], input[type=reset] {
  background-color: #4CAF50;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
</head>
<body>
 <h2><spring:message code="lbl.page.login" text="Login" /></h2>
    <br/>
    <form:form method="post" modelAttribute="loginPage">
        <table align ="center">
            <tr>
                <td><spring:message code="lbl.username" text="UserName" /></td>
                <td><form:input path="username" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.password" text="Password" /></td>
                <td><form:password path="password" /></td>
            </tr>
             <tr>
             <td><input type="reset" value="Reset"/></td>
                <td><input type="submit" value="Login"/></td>
                
            </tr>
            </table>
            </form:form>
    
</body>


</html>