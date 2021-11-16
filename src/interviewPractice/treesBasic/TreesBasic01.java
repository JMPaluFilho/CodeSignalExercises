package interviewPractice.treesBasic;

public class TreesBasic01 {

    /*
     * Given a binary tree t and an integer s, determine whether there is a root to leaf path in t such that the sum
     * of vertex values equals s.
     * 
     * Example
     * 
     * For
     * 
     * t = {
     * "value": 4,
     * "left": {
     * "value": 1,
     * "left": {
     * "value": -2,
     * "left": null,
     * "right": {
     * "value": 3,
     * "left": null,
     * "right": null
     * }
     * },
     * "right": null
     * },
     * "right": {
     * "value": 3,
     * "left": {
     * "value": 1,
     * "left": null,
     * "right": null
     * },
     * "right": {
     * "value": 2,
     * "left": {
     * "value": -2,
     * "left": null,
     * "right": null
     * },
     * "right": {
     * "value": -3,
     * "left": null,
     * "right": null
     * }
     * }
     * }
     * }
     * and
     * s = 7,
     * the output should be solution(t, s) = true.
     * 
     * This is what this tree looks like:
     * 
     * 4
     * / \
     * 1   3
     * /   / \
     * -2  1   2
     * \    / \
     * 3  -2 -3
     * Path 4 -> 3 -> 2 -> -2 gives us 7, the required sum.
     * 
     * For
     * 
     * t = {
     * "value": 4,
     * "left": {
     * "value": 1,
     * "left": {
     * "value": -2,
     * "left": null,
     * "right": {
     * "value": 3,
     * "left": null,
     * "right": null
     * }
     * },
     * "right": null
     * },
     * "right": {
     * "value": 3,
     * "left": {
     * "value": 1,
     * "left": null,
     * "right": null
     * },
     * "right": {
     * "value": 2,
     * "left": {
     * "value": -4,
     * "left": null,
     * "right": null
     * },
     * "right": {
     * "value": -3,
     * "left": null,
     * "right": null
     * }
     * }
     * }
     * }
     * and
     * s = 7,
     * the output should be solution(t, s) = false.
     * 
     * This is what this tree looks like:
     * 
     * 4
     * / \
     * 1   3
     * /   / \
     * -2  1   2
     * \    / \
     * 3  -4 -3
     * There is no path from root to leaf with the given sum 7.
     * 
     * Input/Output
     * 
     * [execution time limit] 3 seconds (java)
     * 
     * [input] tree.integer t
     * 
     * A binary tree of integers.
     * 
     * Guaranteed constraints:
     * 0 ≤ tree size ≤ 5 · 104,
     * -1000 ≤ node value ≤ 1000.
     * 
     * [input] integer s
     * 
     * An integer.
     * 
     * Guaranteed constraints:
     * -4000 ≤ s ≤ 4000.
     * 
     * [output] boolean
     * 
     * Return true if there is a path from root to leaf in t such that the sum of node values in it is equal to s, otherwise return false.
     */

    // Binary trees are already defined with this interface:
    static class Tree<T> {
        Tree(T x) {
            value = x;
        }

        T value;
        Tree<T> left;
        Tree<T> right;
    }

    boolean solution(Tree<Integer> t, int s) {
        if (t == null) {
            return false;
        }
        return hasSumToLeaf(t, 0, s);
    }

    private boolean hasSumToLeaf(Tree<Integer> root, int currSum, int target) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && currSum + root.value == target) {
            return true;
        }
        return hasSumToLeaf(root.left, currSum + root.value, target)
                || hasSumToLeaf(root.right, currSum + root.value, target);
    }
}
