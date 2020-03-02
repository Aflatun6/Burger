package person;

public class Student extends Person {
    String group;
    Student(String name,int age,String group){
        super(name,age);
        this.group=group;
    }
    public void study(){
        System.out.println("Studin'");
    }
}
