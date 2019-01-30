import java.io.*;
import java.util.*;

public class Clothes {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("clothes.dat"));

        int count = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < count; i++){
            int clothcount = Integer.parseInt(sc.nextLine());
            String[][] splitted = new String[clothcount][];
            for(int j = 0; j < clothcount; j++){
                splitted[j] = sc.nextLine().split(" ");
            }
            /*for(int j = 0; j < clothcount; j++){
                System.out.println(Arrays.toString(splitted[j]));
            }*/
            ArrayList<String> shirts = new ArrayList<>();
            ArrayList<String> pants = new ArrayList<>();
            ArrayList<String> socks = new ArrayList<>();
            for(int j = 0; j < clothcount; j++){
                String type = splitted[j][splitted[j].length-1];
                String cloth = "";
                if(type.equals("(shirt)")){
                    for(int k = 0; k < splitted[j].length-1; k++){
                        cloth += splitted[j][k] + " ";
                    }
                    //System.out.println(cloth);
                    cloth = cloth.substring(0, cloth.length()-1);
                    shirts.add(cloth);
                }
                else if(type.equals("(pants)")){
                    for(int k = 0; k < splitted[j].length-1; k++){
                        cloth += splitted[j][k] + " ";
                    }
                    //System.out.println(cloth);
                    cloth = cloth.substring(0, cloth.length()-1);
                    pants.add(cloth);
                }
                else if(type.equals("(socks)")){
                    for(int k = 0; k < splitted[j].length-1; k++){
                        cloth += splitted[j][k] + " ";
                    }
                    //System.out.println(cloth);
                    cloth = cloth.substring(0, cloth.length()-1);
                    socks.add(cloth);
                }
            }
            boolean check = true;
            while(check){
                System.out.println(shirts.remove(shirts.size()-1) + ", " + pants.remove(pants.size()-1) + ", " + socks.remove(socks.size()-1));
                if(shirts.isEmpty() || pants.isEmpty() || socks.isEmpty()){
                    check = false;
                }
            }
            System.out.println();
        }
    }

}