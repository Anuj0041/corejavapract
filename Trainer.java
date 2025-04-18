package learning.inheritance;

abstract class Trainer {
String name;
String qualification;
void setTrainer(String name,String qualification) {
this.name=name;
this.qualification=qualification;
}
 void getTrainer()
{
	System.out.println("Trainer name is:" + name);
	System.out.println("qualification:" + qualification);
}
 
abstract void teach(String courseName);
 }
//subclass
class JavaTrainer extends Trainer {
	void teach (String courseName) 
	{
		System.out.println("teachig java " + courseName);
	}
	}
class PythonTrainer extends Trainer {
	void teach(String courseName) {
		System.out.println("teaching python " +courseName);
	}
}








