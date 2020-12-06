package org.sri.gundam.arrays;

public class FindMaxConsecutiveOnes {

    int consecutiveCount=0;

    public int findMaxConsecutingOnes(int[] nums){

        int consecutiveCount = 0;
        int presentCount = 0;
        for(int i=0; i<nums.length;i++){

            if(nums[i] == 1){
                presentCount+=1;
            }else{
                if(consecutiveCount <= presentCount)
                    consecutiveCount=presentCount;
                presentCount = 0;
            }
        }
         return consecutiveCount>presentCount?consecutiveCount:presentCount;


    }
}
