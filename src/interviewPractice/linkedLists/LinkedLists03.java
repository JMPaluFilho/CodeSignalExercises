package interviewPractice.linkedLists;

public class LinkedLists03 {

    /*
     * You're given 2 huge integers represented by linked lists. Each linked list element is a number from 0 to 9999
     * that represents a number with exactly 4 digits. The represented number might have leading zeros. Your task is to
     * add up these huge integers and return the result in the same format.
     *
     * Example
     *
     * For a = [9876, 5432, 1999] and b = [1, 8001], the output should be
     * solution(a, b) = [9876, 5434, 0].
     *
     * Explanation: 987654321999 + 18001 = 987654340000.
     *
     * For a = [123, 4, 5] and b = [100, 100, 100], the output should be
     * solution(a, b) = [223, 104, 105].
     *
     * Explanation: 12300040005 + 10001000100 = 22301040105.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] linkedlist.integer a
     *
     * The first number, without its leading zeros.
     *
     * Guaranteed constraints:
     * 0 ≤ a size ≤ 104,
     * 0 ≤ element value ≤ 9999.
     *
     * [input] linkedlist.integer b
     *
     * The second number, without its leading zeros.
     *
     * Guaranteed constraints:
     * 0 ≤ b size ≤ 104,
     * 0 ≤ element value ≤ 9999.
     *
     * [output] linkedlist.integer
     *
     * The result of adding a and b together, returned without leading zeros in the same format.
     */

    public static void main(String[] args) {
        ListNode<Integer> a = new ListNode<>(1);

        ListNode<Integer> b = new ListNode<>(9999);
        b.next = new ListNode<>(9999);

        ListNode<Integer> c = solution(a, b);

        while (c != null) {
            System.out.println(c.value);
            c = c.next;
        }
    }

    // Singly-linked lists are already defined with this interface:
    static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    static ListNode<Integer> solution(ListNode<Integer> a, ListNode<Integer> b) {
        ListNode<Integer> reversedListA = getReversedList(a);
        ListNode<Integer> reversedListB = getReversedList(b);
        ListNode<Integer> solution = new ListNode<>(0);
        ListNode<Integer> head = solution;

        boolean addOne = false;

        do {
            int sumInt = 0;

            if (reversedListA != null) {
                sumInt += reversedListA.value;
                reversedListA = reversedListA.next;
            }

            if (reversedListB != null) {
                sumInt += reversedListB.value;
                reversedListB = reversedListB.next;
            }

            StringBuilder sumSb = new StringBuilder(String.valueOf(sumInt));

            if (addOne) {
                addOne = false;
                sumSb = new StringBuilder(String.valueOf(sumInt + 1));
            }

            if (sumSb.length() > 4) {
                sumSb.deleteCharAt(0);
                addOne = true;
            }

            head.next = new ListNode<>(Integer.parseInt(sumSb.toString()));
            head = head.next;
        } while (reversedListA != null || reversedListB != null);

        solution = solution.next;
        solution = getReversedList(solution);

        if (addOne) {
            ListNode<Integer> result = new ListNode<>(1);
            result.next = solution;
            return result;
        }

        return solution;
    }

    private static ListNode<Integer> getReversedList(ListNode<Integer> list) {
        ListNode<Integer> reversedList = null;

        while (list != null) {
            ListNode<Integer> nextNode = new ListNode<>(list.value);
            nextNode.next = reversedList;
            reversedList = nextNode;
            list = list.next;
        }

        return reversedList;
    }

}
