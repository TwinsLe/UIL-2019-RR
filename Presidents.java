import java.io.*;
import java.util.*;

public class Presidents {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("presidents.dat"));

        int count = Integer.parseInt(sc.nextLine());

        HashMap<String,Integer> prezzies = new HashMap<>();
        prezzies.putIfAbsent("Franklin",100);
        prezzies.putIfAbsent("Grant",50);
        prezzies.putIfAbsent("Jackson",20);
        prezzies.putIfAbsent("Hamilton",10);
        prezzies.putIfAbsent("Lincoln",5);
        prezzies.putIfAbsent("Washington",1);


        for (int i = 0; i < count; i++) {
            String dudes = sc.nextLine();
            int total = 0;
            String[] dudesBetter = dudes.split(" ");
            for (int j = 0; j < dudesBetter.length; j++) {
                total += prezzies.get(dudesBetter[j]);
            }
            System.out.println("$"+total);
        }
    }

}
