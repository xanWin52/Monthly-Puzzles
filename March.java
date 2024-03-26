import java.util.*;
import java.io.*;

public class March { 
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("march.dat"));
        String digits = in.nextLine();
        long total = 0;
        int curTerm = 3;
        for(int i = 0; i < 31424; i ++){
            total += curTerm;
            curTerm += Integer.parseInt(digits.substring(i,i + 1));
        }
        String binary = Long.toBinaryString(total);
        int count = 0;
        for(int i = 0; i < binary.length(); i ++){
            if(binary.substring(i,i+1).equals("1")){
                count ++;
            }
        }
        System.out.println(binary);
        System.out.println(count);
    }
}
