import java.util.*;
public class Test {

    public static void main(String[] args) {
        String it = "abc!32!gc!kd!2!342";
        String[] si = it.split("!");
        System.out.println(si.length);
        for(int i=0;i<si.length;i++){
            if(si[i].matches("\\d+"))
                si[i] = "";
        }
        List<String> li = Arrays.asList(si);
        System.out.println(li);
    }

}
