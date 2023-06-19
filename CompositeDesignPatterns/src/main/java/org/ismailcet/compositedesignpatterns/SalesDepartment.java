package org.ismailcet.compositedesignpatterns;

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
