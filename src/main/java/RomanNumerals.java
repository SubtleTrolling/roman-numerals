public class RomanNumerals {

    public static String convert(int number) {

        if (number == 4) {
            return "IV";
        } else if (number >= 5) {

            String result = "V";

            int extraIs = number - 5;
            int count = 0;

            while (count < extraIs) {
                count++;
                result += "I";
            }

            return result;
        }

        String result = "";
        int count = 0;

        while (count < number) {
            count++;
            result += "I";
        }

        return result;
    }
}