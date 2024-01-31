public class October{
    public static void main(String[] args) {
        long res = 1;
        for(int i = 3558; i <= 10000000; i ++){
            if(isSpooky(i)){
                res = ((res % 1031) * (digitProd(i) % 1031) ) % 1031;
            }
        }
        System.out.println(res);
    }

    public static boolean isSpooky(int x){
        int temp = 0;
        while(x > 0){
            temp += (x % 10) * (x % 10) * (x%10);
            x /= 10;
        }
        return temp == 789;
    }

    public static int digitProd(int x){
        int res = 1;
        while(x > 0){
            res *= x % 10 != 0 ? x % 10 : 1;
            x /= 10;
        }
        return res;
    }

}