package learning.inheritance;


abstract class Worker {
 String name;
 int age;

 
 public Worker(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Abstract method to calculate salary
 public abstract double calculateSalary();

 
 public void printDetails() {
     System.out.println("Worker Name: " + name);
     System.out.println("Worker Age: " + age);
 }
}


class DailyWageWorker extends Worker {
 int noOfWorkingDays;
 String constructionSiteName;


 public DailyWageWorker(String name, int age, int noOfWorkingDays, String constructionSiteName) {
     super(name, age);
     this.noOfWorkingDays = noOfWorkingDays;
     this.constructionSiteName = constructionSiteName;
 }

 
 public final double calculateSalary() {
     return noOfWorkingDays * 300; 
 }

 
 public void printDetails() {
     super.printDetails();
     System.out.println("Construction Site: " + constructionSiteName);
     System.out.println("No. of Working Days: " + noOfWorkingDays);
     System.out.println("Total Salary: " + calculateSalary());
 }
}

