<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
    <title>Update Form</title>
    <style>
/* body { */
/* background-image: url("C:/Users/User/Desktop/shoppersimage/Elec_788x120_ShopperBanner_EN_01.jpg");} */

/* div{ */
background-color:grey
}
table{
background-color:white;
}
body{

background-color:grey;

}
input[type=text],input[type=password],select{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  box-sizing: border-box;
  border: none;
  background-color: #f2f2f2;
  color: black;
}

 input[type=submit], input[type=reset] {
  background-color: #e7e7e7;
  border: none;
  color: black;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}
</style>
    
</head>
 
<body>
    <h2><spring:message code="lbl.page.update" text="Update " /></h2>
    <br/>
    <div>
    <form:form method="post" modelAttribute="registerPage">
        <table>
        
            <tr>
                <td><spring:message code="lbl.firstName" text="First Name" /></td>
                <td><form:input path="firstName" value="${firstName}"/></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.lastName" text="Last Name" /></td>
                <td><form:input path="lastName" value="${lastName}" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.email" text="Email Id" /></td>
                <td><form:input path="email" value="${email}" /></td>
            </tr>
            
            
            <tr>
				<td><form:label path="password">Password</form:label></td>
				<td><form:password path="password" name="password"
						id="password" value="${password}"/></td>
			</tr>
            <tr>
                <td><spring:message code="lbl.gender" text="Gender" /></td>
                <td><form:select path="gender" items="${gender}" value="${gender}"/></td>
            </tr>
            <tr>
            <td><spring:message code="lbl.address" text="Address" /></td>
            </tr>
            <tr>
                <td><spring:message code="addressVo.line1" text="Line1" /></td>
                <td><form:input path="addressVo.line1" value="${line1}" /></td>
            </tr>
            <tr>
                <td><spring:message code="addressVo.line2" text="Line2" /></td>
                <td><form:input path="addressVo.line2" /></td>
            </tr>
            <tr>
                <td><spring:message code="addressVo.city" text="City" /></td>
                <td><form:input path="addressVo.city" value="${addressVo.city}" /></td>
            </tr>
            <tr>
                <td><spring:message code="addressVo.state" text="State" /></td>
                <td><form:input path="addressVo.state" value="${addressVo.state}" /></td>
            </tr>
             <tr>
                <td><spring:message code="addressVo.country" text="Country" /></td>
                <td><form:input path="addressVo.country" value="${addressVo.country}"/></td>
            </tr>
             <tr>
                <td><spring:message code="addressVo.pincode" text="Pincode" /></td>
                <td><form:input path="addressVo.pincode" value="${addressVo.pincode}"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Update"/></td>
            </tr>
            
        </table>
    </form:form>
    </div>
  
</body>
</html>