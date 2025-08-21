class print_without_loop{

/*
Print 1 To N Without Loop
Difficulty: BasicAccuracy: 61.33%Submissions: 321K+Points: 1
You are given an integer n. You have  to print all numbers from 1 to n.
Note: You must use recursion only, and print all numbers from 1 to n in a single line, separated by spaces.

Examples:

Input: n = 10
Output: 1 2 3 4 5 6 7 8 9 10
Input: n = 5
Output: 1 2 3 4 5
Input: n = 1
Output: 1
*/
    public static void printNos(int n) {
       countNo(n,1);
    }
    public static void countNo(int n, int c){
        if(c > n) return;
        System.out.print(c+" ");
        countNo(n, c+1);
    }
    
    
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
}