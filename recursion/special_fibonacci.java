import java.util.*;

class special_fibonacci{


    public static int f(int a, int b, long n){
        if(n == 0) return a;
        if(n == 1) return b;
        if(n == 2) return a ^ b;

        return f(a,b,n % 3);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         int T = sc.nextInt();

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            long n = sc.nextLong();

            System.out.println(f(a, b, n));
        }

        sc.close();
    }
}