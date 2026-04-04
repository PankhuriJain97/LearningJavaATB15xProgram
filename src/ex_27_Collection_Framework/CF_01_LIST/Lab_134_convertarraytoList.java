package ex_27_Collection_Framework.CF_01_LIST;

import java.util.Arrays;
import java.util.List;

public class Lab_134_convertarraytoList {

    static void main(String[] args) {

        String[] arr = {"java", "python", "c#"};
        List<String> myList = Arrays.asList(arr);

        System.out.println(myList);


    }
}
