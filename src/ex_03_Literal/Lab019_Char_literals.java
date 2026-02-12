package ex_03_Literal;

public class Lab019_Char_literals {

    static void main(String[] args) {
         char a = '@';
         char a1 = '(';
         char a2 = ' '; //blank space;

        // escape sequence

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("print this in one line" + new_line + "this in next line");

        char a3 = 'A'; //ASCII --> 65

        char uni_char = '\u1f60'; //unicode char

        System.out.println(uni_char);
    }
}
