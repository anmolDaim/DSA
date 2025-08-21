
import java.util.Arrays;


class bubble_sort {

    public static void sort(int[] arr, int n) {
        if (n == 1)
            return;

         int count = 0;
      
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                  count = count+1;
            }

         if (count == 0)
            return;

        sort(arr, n-1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 2, 8};

        sort(arr, arr.length);
        
        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));

    }
}
