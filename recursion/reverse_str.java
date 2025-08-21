

class reverse_str{

/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/

    public static void reverse(char[] arr){
         reverseCount(arr,0,arr.length-1);

    } 

    public static void reverseCount(char[] arr, int left, int right){
        if(left>=right) return;

        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        reverseCount(arr, left+1, right-1);
    }
    
    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Before: " + String.valueOf(arr));
        reverse(arr);
        System.out.println("After:  " + String.valueOf(arr));
    }
}

