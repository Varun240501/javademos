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
Statement st2=null;
ResultSet rs = null;
ResultSet rs1=null;
st = connection.createStatement();
st2=connection.createStatement();
rs = st.executeQuery("select class_name from class"); 
rs1=st2.executeQuery("select * from teacher order by class_no");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color:aqua;
}</style>
</head>
<body align="down">
<h1 align=center> Teachers</h1>
<table border=2 align=center style="text-align:center">
      <thead>
          <tr>
             <th>CLASS NUMBER</th>
             <th>TEACHER NAME</th>
             <th>TEACHER ID</th>
             <th>TEACHER SPECIALIZATION</th>
          </tr>
      </thead>
      <tbody>

<%while(rs1.next()){%>
<tr>
<td><%=rs1.getString("class_no") %></td>
<td><%=rs1.getString("teacher_name") %></td>
<td><%=rs1.getString("teacher_id") %></td>
<td><%=rs1.getString("teacher_spec") %></td>
</tr>
</tbody>
<% }%>
<a  href="addTeachers.jsp" >Back</a>


</body>
</html>