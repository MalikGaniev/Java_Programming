package Day07_ifStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 25;
        String result = "Your grade is ";
        if(score>=90){// false score <90
            result="A";
        } else if (score>=80 ) {// false: score score < 80
            result = "B";
        }else if (score>=70 ) {//false: score < 70
result= "C";
        }else if (score>=60) {//false: score < 60
result = "D";
        }else{//false: score>60
            result = "F";
        }

        System.out.println("Your grade is "+result);
    }
}
