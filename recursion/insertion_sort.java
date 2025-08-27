
import java.util.Arrays;

class insertion_sort{

    public static void insertion(int[] arr, int i){
        int n=arr.length;
        if(i == n) return;

        int key = arr[i];//1
        int j = i-1;//0
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j=j-1;
        }
        arr[j+1]=key;
        insertion(arr, i+1);
    
    }
    public static void main(String[] args) {
        int[] arr={23,1,10,5,2};
        insertion(arr, 1);
        System.out.print(Arrays.toString(arr));
    }
}