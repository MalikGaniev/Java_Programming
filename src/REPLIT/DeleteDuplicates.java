package REPLIT;

import java.util.Scanner;

public class DeleteDuplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }



        public static String uniqueChars(String str) {
            //TODO: write your code
            String uniqueCharacter="";
            for (int i = 0,j=0; i < str.length(); i++,j++) {
                if(uniqueCharacter.contains(""+str.charAt(i))){
                    continue;
                }
                uniqueCharacter+=str.charAt(i);
            }



            return uniqueCharacter;
        }




    }

/*
### Finish the method called `uniqueChars()` that will take a `String` `str` argument and returns a `String` that will only have a unique copy of each character. Remove the duplicate instances of each character. The `uniqueChars()` method is already called in the main method with an argument.

#### This is a `return` method with a `String` parameter

Main topics: methods, Scanner, String, loops

Example:
```
  uniqueChars("java")

output:
  jav
```
 */