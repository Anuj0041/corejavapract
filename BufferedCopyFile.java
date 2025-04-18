package learning.inputoutput;
import java.io.*;
public class BufferedCopyFile {
public static void main(String[] args) {
	BufferedReader br=null;
	BufferedWriter bw=null;
	String data="";
	try {
		br=new BufferedReader(new FileReader("c:\\input_output\\test.txt"));
		bw=new BufferedWriter(new FileWriter("c:\\input_output\\testbuffer.txt"));
		while((data=br.readLine())!=null) {
			bw.write(data);
			bw.newLine();
			
		}
		System.out.println("file copied");
		br.close();//not standard way use finally to close
		bw.close();
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}
}
}
