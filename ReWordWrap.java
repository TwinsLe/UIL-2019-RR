import java.io.*;
import java.util.*;

public class ReWordWrap {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("rewordwrap.dat"));

        int count = Integer.parseInt(sc.nextLine());

        for (int j = 0; j < count; j++) {
            int w = Integer.parseInt(sc.nextLine());
            int m = Integer.parseInt(sc.nextLine());

            String stuff = "";
            for (int i = 0; i < m; i++) {
                stuff += " "+sc.nextLine();
            }
            stuff=stuff.substring(1);
            //System.out.println(stuff);
            String[] splitted = new String[(int)Math.ceil((double)stuff.length()/w)];

            int pos = 0;
            for (int i = 0; i < splitted.length-1; i++) {
                int end = pos+w;
                boolean flag = true;
                while (stuff.charAt(end)!=' ' && flag) {
                    end--;
                    if (end == pos) {
                        end = pos+w;
                        flag = false;
                    }
                }
                splitted[i] = stuff.substring(pos,end);
                pos = end+1;
                if (!flag) {
                    pos = end;
                }
            }
            splitted[splitted.length-1] = stuff.substring((pos));
            for (int i = 0; i < splitted.length; i++) {
                System.out.println(splitted[i]);
            }
            if (j!=count-1) {
                System.out.println();
            }
        }
    }

}
