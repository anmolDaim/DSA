class binary_search{

/*LeetCode 704 Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1  */
 
    public static int helperSearch(int[] arr, int target){

        return binarySearch(arr, target,0 ,arr.length-1);
    }
    
    public static int binarySearch(int[] arr, int target, int first, int last){
        if (first > last) return -1;
        int mid= first+(last-first)/2;
        if(target==arr[mid]){
            return mid;
        }else if (target<arr[mid]) {
            last=mid-1;
        }else if (target>arr[mid]) {
            first=mid+1;
        }

        return binarySearch(arr,target,first,last);
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int num=helperSearch(nums, 10);
        System.out.print(num);
    }
}