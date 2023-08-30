import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class August{
    
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("august.dat"));
        while(in.hasNextLine()){
            String[] line = in.nextLine().split(" ");
            for(int i = 0; i < line.length; i ++){
                for(int j = 0; j <line[i].length(); j ++){
                    char let = (char) (line[i].charAt(j) - ' '%26);
                    if(let < 65){
                        let += 26;
                    }
                    System.out.print(let);
                }
                System.out.println();
            }
        }
    }

}