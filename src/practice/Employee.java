package practice;

import practice.entity.Person;

public class Employee extends Person {
    private String company;
    @Override
    public void introduce () {
        super.setData("Nischal Shrestha", 22);
        this.company = "CORD";
        System.out.println("Hi, my name is " + getName() + ", I am " + getAge() + ", and I work at " + company);
    }
}
