package day24_dataAndTime;

import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class FrequencyOfMethod {
    public static void main(String[] args) {
        String str="aaabbbcccc";
        String result="";
        for (String each : str.split("")) {
            int frequency= Collections.frequency(Arrays.asList(str.split("")),each);
            if(!result.contains(each)){
                result+=each+frequency;

            }
        }
    }
}
