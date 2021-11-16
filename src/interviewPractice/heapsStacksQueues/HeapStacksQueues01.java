package interviewPractice.heapsStacksQueues;

import java.util.PriorityQueue;

public class HeapStacksQueues01 {

    /*
     * Note: Avoid using built-in std::nth_element (or analogous built-in functions in languages other than C++) when
     * solving this challenge. Implement them yourself, since this is what you would be asked to do during a real interview.
     * 
     * Find the kth largest element in an unsorted array. This will be the kth largest element in sorted order, not the
     * kth distinct element.
     * 
     * Example
     * 
     * For nums = [7, 6, 5, 4, 3, 2, 1] and k = 2, the output should be
     * solution(nums, k) = 6;
     * For nums = [99, 99] and k = 1, the output should be
     * solution(nums, k) = 99.
     * Input/Output
     * 
     * [execution time limit] 3 seconds (java)
     * 
     * [input] array.integer nums
     * 
     * Guaranteed constraints:
     * 1 ≤ nums.length ≤ 105,
     * -105 ≤ nums[i] ≤ 105.
     * 
     * [input] integer k
     * 
     * Guaranteed constraints:
     * 1 ≤ k ≤ nums.length.
     * 
     * [output] integer
     */

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4, 3, 2, 6};
        int k = 2;
        System.out.println(solution(nums, k));
    }

    static int solution(int[] nums, int k) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            minQueue.offer(num);
            if (minQueue.size() > k) {
                minQueue.poll();
            }
        }

        return minQueue.peek();

        /* RESOLVENDO POR STREAMS
        List<Integer> numsList = Arrays.stream(nums)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        return numsList.get(k - 1);
        */
    }
}
