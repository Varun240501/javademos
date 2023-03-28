package com.studentweb.utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.studentweb.model.Student;
public class StudentDataUtil {
	List<Student> students=new ArrayList<>();
	Connection con=null;
	Statement s=null;
	ResultSet rs=null;
	public StudentDataUtil(Connection con) {
		this.con=con;
	}
	
	public List<Student> getStudents(){
		try {
			s=con.createStatement();
			ResultSet resultset=s.executeQuery("select * from student order by id");
			int id=resultset.getInt("id");
			String fname=resultset.getString("first_name");
			String lname=resultset.getString("last_name");
			String email=resultset.getString("email");
			Student stu=new Student(id,fname,lname,email);
			students.add(stu);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,s,rs);
		}
		return students;
	}
	private void close(Connection con2, Statement s2, ResultSet rs2) {
		// TODO Auto-generated method stub
		try {
		if(rs!=null) {
			rs.close();
		}
		if(s!=null) {
			s.close();
		}
		if(con!=null) {
			con.close();
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}

}
	
}