class uppercase_letter{

/*
First uppercase letter in a string (Iterative and Recursive)
Last Updated : 09 Dec, 2022
Given a string find its first uppercase letter
Examples : 

Input : geeksforgeeKs
Output : K

Input  : geekS
Output : S      */

    public static char firstUppercase(String str, int index){
if(str.charAt(index)=='\0'){
            return 0;
        }        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }

        try {
            return firstUppercase(str, index + 1);
        }
        catch(Exception e){
            System.out.println("Exception occurs");
        }
        return 0;
    }
    
    public static void main(String[] args) {
        String str="geekA";
        System.out.print(firstUppercase(str,0));
    }
}