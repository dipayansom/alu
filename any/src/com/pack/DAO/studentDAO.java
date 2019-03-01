package com.pack.DAO;

import java.util.List;

import com.pack.Model.StudentModel;

public interface studentDAO {
public int insertStudent(StudentModel object);
public List<StudentModel> listAllStudent();
public StudentModel fetchStudentById(String id);
public int removeStudentById(String id);
}
