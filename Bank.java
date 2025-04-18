package learning.oops;

public class Bank {
	
	    // Instance variables
	     String name;
	    String acno;
	    String type;
	    double balance;

	    
	     void setDetails(String name, String acno, String type, double balance) {
	        this.name = name;
	        this.acno = acno;
	        this.type = type;
	        this.balance = balance;
	    }

	     void deposit(int amount) {
	    	 
	        balance=balance+amount;
	          System.out.println("amount deposit:"+amount);
	          System.out.println("updated balance:"+balance);
	     }
	     void withdraw(int amount) {
	    	 if (amount>balance)
	    		 System.out.println("canot withwithdraw");
	    	 
	     
	     
	     else {
	    	 balance=balance-amount;
	    	   System.out.println("amount withdraw:"+amount);
		          System.out.println("updated balance:"+balance);
	    	 
	     }
	    	 
	    	
	    	
	    }
	public static void main(String[] args) {
		Bank b=new Bank();
		
		
		b.setDetails("Anuj", "7376217814","saving",5000);
		
		b.deposit(1000);
		
		b.withdraw(10000);
	}     
	     
}


	          
