package learning.oops;

public class BookFair {

	String bookname,authorname;
	float price;
	void setBookDetails(String nm,String au,float pr)
	{
		this.bookname=nm;
		this.authorname = au;
		this.price=pr;
	}
void display() 
{
	System.out.println("book name is "+bookname);
	
	System.out.println("author name is "+authorname);
	
	System.out.println("book price is "+price);}
             void calculateDiscount(){
            	float dis=0;
            	if (price<=1000)
            	{
            		dis=price*0.02f;//2%
            		System.out.println("price to pay after discount"+(price-dis));
            		
            	}
            	else if(price>1000 && price<3000){//10%
            		dis=price*0.10f;
            		System.out.println("price to pay after discount"+(price-dis));
           
            	}
           else if (price==3000) {
            		dis=price*.10f;//10%
            		
            		System.out.println("price to pay after discount"+(price-dis));
            	}
           
        	   
        	   dis= price*0.15f;//15%
        	   System.out.println("price to pay after discount"+(price-dis));
        	   }
           
         public static void main(String[] args) {
		BookFair bf=new BookFair();
		
		
		bf.setBookDetails("Java","james", 400);
		
		bf.display();
		
		
		
		}
	}


	

