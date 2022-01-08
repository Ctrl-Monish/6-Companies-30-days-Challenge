package com.revisionDsa.Amazon;

public class MaxProfit {
    public static void main(String[] args) {
        int[] arr = {3,9,7,6,4,3,1};
        maxProfit1(arr);
    }

    //stock buy and sell 1 (LeetCode 121)
    //buy and sell only 1 share to maximise profit
    public static void maxProfit1_space(int[] arr){
        int[] temp = new int[arr.length]; //to keep max difference in right side
        int max = 0;
        for(int i = arr.length-1; i>=0; i--){
            temp[i] = Math.max(arr[i], max);
            max = temp[i];
        }
        int profit = 0, curr_max = 0;
        for(int i = 0; i <temp.length; i++){
            curr_max = temp[i] - arr[i];
            if(profit<curr_max){
                profit = curr_max;
            }
        }
        System.out.println(profit);
    }
    public static void maxProfit1(int[] arr){ //find min so far and maximum profit
        int minSoFar = arr[0], max_profit = 0;
        for(int i =0; i<arr.length; i++){
            minSoFar = Math.min(minSoFar, arr[i]);
            max_profit = Math.max(max_profit, arr[i] - minSoFar);
        }
        System.out.println(max_profit);
    }

    //stock buy and sell 2 (LeetCode 122)
    //we can buy any number of shares
    public static void max_Profit(int[] arr){ //buy at local minima and sell at local maxima
        int profit = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                profit+=(arr[i] - arr[i-1]);
            }
        }
        System.out.println(profit);
    }

    //Best Time to Buy and Sell Stocks - Two Transaction Allowed (LeetCode 123)
}
