package day022_arrayList;

public class WrapperClassMethod {
    public static void main(String[] args) {
        String str="20";
        System.out.println(str+1);

        int num=Integer.parseInt(str);
        System.out.println(num+1);

Integer num2= Integer.valueOf(str);
        System.out.println(num2);
        System.out.println("---------------------------");

        String s="20.5";
       double num3= Double.parseDouble(s);
      Double num4=Double.valueOf(s);
        System.out.println(num3);
        System.out.println(num4);

        String x="Jake";
     boolean x2=  Boolean.parseBoolean(x);//primitive class value

Boolean r2=Boolean.valueOf(x);//wrraper class value
        System.out.println(x2);
        System.out.println(r2);
        System.out.println("---------------------------------");
        char ch='!';
       boolean q1= Character.isDigit(ch);
        System.out.println(q1);
        boolean q2=Character.isLetter(ch);
        System.out.println(q2);
        boolean isLowerCaseLetter=Character.isLowerCase(ch);
        boolean isUpperCaseLetter =Character.isUpperCase(ch);
        boolean isLetterOrDigit=Character.isLetterOrDigit(ch);
boolean isSpecial=!Character.isLetterOrDigit(ch);
        System.out.println(isSpecial);

        System.out.println("------------------------------------");
        String string="a1b2c3d4e5";
        int sum=0;
        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
              sum+= Integer.parseInt(""+each);
            }

        }

        System.out.println(sum);




    }
}
