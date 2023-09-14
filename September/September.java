import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class September{

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("september.dat"));
        int count = 0;
        while(in.hasNextLine()){
            char[] line = in.nextLine().toCharArray();
            for(char x : line){
                String temp = String.format("%s", Integer.toBinaryString(x)).replaceAll(" ", "0");
                for(int i = 0; i < temp.length(); i ++){
                    if(temp.charAt(i) == '1'){
                        count ++;
                    }
                }
            }
            count += 1;
        }
        System.out.println(count-1);
    }

}