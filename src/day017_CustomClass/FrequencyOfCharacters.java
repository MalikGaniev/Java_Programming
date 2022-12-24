package day017_CustomClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str="aabcccd";
        String result="";//a2b1c3d1
                         //a b c d
                         //2 1 3 1
        for (int j = 0; j < str.length(); j++) {


      char ch=str.charAt(j);//a
     int count=0;
        for (int i = 0; i < str.length(); i++) {//check how many times the ch has appeared in str
            if(str.charAt(i)==ch){//if the ch has appeared in the string
                count++;//ust the frequency by 1
            }




        }
            if (result.contains(""+ch)){//if the frequency is one then its unique
                continue;
            }
            result+=ch+""+count;}
        System.out.println(result);
        }






















}
/*
2. Write a program that can find the frequency of the characters from a string

                Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1

 */