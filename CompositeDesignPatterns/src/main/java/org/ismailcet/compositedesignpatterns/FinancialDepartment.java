package org.ismailcet.compositedesignpatterns;

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
