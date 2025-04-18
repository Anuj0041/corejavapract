package learning.inputoutput;
import java.io.Serializable;
public class Student implements Serializable
    
    {
	

	private static final long serialVersionUID = 1L;
	private String name,college,course;
	private transient float weight;//its value will not saved into a file
	

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
