# Prototype Pattern

## Explanation

---

> Prototype Pattern is cloning of an existing object instead of creating new one and can also be 
> customized as per the requirement

## Programmatic Example

Firstly, we crate a Prototype interface that have a getClone method
```java
public interface Prototype {
    public Prototype getClone(String name, String surname);
}
```
After that ,We create Employee object that it implemented from Prototype.We clone employee entity thanks to getClone method.
```java
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

    public Prototype getClone(String name, String surname) {
        return new Employee(name, surname);
    }
}
```
Lastly , We test in main class
```java
public class PrototypePattern
{
    public static void main( String[] args ) {
        Employee e1 = new Employee("test-name1","test-surname1");
        System.out.println("Employee 1  : " + e1);
        Prototype e2 =e1.getClone("test-name2","test-name2");
        System.out.println("Employee 2 : " + e2);
    }
}
```

The Console Output
```
Employee 1  : Employee{name='test-name1', surname='test-surname1'}
Employee 2 : Employee{name='test-name1', surname='test-surname1'}
```