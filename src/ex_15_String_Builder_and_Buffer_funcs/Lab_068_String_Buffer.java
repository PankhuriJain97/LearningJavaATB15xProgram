package ex_15_String_Builder_and_Buffer_funcs;

public class Lab_068_String_Buffer {
    static void main(String[] args) {

        StringBuffer name = new StringBuffer("Pankhuri");

        System.out.println(name);
        System.out.println(name.append(" Jain"));
        System.out.println(name);

        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        System.out.println(sb);
    }
}
