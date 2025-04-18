package learning.exception;

public class ExceptionDemo {
	public static void main(String[] args)
	{
		//int x=9/0;
		//System.out.println(x);
		int[]arr=new int[4];
		//arr[10]=20;
		String name=null;
		try {
				System.out.println(name.length());
		}
		catch(NullPointerException np)//throw new nullPointerException thrown by JRE
		{
			np.printStackTrace();
		}
		finally {
			System.out.println("Always Execute");
		}
	}

    }
