package ex_27_Collection_Framework.CF_05_Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.*;

public class Lab_147_Comparable {
    static void main(String[] args) {
        Employee1 e1 = new Employee1(3,"Pankh", 3000);
        Employee1 e2 = new Employee1(1,"Abc", 2000);
        Employee1 e3 = new Employee1(2,"xyz", 5000);

        List<Employee1> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);

        System.out.println(list);

        System.out.println( e1.compareTo(e2));

        //based on id
        Collections.sort(list);
        System.out.println(list);

        //based on name
        Collections.sort(list);
        System.out.println(list);

        //one issue with comparable is only one we can use either id or name or salary.
    }
}

class Employee1 implements Comparable<Employee1>
{
    private Integer id;
    private String name;
    private Integer salary;

    public Employee1(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public String printDetails()
    {
        return id + "-" + name + "-" + salary;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee1 o) {
        //return this.id - o.id;

        return this.name.compareTo(o.name);
    }


}
