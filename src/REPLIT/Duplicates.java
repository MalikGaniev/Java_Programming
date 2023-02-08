package REPLIT;

import java.util.Scanner;

public class Duplicates {
    public static int getDup(String[] arr) {

        int dup=0;
        String checked="";
        int count=0;
        for(String each:arr){
            if(checked.contains(each)){}
            for(String other:arr){
                if(each.equals(other)){
                    count++;
                }
            }
            checked+=each+" ";
            if(count>1){
                dup+=count;
            }
        }

        return dup;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));

    }

}

