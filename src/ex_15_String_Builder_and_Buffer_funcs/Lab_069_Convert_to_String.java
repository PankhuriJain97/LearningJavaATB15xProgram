package ex_15_String_Builder_and_Buffer_funcs;

public class Lab_069_Convert_to_String {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        String str = sb.toString();
        System.out.println(str); // Output: Hello

        StringBuilder sb2 = new StringBuilder("Hello");
        String str2 = sb.toString();
        System.out.println(str2); // Output: Hello
    }
}
