package com.revisionDsa.Amazon;

public class LongestMountain {
    public static void main(String[] args) {
        int[] arr = {8,2,3,4,5,4,3,2,6};
        System.out.println(longestMountain(arr));

    }
    public static int longestMountain(int[] arr) {
        int res = 0;
        boolean peak = false;
        boolean valley  = false;
        int i =0;
        while (i<arr.length-1){
            if(arr[i] < arr[i+1]) {
                int start = i;
                while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
                    i++;
                    peak = true;
                }
                while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
                    i++;
                    valley = true;
                }
                int length = i - start + 1;
                if (peak && valley) {
                    res = Math.max(res, length);
                }
                peak = false;
                valley = false;
            }else{
                i++;
            }
        }
        return res;
    }
}
