import java.io.*;
import java.util.*;

public class Spaces {

    static ArrayList<String> dict;
    static Stack<Integer> moves;
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("spaces.dat"));

        int count = Integer.parseInt(sc.nextLine());
        dict = new ArrayList<>();
        moves = new Stack<>();
        for(int i = 0; i < count; i++){
            dict.add(sc.nextLine());
        }
        String word = sc.nextLine();
        //System.out.println(word);
        //System.out.println(dict);
        DFS(word);
    }

    public static void DFS(String word){
        if(word.length()==0){
            String ans  = "";
            int total = 0;
            for(int i=0;i<moves.size()-1;i++){
                if(i==0){
                    total += moves.get(i);
                    ans += Integer.toString(total)+" ";
                }
                else{
                    total += (1+moves.get(i));
                    ans += Integer.toString(total)+" ";
                }
            }
            System.out.print(ans.trim());
        }
        if(!flag){
            for(String s : dict){
                if(word.indexOf(s) == 0){
                    //System.out.println(s);
                    moves.push(s.length());
                    DFS(word.substring(s.length()));
                    moves.pop();
                }
            }
        }
    }
}
