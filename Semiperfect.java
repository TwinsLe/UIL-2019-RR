import java.io.*;
import java.util.*;

public class Semiperfect{
    static ArrayList<Integer> factors;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("semiperfect.dat"));

        int count = Integer.parseInt(sc.nextLine());
        factors = new ArrayList<>();
        while(count-->0){
            factors.clear();
            int m = sc.nextInt();
            add_factors(m);
            boolean[][] grid = new boolean[factors.size()+1][m+1]; //indices, then total value
            for(int i=0;i<=factors.size();i++){
                grid[i][0] = true; //can make value of true
            }
            for(int j=1;j<=m;j++){
                for(int i=1;i<=factors.size();i++){
                    if(j-factors.get(i-1)>=0){
                        grid[i][j] = grid[i-1][j] || grid[i-1][j-factors.get(i-1)];
                    }
                }
            }
            //System.out.println(factors);
            if(grid[factors.size()][m]){
                System.out.println("Semiperfect");
            }
            else{
                System.out.println("NOT Semiperfect");
            }
            //System.out.println(grid[factors.size()][m]);
        }
    }
    public static void add_factors(int n){
        factors.add(1);
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(i==n/i){
                    factors.add(i);
                }
                else{
                    factors.add(i);
                    factors.add(n/i);
                }
            }
        }
    }
}