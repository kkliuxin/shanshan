/*
 */
package com.liu.shan.leetcode;

import java.util.Arrays;
import java.util.Optional;
import java.util.PriorityQueue;

/**
 * <p>TODO
 * </p>
 *
 * @author shanwang
 * @date 2019-08-18 15:47
 **/
public class 数组中的第K个最大元素 {

    public static void main(String[] args) {
        int [] nums = {3,2,3,1,2,4,5,5,6,4};
        int k = 3;
        int kthLargest = findKthLargest(nums, k);
        System.out.println("kthLargest = " + kthLargest);
        int [] nums1 = {3,2,1,5,6,4};
        int kthLargest1 = findKthLargestByQueue(nums1, k);
        System.out.println("kthLargest1 = " + kthLargest1);

    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        return nums[nums.length - k];
    }

    public static int findKthLargestByQueue(int [] nums, int k){
        PriorityQueue<Integer> queue = new PriorityQueue<>(Integer::compareTo);
        for (int num : nums) {
            queue.offer(num);
            if(queue.size() > k) {
                queue.poll();
            }

        }
        System.out.println("queue after = " + queue);
        return queue.peek();

    }

}
