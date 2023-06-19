# Composite Pattern

## Explanation

---

> ### The composite pattern is meant allow treating individual objects and compositions of objects ,or "composites" in the same way.
> #### It can be a viewed as tree structure made up of types that inherit a base type,and it can represent a single part or a whole hierarchy of objects.

## Programmatic Example

As a component object we`ll create a simple Department interface:
```java

public interface Department {
    
    void printDepartment();
    
}

```
We create classes for financial and sales departments:
```java

public class FinancialDepartment implements Department{
    private Integer id;
    private String name;

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName());
    }

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SalesDepartment implements Department{
    private Integer id;
    private String name;

    @Override
    public void printDepartment() {
        System.out.println(getClass().getSimpleName());
    }

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
```

As a Composite class, We create a HeaderDepartment class:

```java

public class HeadDepartment implements Department{
    private Integer id;
    private String name;
    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        childDepartments = new ArrayList<>();
    }

    public void printDepartment() {
        childDepartments.forEach(Department::printDepartment);
    }

    public void addDepartment(Department department){
        childDepartments.add(department);
    }

    public void removeDepartment(Department department){
        childDepartments.remove(department);
    }
}

```

Testing in main method
```java
public class CompositeDesignPatternDemo
{
    public static void main( String[] args ) {
        Department salesDepartment =
                new SalesDepartment(1, "Sales Department");
        Department financialDepartment =
                new FinancialDepartment(2, "Financial Department");

        HeadDepartment headDepartment =
                new HeadDepartment(3, "Head Department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printDepartment();
    }
}
```

```
SalesDepartment
FinancialDepartment
```