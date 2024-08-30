package selfLearning;

public class Main {
    public static void main(String[] args) {
        Phone my=new Samsung();
        my.feature();
        my.call();
        Student student1=new Student("visal bn",20,"dep1");
        Student student2=new Student("visal bn",20,"dep2");
        student1.getAll();
        student2.getAll();
        Student student3=new Student();
        student3.getAll();
        Child c1=new Child();
//        c1.dep;
    }
}
