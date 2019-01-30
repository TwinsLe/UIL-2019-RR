import java.io.*;
import java.util.*;

public class Friends {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("friends.dat"));

        int count = Integer.parseInt(sc.nextLine());
        for (int j = 0; j < count; j++) {
            int size = Integer.parseInt(sc.nextLine());


            ArrayList<Friend> friendList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                String[] dataTime = sc.nextLine().split(" ");
                friendList.add(new Friend(dataTime[0],Integer.parseInt(dataTime[1])));
            }
            Collections.sort(friendList);

            for (int i = 0; i < friendList.size(); i++) {
                System.out.print(friendList.get(i).name);
                if (i!=friendList.size()-1) {
                    System.out.print(", ");
                }
            }
            if (j != count-1) {
                System.out.println();
            }
        }
    }

    static class Friend implements Comparable<Friend> {

        String name;
        int love;

        Friend(String sIn, int lIn) {
            name = sIn;
            love = lIn;
        }

        @Override
        public int compareTo(Friend friend) {
            if (love > friend.love) {
                return -1;
            } else if (love < friend.love) {
                return  1;
            }

            return 0;
        }
    }
}
