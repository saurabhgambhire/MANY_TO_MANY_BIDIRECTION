package MANY_TO_MANY_BIDIRECTION.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Courses {
	@Id
	private int id;
	private String course_Name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Student> students;

	public int getId() {
		return id;
	}

	public String getCourse_Name() {
		return course_Name;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
