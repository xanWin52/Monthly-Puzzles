import java.util.*;
import java.io.*;

public class November{
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(new File("November.dat"));
        Map<Character, Character> map = new HashMap<Character, Character>();
        
        map.put('a','l');
        map.put('b','v');
        map.put('c','x');
        map.put('d','s');
        map.put('e','w');
        map.put('f','d');
        map.put('g','f');
        map.put('h','g');
        map.put('i','u');
        map.put('j','h');
        map.put('k','j');
        map.put('l','k');
        map.put('m','n');
        map.put('n','b');
        map.put('o','i');
        map.put('p','o');
        map.put('q','p');
        map.put('r','e');
        map.put('s','a');
        map.put('t','r');
        map.put('u','y');
        map.put('v','c');
        map.put('w','q');
        map.put('x','z');
        map.put('y','t');
        map.put('z','m');
        
        String res = "";

        while(in.hasNextLine()){
            String line = in.nextLine();
            for(int i = 0; i < line.length(); i ++){
                if(map.keySet().contains(line.substring(i,i+1).toLowerCase().charAt(0))){
                    res += map.get(line.substring(i,i+1).toLowerCase().charAt(0));
                } else {
                    res += line.charAt(i);
                }
            }
            res += "\n";
        }

        System.out.println(res);
    
    }
}