class min_max {

    /*  Recursive Programs to find Minimum and Maximum elements of array
Last Updated : 05 Jul, 2025
Given an array of integers arr[], the task is to find the minimum and maximum elements in the array using recursion only.

Examples:

Input: arr[] = [1, 4, 3, -5, -4, 8, 6]
Output: min = -5, max = 8

Input: arr[] = [1, 4, 45, 6, 10, -8]
Output: min = -8, max = 45

Input: arr[] = [12, 3, 15, 7, 9]
Output: min = 3, max = 15  */


   
    public static int[] minMax(int[] arr) {
        int min = findMin(arr, 0, Integer.MAX_VALUE);
        int max = findMax(arr, 0, Integer.MIN_VALUE);
        return new int[]{min, max};
    }


    public static int findMin(int[] arr, int index, int currentMin) {
        if (index == arr.length) return currentMin;
        if (arr[index] < currentMin) currentMin = arr[index];
        return findMin(arr, index + 1, currentMin);
    }


    public static int findMax(int[] arr, int index, int currentMax) {
        if (index == arr.length) return currentMax;
        if (arr[index] > currentMax) currentMax = arr[index];
        return findMax(arr, index + 1, currentMax);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        int[] result = minMax(arr);
        System.out.println("Min = " + result[0] + ", Max = " + result[1]);
    }
}


 