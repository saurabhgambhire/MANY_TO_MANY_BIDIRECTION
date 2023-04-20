package MANY_TO_MANY_BIDIRECTION.CONTROLLER;

import java.util.ArrayList;
import java.util.List;

import MANY_TO_MANY_BIDIRECTION.DAO.Dao;
import MANY_TO_MANY_BIDIRECTION.DTO.*;

public class Driver 
{
	public static void main(String[] args) {
		Student student = new Student();
		Student student2 = new Student();
		 Courses courses = new Courses();
		 Courses courses2 = new Courses() ;
		 
		 List<Courses> list = new ArrayList<Courses>();
		 list.add(courses);
		 list.add(courses2);
		 
		 student.setId(1);
		 student.setS_Name("saurabh");
		 student.setCourses(list);
		 
		 student2.setId(2);
		 student2.setS_Name("Sumeet");
		 student2.setCourses(list);
		 
		 List<Student> list2 = new ArrayList<Student>();
		 list2.add(student);
		 list2.add(student2);
		 
		 
		 courses.setId(1);
		 courses.setCourse_Name("java");
		 courses.setStudents(list2);
		 
		 courses2.setId(2);
		 courses2.setCourse_Name("sql");
		 courses2.setStudents(list2);
		 
		 
//		 ----------------- DAO ------------------------------
		 
		 Dao dao = new Dao();
		 dao.saveStudent(student);
//		 dao.saveStudent(student2);
		 
		 
		 
		 
		 
	}

}
