package org.ismailcet.prototypepatterns;

/**
 * Hello world!
 *
 */
public class PrototypePattern
{
    public static void main( String[] args ) {
        Employee e1 = new Employee("test-name1","test-surname1");
        System.out.println("Employee 1  : " + e1);
        Prototype e2 =e1.getClone();
        System.out.println("Employee 2 : " + e2);
    }
}
