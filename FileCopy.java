package learning.inputoutput;
import java.io.*;
public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis=null;//reference variable of FileInputStream
		FileOutputStream fos=null;
		try {
		fis=new FileInputStream("c:\\input_output\\test.txt");
		fos=new FileOutputStream("c:\\input_output\\copy_test.txt");
		int data=0;
		while((data=fis.read())!=-1)//reading data till EOF reaches
		{
			fos.write(data);//writing the same data into another file
		}
		System.out.println("File copied");
	    }
catch(FileNotFoundException fe)
		{
	fe.printStackTrace();
		}
		catch(IOException ie)
		     {
			ie.printStackTrace();
		     }
		finally{
			try {
				if(fos!=null)
			fos.close();
				if(fos!=null)
			fis.close();
			
		    }
			catch(IOException ie)
			{
				ie.printStackTrace();
			}
			
		    }
	        }
	        }
//buffered reader(Reader r) //constructor
//file reader fr=new FileReader("c:\\input.output\\tesd.txt");
//BufferedReader br=new Bufferedzreader(fr);






