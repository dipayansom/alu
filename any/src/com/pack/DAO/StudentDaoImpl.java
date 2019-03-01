package com.pack.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.pack.DBUtility;
import com.pack.Model.StudentModel;

public class StudentDaoImpl implements studentDAO {

	public int insertStudent(StudentModel obj) {
		Connection con=null;
		PreparedStatement ps=null;
		int i=0;
		try{
			/*con=DBUtility.getConnection();*/
			con=DBUtility.getDatasource().getConnection();
			con.setAutoCommit(false);
			ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setString(1, obj.getId());
			ps.setString(2,obj.getName());
			ps.setString(3, obj.getGender());
			ps.setString(4, obj.getCourse());
			ps.setString(5, obj.getAddress());

			i=ps.executeUpdate();
			con.commit();
		}catch(Exception e){
			System.out.println(e);
		}
		finally {

			try{
				if(con!=null)
				{
					con.close();
					ps.close();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		return i;
	}

	@Override
	public List<StudentModel> listAllStudent() {
		Connection con=null;
		PreparedStatement ps=null;
		List<StudentModel> l=null;
		int i=0;
		try{
			/*con=DBUtility.getConnection();*/
			con=DBUtility.getDatasource().getConnection();
			con.setAutoCommit(false);
			ps=con.prepareStatement("select stuId,sname,gender,course,address from student");
			ResultSet rs=ps.executeQuery();
			l=new ArrayList<>();
			while(rs.next())
			{
				StudentModel s=new StudentModel();
				s.setId(rs.getString("stuid"));
				s.setName(rs.getString("sname"));
				s.setGender(rs.getString("gender"));
				s.setCourse(rs.getString("course"));
				s.setAddress(rs.getString("address"));
				l.add(s);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		finally {

			try{
				if(con!=null)
				{
					con.close();
					ps.close();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		return l;
	}

	@Override
	public StudentModel fetchStudentById(String id) {
		Connection con=null;
		PreparedStatement ps=null;
		StudentModel s=null;
		try{
			/*con=DBUtility.getConnection();*/
			con=DBUtility.getDatasource().getConnection();
			con.setAutoCommit(false);
			ps=con.prepareStatement("select stuId,sname,gender,course,address from student where stuid=?");
			ps.setString(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				s=new StudentModel();
				s.setId(rs.getString("stuid"));
				s.setName(rs.getString("sname"));
				s.setGender(rs.getString("gender"));
				s.setCourse(rs.getString("course"));
				s.setAddress(rs.getString("address"));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {

			try{
				if(con!=null)
				{
					con.close();
					ps.close();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		return s;
		}

	@Override
	public int removeStudentById(String id) {
		Connection con=null;
		PreparedStatement ps=null;
		int s=0;
		try{
			/*con=DBUtility.getConnection();*/
			con=DBUtility.getDatasource().getConnection();
			con.setAutoCommit(false);
			ps=con.prepareStatement("delete from student where stuid=?");
			ps.setString(1,id);
			s=ps.executeUpdate();
			con.commit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {

			try{
				if(con!=null)
				{
					con.close();
					ps.close();
				}
			}catch(Exception e){
				System.out.println(e);
			}
		}
		return s;
	}

}
