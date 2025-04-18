package learning.inputoutput;
import java.io.*;

public class StudentManagement {
	
	public void writeStudentData()throws IOException
	{
		Student s=new Student();
		s.setCollege("BBD");
		s.setCourse("b.tech");
		s.setName("Anuj");
		s.setWeight(50);
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\input_Output\\Student.txt"));
		oos.writeObject(s);//Serialization
		oos.close();
		System.out.println("object serialized");
		
		
	}
	public void readStudentData() {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("c:\\input_output\\student.txt"));
			Student s= (Student)ois.readObject();//deSerialization //downcasting
		System.out.println("Student name is "+s.getName());
		System.out.println("Student college Name is "+s.getCollege());
		System.out.println("Student course is "+s.getCourse());
		System.out.println("Student weight is "+s.getWeight());
		
		}
		catch(IOException|ClassNotFoundException ci)
		{
			ci.printStackTrace();
		}
		finally {
			if(ois!=null)
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
public static void main(String[] args) {
	StudentManagement mgmt=new StudentManagement();
	try {
		mgmt.writeStudentData();
		mgmt.readStudentData();
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}
}
	
	
	
	
}
