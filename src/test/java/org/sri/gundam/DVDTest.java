package org.sri.gundam;

import org.junit.jupiter.api.Test;
import org.sri.gundam.arrays.DVD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DVDTest {

    // The actual code for creating an Array to hold DVD's.
    DVD[] dvdCollection = new DVD[15];

    // Firstly, we need to actually create a DVD object for The Avengers.
    DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

    @Test
    public void shouldInsertDVDs(){
        // Next, we'll put it into the 8th place of the Array. Remember, because we
        // started numbering from 0, the index we want is 7.
        dvdCollection[7] = avengersDVD;
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

        // Put "The Incredibles" into the 4th place: index 3.
        dvdCollection[3] = incrediblesDVD;

        // Put "Finding Dory" into the 10th place: index 9.
        dvdCollection[9] = findingDoryDVD;

        // Put "The Lion King" into the 3rd place: index 2.
        dvdCollection[2] = lionKingDVD;

        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
        dvdCollection[3] = starWarsDVD;
        System.out.println("DVD at the 4th index:"+dvdCollection[3]);
        // Print out what's in indexes 7, 10, and 3.
        System.out.println(dvdCollection[7]);
        System.out.println(dvdCollection[10]);
        System.out.println(dvdCollection[3]);

    }

    @Test
    public void shouldInsertInt(){

        int[] squareNumbers = new int[10];

        //Go through each of the Array indexes,, from 0 to 9.
        for(int i=0; i<10; i++){
            int square = (i+1) * (i+1);
            squareNumbers[i]=square;
        }

        assertTrue(squareNumbers[3]==16);
    }

    @Test
    public void ShouldReadSquareNumbers(){
        int[] squareNumbers = new int[10];

        //Go through each of the Array indexes,, from 0 to 9.
        for(int i=0; i<10; i++){
            int square = (i+1) * (i+1);
            squareNumbers[i]=square;
        }
        // Go through each of the Array indexes, from 0 to 9.
        for (int i = 0; i < 10; i++) {
            // Access and print what's at the i'th index.
            System.out.println(squareNumbers[i]);
            assertTrue(squareNumbers[i] == (i+1)*(i+1));
        }
    }

    @Test
    public void shouldDisplayLengthOfArray(){
        // Create a new array with a capacity of 6.
        int[] array = new int[6];

        // Current length is 0, because it has 0 elements.
        int length = 0;

        // Add 3 items into it.
        for (int i = 0; i < 3; i++) {
            array[i] = i * i;
            // Each time we add an element, the length goes up by one.
            length++;
        }

        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);
        assertEquals(array.length,6);
    }

}
