package person;

public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("Eatin'");
    }
}
