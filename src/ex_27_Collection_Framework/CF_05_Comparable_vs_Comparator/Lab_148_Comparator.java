package ex_27_Collection_Framework.CF_05_Comparable_vs_Comparator;

import java.util.*;

public class Lab_148_Comparator {
    static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Pankh", 3000));
        list.add(new Employee(2,"Shivani", 2000));
        list.add(new Employee(3,"Bruno", 1000));

        System.out.println(list);

        Comparator<Employee> idcomp = (e1,e2) -> e1.id - e2.id;
        Comparator<Employee> salcomp = (e1,e2) -> e1.salary - e2.salary;
        Comparator<Employee> Alphacomp = (e1,e2) -> e1.name.compareTo(e2.name);

        Collections.sort(list,idcomp);
        System.out.println(list);

        Collections.sort(list,salcomp);
        System.out.println(list);

        Collections.sort(list,Alphacomp);
        System.out.println(list);


    }
}

class Employee{

    Integer id;
    String name;
    Integer salary;

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}