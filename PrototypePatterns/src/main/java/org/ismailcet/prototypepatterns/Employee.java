package org.ismailcet.prototypepatterns;

public class Employee implements Prototype {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public Prototype getClone() {
        return new Employee(name, surname);
    }
}
