package ex_16_arrays;

public class Lab_074_2D_Arrays {

    static void main(String[] args) {

        int [][] newarr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] arr = new int[3][2];

        for (int i = 0; i< arr.length; i++)
        {
            for (int y = 0; y< arr[i].length; y++)
            {
                arr[i][y] = y;
                System.out.print(arr[i][y] + " ");
            }

            System.out.println(" ");

        }


    }
}
