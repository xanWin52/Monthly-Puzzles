import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class September{

    public static void main(String[] args) throws IOException{
        StringBuilder s = new StringBuilder();
        String next = "Dear Ole Flour Bluff High School,\nWe pay you honor today.\nWe will tell the world that your honor will stay.\nAll hail to those who came before us,\nAnd made us so strong.\nWe will never falter or DO YOU WRONG.";
        byte[] bytes = next.getBytes();
        for(byte b : bytes){
            int val = b;
            for(int j = 0; j < 8; j ++){
                s.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            s.append(" ");
        }
        String binary = s.toString();
        int count = 0;
        for(int i = 0; i < binary.length(); i ++){
            if(binary.substring(i, i + 1).equals("1")){
                count ++;
            }
        }
        System.out.println(count);
    }

}