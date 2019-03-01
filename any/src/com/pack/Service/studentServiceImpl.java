package com.pack.Service;

import java.util.List;

import com.pack.DAO.StudentDaoImpl;
import com.pack.Model.StudentModel;

public class studentServiceImpl implements StudentService {
	

	public int insertStudent(StudentModel obj) {
		// TODO Auto-generated method stub
		StudentDaoImpl s=new StudentDaoImpl();		
		int i=s.insertStudent(obj);
		return i;
	}

	@Override
	public List<StudentModel> listAllStudent() {
		// TODO Auto-generated method stub
		StudentDaoImpl st=new StudentDaoImpl();
		List<StudentModel> l=st.listAllStudent(); 
		return l;
	}

	@Override
	public StudentModel fetchStudentById(String id) {
		StudentDaoImpl s=new StudentDaoImpl();
		StudentModel st=s.fetchStudentById(id);
		return st;
	}

	@Override
	public int removeStudentById(String id) {
		StudentDaoImpl st=new StudentDaoImpl();
		int s=st.removeStudentById(id);
		return s;
		
	}

}
