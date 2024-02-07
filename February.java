import java.util.*;

public class February {
    public static void main(String[] args) {
        ArrayList<Integer> longMonths = new ArrayList<Integer>();
        longMonths.add(1);
        longMonths.add(3);
        longMonths.add(5);
        longMonths.add(7);
        longMonths.add(8);
        longMonths.add(10);
        longMonths.add(12);
        ArrayList<Integer> shortMonths = new ArrayList<Integer>();
        shortMonths.add(4);
        shortMonths.add(6);
        shortMonths.add(9);
        shortMonths.add(11);
        int count = 0;
        for(int year = 2000; year < 2100; year ++){
            for(int month = 1; month <= 12; month ++){
                int numDays = 0;
                if(longMonths.contains(month)){ numDays = 31;}
                else if(shortMonths.contains(month)){ numDays = 30;}
                else if(month == 2) {
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                        numDays = 29;
                    } else {
                        numDays = 28;
                    }
                }
                // System.out.println(numDays);
                for(int day = 1; day <= numDays; day ++){
                    int date = month * 10000 + day * 100 + (year % 100);
                    // System.out.println(date);
                    // System.out.println(date);
                    Set<Integer> factors = factor(date);
                    // System.out.println(factors);
                    int total = 0;
                    for(int i : factors){
                        total += i;
                    }
                    // System.out.println(total);
                    int target = (total - date)/2;
                    if(factors.contains(target)){
                        count ++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static Set<Integer> factor(int num ){
        Set<Integer> result = new HashSet<Integer>();
        result.add(1);
        for(int i = 2; i < (int) Math.ceil(Math.sqrt(num)); i ++){
            if(num % i == 0){
                result.add(i);
                result.add(num / i);
            }
        }
        return result;
    }
}
