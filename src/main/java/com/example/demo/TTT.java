package com.example.demo;


import java.util.ArrayList;
import java.util.List;

public class TTT {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;

        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); ++i) {
            if(list.size()-1<i+1){
                break;
            }
            if (list.get(i).equals(list.get(i+1))) {
                count+=1;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        TTT ttt = new TTT();
        int[] nums={1,0,1,1,0,1};
        int result = ttt.findMaxConsecutiveOnes(nums);
        System.out.println(result);
    }
}

