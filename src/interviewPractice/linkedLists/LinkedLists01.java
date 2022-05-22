package interviewPractice.linkedLists;

public class LinkedLists01 {

    /*
     * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in the
     * list, since this is what you'll be asked to do during an interview.
     *
     * Given a singly linked list of integers l and an integer k, remove all elements from list l that have a value equal to k.
     *
     * Example
     *
     * For l = [3, 1, 2, 3, 4, 5] and k = 3, the output should be
     * solution(l, k) = [1, 2, 4, 5];
     * For l = [1, 2, 3, 4, 5, 6, 7] and k = 10, the output should be
     * solution(l, k) = [1, 2, 3, 4, 5, 6, 7].
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] linkedlist.integer l
     *
     * A singly linked list of integers.
     *
     * Guaranteed constraints:
     * 0 ≤ list size ≤ 105,
     * -1000 ≤ element value ≤ 1000.
     *
     * [input] integer k
     *
     * An integer.
     *
     * Guaranteed constraints:
     * -1000 ≤ k ≤ 1000.
     *
     * [output] linkedlist.integer
     *
     * Return l with all the values equal to k removed.
     */

    public static void main(String[] args) {
        ListNode<Integer> node = new ListNode<>(3);
        node.next = new ListNode<>(1);
        node.next.next = new ListNode<>(2);
        node.next.next.next = new ListNode<>(3);
        node.next.next.next.next = new ListNode<>(4);
        node.next.next.next.next.next = new ListNode<>(5);

        ListNode<Integer> removedNodes = solution(node, 3);

        while (removedNodes != null) {
            System.out.println(removedNodes.value);
            removedNodes = removedNodes.next;
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

    static ListNode<Integer> solution(ListNode<Integer> l, int k) {
        while (l != null && l.value == k) {
            l = l.next;
        }

        ListNode<Integer> current = l;
        while (current != null && current.next != null) {
            if (current.next.value == k) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }

        }

        return l;

        /* Modo Recursivo
        if (l == null)
            return null;

        l.next = solution(l.next, k);

        if (l.value == k)
            return l.next;

        return l;
        */
    }
}
