package practice;

import practice.entity.Person;

public class Inheritance extends Person {
    @Override
    public void introduce () {
        super.setData("OverRide", 1000);

        System.out.println("Just... " + getName() + ", " + getAge());
    }

    public void child () {
        super.setData("super", 55);
        super.introduce();
        System.out.println("Inheritance from child test.");
    };

}
