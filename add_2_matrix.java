package practise;

public class Anagram {

    public static boolean checkAnagram(String first, String second) {
        String firstValue = StringUtils.normalize(first);
        String secondValue = StringUtils.normalize(second);

        if (firstValue.length() != secondValue.length()) {
            return false;
        }

        int[] characters = new int[256];

        for (int i = 0; i < firstValue.length(); i++) {
            characters[firstValue.charAt(i)]++;
            characters[secondValue.charAt(i)]--;
        }

        for (int count : characters) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        boolean result = checkAnagram(first, second);

        System.out.println("Anagram result: " + result);
    }
}