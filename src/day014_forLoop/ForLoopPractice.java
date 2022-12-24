package day014_forLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for(int i=10;i>=5;i--){//i:10,9,8,7,6,5
            System.out.println("Hello Cydeo "+i);//i:1,2,3,4,5,6
        }


       // System.out.println("Hello world");

        System.out.println("------------------------------------------");

        int sum=0;
     for (int i=1;i<=100;i++){
        sum+=i;
         System.out.println(sum);
     }
for (char i='A';i<='Z';i++){
    System.out.print( i+" ");
}
        System.out.println();

for(char i=90;i>=65;i--){
    System.out.print( i+" ");
}
        System.out.println();
        System.out.println(sum);
    }
}
