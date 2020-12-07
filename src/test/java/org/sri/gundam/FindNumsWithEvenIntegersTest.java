package org.sri.gundam;

import org.junit.jupiter.api.Test;
import org.sri.gundam.arrays.FindNumsWithEvenIntegers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumsWithEvenIntegersTest {

    @Test
    public void shouldFindNumsWithEvenIntegers(){
        FindNumsWithEvenIntegers findNumsWithEvenIntegers=new FindNumsWithEvenIntegers();
        int[] nums = {12,345,2,6,7896};
        assertEquals(2,findNumsWithEvenIntegers.findNumbers(nums));
        int[] nums1={555,901,482,1771};
        assertEquals(1,findNumsWithEvenIntegers.findNumbers(nums1));

    }
}
