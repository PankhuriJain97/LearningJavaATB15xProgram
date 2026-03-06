package Programs_Interview;

public class P17_Second_highest_num_array {
    static void main(String[] args) {

        int[] arr = {-1000,20,300,500, 50, 1, 0, 400};

        int highest = 0;
        int second = 0;
        int poshigh = 0;
        int possec = 0;

        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i]> highest)
            {
                highest = arr[i];
                poshigh = i;
            }
        }

        for (int i = 0; i<arr.length; i++)
        {
            if(arr[i] == highest)
            {
                continue;
            }
            else
            {
                if(arr[i]>second)
                {
                    second = arr[i];
                    possec = i;

                }
            }
        }

        System.out.println("highest number is = " + highest + " at position " + poshigh);
        System.out.println("seond highest number is = " + second + " at position " + possec);


        //better optimized solution
        /*

        int highest = 0;
        int secondHighest = 0;
        // 67
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }

         */

    }


}
