package day06_ifStatements;

public class CharacterIdentity {
    public static void main(String[] args) {
 char Identify = ')';
 String result = "";
 if(Identify >=65 && Identify <= 90 && Identify >= 97 && Identify <=122){
     result = "Alphabetic character ";
 }
if(Identify>= 48&& Identify <= 57){
    result = "Digit";
}
if(Identify>= 33 && Identify <= 47 || Identify >= 58 && Identify <= 64 || Identify >= 91 && Identify <= 96 || Identify >= 123 && Identify < 125 ){
    result = "Special character";
}
        System.out.println(result);













    }




}
/*
Create a class named CharacterIdentity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character


			ch = '1'

		output:
			digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table
 */
