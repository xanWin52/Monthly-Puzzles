public class January {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 3; i < 2024; i ++){
            n = n + sumDigits(n);
        }
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n){
        int res = 0;
        while(n != 0){
            res += n % 10;
            n /=10;
        }
        return res;
    }
}
