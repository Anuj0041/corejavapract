package learning.inheritance;

public class TrainerDemo {
    public static void main(String[] args) {
 
        Trainer javaTrainer = new JavaTrainer();
        javaTrainer.setTrainer("Anuj", "b.tech");
        javaTrainer.getTrainer();
        javaTrainer.teach("Java Programming");


        Trainer pythonTrainer = new PythonTrainer();
        pythonTrainer.setTrainer("Anuj", "m.tech");
        pythonTrainer.getTrainer();
        pythonTrainer.teach("Python Programming");
    }
    }
