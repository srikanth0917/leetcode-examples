package org.sri.gundam.arrays;

public class FindMaxConsecutiveOnes {

    public int findMaxConsecutingOnes(int[] nums){

        int consecutiveCount = 0;
        int presentCount = 0;
        for(int num:nums){

            if(num == 1){
                presentCount+=1;
            }else{
                consecutiveCount=Math.max(consecutiveCount,presentCount);
                presentCount = 0;
            }
        }
         return Math.max(consecutiveCount,presentCount);


    }
}
