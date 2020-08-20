<html>
    <head>
        <title>Login Success</title>
    </head>
    <body>
    <%
    String name=request.getParameter("username");  
    out.print("welcome "+name); 
  
    %>
      
        <table>
        <tr>
        <td><a href="/api/v1/addEducationDetails">AddEducationDetails</ahref></td>
        
        
        </tr>
        <tr>
        <td><a href="/api/v1/personalDetails">AddPersonalDetails</a></td>
        
        
        </tr>
        
        
        
        </table>
        
        
        
    </body>
</html>