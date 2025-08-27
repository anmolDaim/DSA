class product{

    public static int pro(int x, int y){
        if(y == 0) return 0;
        return x+pro(x,y-1);
    }
    public static void main(String[] args) {
        int x=34345, y=3576;
        int result=pro(x, y);
        System.out.print(result);
    }
}