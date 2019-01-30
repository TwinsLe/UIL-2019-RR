import java.io.*;
import java.util.*;

public class Periods {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("periods.dat"));

        int count = Integer.parseInt(sc.nextLine());
        while(count-->0){
            String line = sc.nextLine();
            int len = line.length();
            if(line.substring(len-1,len).equals(".")){
                System.out.println(line);
            }
            else{
                System.out.println(line+".");
            }
        }
    }

}
