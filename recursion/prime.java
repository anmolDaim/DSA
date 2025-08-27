class prime{

    public static boolean  isPrime(int a, int i){
        if(a <= 2){
            return (a == 2) ? true : false;
        }
        if(a % i == 0) {
            return false;
        }
        if(i*i > a) return true;
        
        return isPrime(a, i+1);
    }
    public static void main(String[] args) {
        int a=7;
        if (isPrime(a, 2)) 
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}