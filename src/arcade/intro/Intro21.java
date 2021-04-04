package arcade.intro;

public class Intro21 {

    /*
     * An IP address is a numerical label assigned to each device (e.g., computer,
     * printer) participating in a computer network that uses the Internet Protocol
     * for communication. There are two versions of the Internet protocol, and thus
     * two versions of addresses. One of them is the IPv4 address.
     *
     * Given a string, find out if it satisfies the IPv4 address naming rules.
     *
     * Example
     *
     * For inputString = "172.16.254.1", the output should be
     * isIPv4Address(inputString) = true;
     *
     * For inputString = "172.316.254.1", the output should be
     * isIPv4Address(inputString) = false.
     *
     * 316 is not in range [0, 255].
     *
     * For inputString = ".254.255.0", the output should be
     * isIPv4Address(inputString) = false.
     *
     * There is no first number.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] string inputString
     *
     * A string consisting of digits, full stops and lowercase English letters.
     *
     * Guaranteed constraints: 1 ≤ inputString.length ≤ 30.
     *
     * [output] boolean
     *
     * true if inputString satisfies the IPv4 address naming rules, false otherwise.
     */

    public static void main(String[] args) {
        String inputString = "01.254.255.0";
        System.out.println("Is IPv4 Address? " + (isIPv4Address(inputString) ? "Yes" : "No"));
    }

    private static boolean isIPv4Address(String inputString) {
        String[] splited = inputString.split("\\.");

        if (splited.length != 4) {
            return false;
        } else {
            for (String string : splited) {
                if (string.matches("\\d+") && string.length() <= 3) {
                    if (string.length() > 1 && string.startsWith("0")) {
                        return false;
                    } else {
                        int aux = Integer.parseInt(string);
                        if (aux > 255 || aux < 0) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
