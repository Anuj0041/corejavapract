package learning.oops;

public class Product {
   String name,brand;//instance variable
   double price;
   void setProduct(String n,String b,double p)//formal parameter
   {
	   name=n;
	   brand=b;
	   price=p;
	   
   }
   void getproduct()
   {
System.out.println("product Name is "+name);
System.out.println("Brand Name is "+brand);
System.out.println("Product Price is "+price);
   }
   void discount()
   {
	   double dis=0.0;
	   if (price<1000)
	   {
		   dis=price*.05;
		   System.out.println("price to pay after discount"+(price-dis));
	   }
	   else if(price>=1000 && price<5000)
	   {
		   dis=price*.10;
		   System.out.println("price to pay after ddisscount"+(price-dis));
	   }
	   else {
		   dis=price*.20;
		   System.out.println("price to pay after siscount"+(price-dis));
	   }
	   
   }
   }
