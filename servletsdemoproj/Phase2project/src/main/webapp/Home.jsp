<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
Class.forName("com.mysql.jdbc.Driver");
Connection connection = 
DriverManager.getConnection("jdbc:mysql://localhost/learneracademy","root","root");
Statement st = null;
ResultSet rs = null;
st = connection.createStatement();
rs = st.executeQuery("select class_name from class"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type=text/css>   
body{
background-color:aqua;
}
.navbar { 
display: flex;  
align-items: center;   
background-color:blue;  
padding:10px;   
  
}  
.navbar * {  
display: inline;  
}  
.navbar li {  
margin: 50px;  
}  
.navbar li a {  
color: HoneyDew;  
text-decoration: none;  
}   
select{
        width: 120px;
        height: 30px;
        border: 1px solid #999;
        font-size: 18px;
        font-family:cursive;
        
        border-radius: 5px;
        box-shadow: 4px 4px #ccc;
      }
      input{
      width: 120px;
        height: 30px;
        border: 1px solid #999;
        font-size: 18px;
        color: #1c87c9;
        background-color: #eee;
        color: #1c87c9;
        background-color: #eee;
        border-radius: 5px;
      }
</style>
</head>
<header>
<nav class="navbar">
<ul>
<li>
  <a class="active" href="index.html">Home</a>
 </li>
 <li>
  <a href="teacher.jsp">Teacher Mapping</a>
 </li>
 <li>
  <a href="subject.jsp">Subject Mapping</a>
  </li>
  <li>
  <a href="admin.jsp ">Admin functions</a>
  </li>
  <li>
  <a href="report.jsp">Class Report</a>
  </li>
</ul>

</nav>
</header>
<body  align="center" style="font-family:serif;">
<h1 style="font-family:serif;">Student Class Mapping</h1>
<form action="controller" method="post">
<p>Select Class</p>
<br>
<select name="class">
<%while(rs.next()){ %>
<option value="<%=rs.getString("class_name")%>"><%=rs.getString("class_name")%></option>
                        <%}%>           
                         </select> 
        
</select><br>
<br>
<br>
<input type="submit" value="SUBMIT" style="padding: 5px"/>
</form>

</body>
</html>
