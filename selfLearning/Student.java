package selfLearning;

public class Student {
    public String name;
    public  int age;
    public String dep;
    public String sex;

    public   Student(String name, int age,String Dep){
        this.age=age;
        this.name=name;
        dep=Dep;
    }
        public Student(){
            dep="defalt Dep";
        }

        public void getAll(){
        System.out.println(this.age +" "+this.name+" "+dep);
        }
}
