package REPLIT;
import java.util.*;
public class CombineArray {
    public static ArrayList<String> combine(String[] r1, String[] r2){

        // your code here
        ArrayList<String>r=new ArrayList<>(r1.length+r2.length);
       r.addAll(Arrays.asList(r1));
       r.addAll(Arrays.asList(r2));


return r;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        String [] strs2 = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        for(int i=0; i < strs2.length; i++) {
            strs2[i] = in.next();
        }

        System.out.println(combine(strs,strs2));

    }
}
