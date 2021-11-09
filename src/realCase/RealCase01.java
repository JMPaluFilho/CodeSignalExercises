package realCase;

import java.util.Arrays;

public class RealCase01 {

    /*
	 * Check if strings are anagrams.
	 */

    public static void main(String[] args) {
        System.out.println(isAnagrama("AMOR", "ROMA"));
        System.out.println(isAnagrama("LUIS", "JOSÉ"));
        System.out.println(isAnagrama("ABB", "BAA"));

    }

    /**
    public static boolean isAnagrama(String palavra1, String palavra2) {
        if (palavra1.length() != palavra2.length()) {
            return false;
        }

        char[] array = palavra2.toCharArray();

        for (int i = 0; i < palavra1.length(); i++) {
            for (int j = 0; j < palavra2.length(); j++) {
                if (palavra1.charAt(i) == array[j]) {
                    array[j] = '$';
                    break;
                }
            }
        }

        for (char c : array) {
            if (c != '$') {
                return false;
            }
        }

        return true;
    }
    */

    public static boolean isAnagrama(String palavra1, String palavra2) {
        char[] array1 = palavra1.toCharArray();
        char[] array2 = palavra2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

}
