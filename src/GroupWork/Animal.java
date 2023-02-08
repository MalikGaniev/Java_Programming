package GroupWork;

public class Animal {
    public static void main(String[] args) {
        System.out.println(feastCheck("Eagle", "Edamame"));
        System.out.println(feastCheck("Lion", "zebra"));
    }




    private static boolean feastCheck(String animal, String food) {
        boolean t = false;
        if (animal.charAt(0) == food.charAt(0) && animal.charAt(animal.length() - 1) == food.charAt(food.length() - 1)) {
            t = true;
        } else {
            t = false;
        }

    return t;
}}

