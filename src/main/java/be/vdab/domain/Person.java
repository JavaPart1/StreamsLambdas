package be.vdab.domain;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public static void print(Person person){
        System.out.println(person.toString());
    }
    public String getName() {
        return name;
    }
}
