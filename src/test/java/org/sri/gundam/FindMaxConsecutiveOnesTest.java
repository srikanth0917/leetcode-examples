package org.sri.gundam;

import org.junit.jupiter.api.Test;
import org.sri.gundam.arrays.FindMaxConsecutiveOnes;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaxConsecutiveOnesTest {

    @Test
    public void shouldfindMaxConsecutingOnes(){
        FindMaxConsecutiveOnes findMaxConsecutiveOnes=new FindMaxConsecutiveOnes();
        int[] nums={0,1,1,1,0,1,1,1,1,0};
        assertEquals(4,findMaxConsecutiveOnes.findMaxConsecutingOnes(nums));
        int[] nos={1,1,0,0,1,1,1,1,1};
        assertEquals(5,findMaxConsecutiveOnes.findMaxConsecutingOnes(nos));
        int[] ns={1,1,1,0,0,1,1,0};
        assertEquals(3,findMaxConsecutiveOnes.findMaxConsecutingOnes(ns));
        int[] numbers={1,1,0,1,1,1};
        assertEquals(3,findMaxConsecutiveOnes.findMaxConsecutingOnes(numbers));
        int [] numbs={0,0,0,0};
        assertEquals(0,findMaxConsecutiveOnes.findMaxConsecutingOnes(numbs));
        int [] ns1={1,1,1,1};
        assertEquals(4,findMaxConsecutiveOnes.findMaxConsecutingOnes(ns1));
        int[] numbers1={0,0,0,0,1};
        assertEquals(1,findMaxConsecutiveOnes.findMaxConsecutingOnes(numbers1));
    }
}
