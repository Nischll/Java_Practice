package practice.entity;

public class Person {
    private  String name;
    private  int age;

//    public Person (String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Person () {
//        this.name = "empty";
//        this.age = 0;
//    }
//
//    public Person (String name){
//        this.name = name;
//        this.age = 0;
//    }

//    ENCAPSULATION
//    GETTER / SETTER
    public void setData(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
