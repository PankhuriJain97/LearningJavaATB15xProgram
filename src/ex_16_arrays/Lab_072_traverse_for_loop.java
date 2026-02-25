package ex_16_arrays;

public class Lab_072_traverse_for_loop {

    static void main(String[] args) {
        int[] arr = {10,20,30,40};

        int arrn[] = {10,20,30}; //allowed

        boolean[] values = {true,false,true,true};
        String[] names = {"Pankhuri", "Pankh", "PJ", "Jain"};

        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        for(int i =0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
