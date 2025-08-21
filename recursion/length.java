class length{
/*
    Program for length of a string using recursion
Last Updated : 18 Mar, 2025
Given a string calculate length of the string using recursion. 

Examples: 

Input: str = "abcd"
Output: 4
Explanation: The string "abcd" has a length of 4.

Input: str = "GEEKSFORGEEKS"
Output: 13    */
    
    public static int count(String s){
        if(s.isEmpty()) return 0;
        return stringCount(s,1);
    }

    public static int stringCount(String s, int count){
        if(count == s.length()) return count;
        return stringCount(s, count+1);
    }

    public static void main(String[] args) {
        String str="GEEKSFORGEEKS";
        System.out.print(count(str));
    }
}