package learning.inputoutput;
import java.io.*;
public class StudentDetail_File {
	public static void main(String[] args) {
		BufferedReader br=null;
		BufferedWriter bw=null;
		try {
			br=new BufferedReader(new InputStreamReader(System.in));
			bw=new BufferedWriter(new FileWriter("c:\\input_output\\student_details.txt",true));
			for(int i=1; i <3; i++) {
			System.out.println("Enter your name");
			String name=br.readLine();
			System.out.println("Enter your course");
			String course=br.readLine();
			System.out.println("Enter your Roll Number");
			String rollNumber=br.readLine();	
			//file writing code
			bw.write(name+"\t");
			bw.write(course+"\t");
			bw.write(rollNumber);
			bw.newLine();
			} //for loop
			System.out.println("data added in the file");
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
			
		}
		finally {
			try {
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
			}
			catch(IOException ie) 
			{
				ie.printStackTrace();
			}
		}
	}

}
