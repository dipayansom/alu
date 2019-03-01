package com.pack.Service;

import java.util.List;

import com.pack.Model.StudentModel;

public interface StudentService {
	public  int insertStudent(StudentModel obj) ;
	public List<StudentModel> listAllStudent();
	public StudentModel fetchStudentById(String id);
	public int removeStudentById(String id);
}
