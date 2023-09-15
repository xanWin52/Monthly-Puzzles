import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class September{

    public static void main(String[] args) throws IOException{
        char[] text = "Dear Ole Flour Bluff High School,We pay you honor today.We will tell the world that your honor will stay.All hail to those who came before us,And made us so strong.We will never falter or DO YOU WRONG.".toCharArray();
        int count = 0;
        String binary = "";
        for(char x : text){
            binary += Integer.toBinaryString(x);
        }
        for(int i = 0; i < binary.length(); i ++){
            if(binary.substring(i,i+1).equals("1")){
                count ++;
            }
        }
        count += 5;
        System.out.println(count);
    }

}