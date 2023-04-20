package MANY_TO_MANY_BIDIRECTION.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student 
{
	@Id
	private int id;
	private String S_Name;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "students")
	private List<Courses> courses;
	public int getId() {
		return id;
	}
	public String getS_Name() {
		return S_Name;
	}
	public List<Courses> getCourses() {
		return courses;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setS_Name(String s_Name) {
		S_Name = s_Name;
	}
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	

}
