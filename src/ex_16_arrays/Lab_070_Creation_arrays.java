package ex_16_arrays;

public class Lab_070_Creation_arrays {

    static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int arrn[] = {10,20,30}; //allowed

        boolean[] values = {true,false,true,true};
        String[] names = {"Pankhuri", "Pankh", "PJ", "Jain"};

        int[] arr2 = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        //arr[6] = 7;//not allowed --> exception

    }
}
