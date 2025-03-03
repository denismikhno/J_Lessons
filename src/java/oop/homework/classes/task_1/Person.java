package oop.homework.classes.task_1;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        this("Аноним", 0);
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move(){
        System.out.println("Я двигаюсь!");
    }

    public void talk() {
        System.out.println("Такой-то Person говорит!");
    }

    @Override
    public String toString() {
        return "Person" + " " +
                fullName + " " +
                age;
    }
}
