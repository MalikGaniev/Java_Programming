package GroupWork;

public class Vowel {
        public static void main(String[] args) {

            String str = "ferabhaomnuuiuiuyh";

            System.out.println(firstNonRepeatingVowel(str));

        }


        public static String firstNonRepeatingVowel(String str) {

            String vowels = "";
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
                        str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    vowels += str.charAt(i);
                }
            }

            for (int i = 0; i < vowels.length(); i++) {
                int frequency = 0;
                for (int j = 0; j < vowels.length(); j++) {
                    if (vowels.charAt(i) == vowels.charAt(j)) {
                        frequency++;
                    }
                }
                if (frequency == 1) {
                    result += vowels.charAt(i) + " " + str.indexOf(vowels.charAt(i));
                    break;
                }
            }
            if (result.isBlank()) {
                return "-1";
            }
            return result;
        }
    }


