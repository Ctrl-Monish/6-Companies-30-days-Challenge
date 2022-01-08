package com.revisionDsa.Amazon;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int size = nums.length;
        int[] ans = new int[size/k];
        int i = 0, j =0;
        int max = 0;
        Deque<Integer> list = new LinkedList<Integer>();
        while (j<size){
            //calculations
            while (list.size()>0 && list.peek()>nums[j]){
                list.removeFirst();
            }
            list.addLast(nums[j]);
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                //ans<- calculations
                //slide the window

            }
        }
    }
}
