import java.io.*;
import java.util.*;

public class DryRun {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("dryrun.dat"));

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            System.out.println(s + " fly together");
        }
    }

}
