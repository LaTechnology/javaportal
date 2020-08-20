<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
 
<html>
<head>
    <title>Education  Details</title>
</head>
 
<body>
    <h2><spring:message code="lbl.page.education" text="EducationDetails" /></h2>
    <br/>
    <form:form method="post" modelAttribute="educationDetails">
        <table>
            <tr>
                <td><spring:message code="lbl.course" text="Course" /></td>
                <td><form:input path="course" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.institution" text="Institution" /></td>
                <td><form:input path="institution" /></td>
            </tr>
            <tr>
                <td><spring:message code="lbl.yearOfPassing" text="Year of Passing" /></td>
                <td><form:input path="yearOfPassing" /></td>
            </tr>
            
            
            
        </table>
    </form:form>
</body>
</html>