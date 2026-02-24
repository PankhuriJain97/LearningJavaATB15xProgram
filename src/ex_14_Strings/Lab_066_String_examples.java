package ex_14_Strings;

public class Lab_066_String_examples {
    static void main(String[] args) {
        String s = "Java".substring(2); // removes first 2 letters (index -1)
        System.out.println(s);

         "unhappy".substring(2); //returns "happy" "
         "Harbison".substring(3); //returns "bison"
         "emptiness".substring(9) ;//returns "" (an empty string)


        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']

        boolean b = "   ".isBlank();
        boolean b1 = "".isEmpty();
        System.out.println(b);

        String s2 = "ab".repeat(3);
        String s3 = "Pankh".repeat(3);
        System.out.println(s3);

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

        System.out.println("=".repeat(10));
        System.out.println("Here we go!!");
        System.out.println("=".repeat(10));

    }

}

