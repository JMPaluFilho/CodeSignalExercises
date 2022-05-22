package interviewPractice.linkedLists;

public class LinkedLists02 {

    /*
     * Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in l,
     * since this is what you'll be asked to do during an interview.
     *
     * Given a singly linked list of integers, determine whether or not it's a palindrome.
     *
     * Note: in examples below and tests preview linked lists are presented as arrays just for simplicity of
     * visualization: in real data you will be given a head node l of the linked list
     *
     * Example
     *
     * For l = [0, 1, 0], the output should be
     * solution(l) = true;
     *
     * For l = [1, 2, 2, 3], the output should be
     * solution(l) = false.
     *
     * Input/Output
     *
     * [execution time limit] 3 seconds (java)
     *
     * [input] linkedlist.integer l
     *
     * A singly linked list of integers.
     *
     * Guaranteed constraints:
     * 0 ≤ list size ≤ 5 · 105,
     * -109 ≤ element value ≤ 109.
     *
     * [output] boolean
     *
     * Return true if l is a palindrome, otherwise return false.
     */

    public static void main(String[] args) {
        ListNode<Integer> list = new ListNode<>(1);
        list.next = new ListNode<>(2);
        list.next.next = new ListNode<>(2);
        list.next.next.next = new ListNode<>(3);

        System.out.println(solution(list));
    }

    // Singly-linked lists are already defined with this interface:
    static class ListNode<T> {
        ListNode(T x) {
            value = x;
        }

        T value;
        ListNode<T> next;
    }

    static boolean solution(ListNode<Integer> l) {
        ListNode<Integer> listNode = l;
        ListNode<Integer> reversedListNode = null;

        while (listNode != null) {
            ListNode<Integer> nextNode = new ListNode<>(listNode.value);
            nextNode.next = reversedListNode;
            reversedListNode = nextNode;
            listNode = listNode.next;
        }

        while (l != null && reversedListNode != null) {
            if (!l.value.equals(reversedListNode.value)) {
                return false;
            }

            l =  l.next;
            reversedListNode = reversedListNode.next;
        }

        return true;
    }

}
