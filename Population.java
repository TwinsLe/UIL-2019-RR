import java.io.*;
import java.util.*;

public class Population{

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("population.dat"));

        int count = Integer.parseInt(sc.nextLine());
        while(count-->0){
            int p = sc.nextInt();
            int t = sc.nextInt();
            System.out.println(p+(t/4)-(t/7));
        }
    }

}