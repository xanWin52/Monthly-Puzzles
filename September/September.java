import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class September{

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("september.dat"));
        String result = "";
        while(in.hasNextLine()){
            String line = in.nextLine();
            for(int i = 0; i < line.length(); i ++){
                int curr = line.charAt(i);
                result += Integer.toBinaryString(curr);
            }
        }
        int count = 0;
        for(int i = 0; i < result.length(); i ++){
            if(result.charAt(i) == '1'){
                count ++;
            }
        }
        System.out.println(count);
    }

}