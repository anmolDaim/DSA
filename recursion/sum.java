class sum{


    public static long sumOfDigits(long d){
        if(d == 0) return 0;
        return (d%10 + sumOfDigits(d/10));
    }
    public static void main(String[] args) {
        long digit= 12345;
        long ans=sumOfDigits(digit);
        System.out.print(ans);
    }
}