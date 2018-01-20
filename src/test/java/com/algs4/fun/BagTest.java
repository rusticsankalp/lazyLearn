package com.algs4.fun;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import java.util.Iterator;

@Tag("fast")
class BagTest {
    @Test
    @Tag("fast")
    @DisplayName("My 1st JUnit 5 test!")
    void singleElementBagTest(TestInfo testInfo) {
         Bag<Integer> bag = new Bag<>();
         bag.add(1);
         Iterator<Integer> iter = bag.iterator();
         int count = 0;
         for (; iter.hasNext();)
         {
             assertEquals((int)(iter.next()) ,1, " should have olny value 1");
             count++;
         }
         assertEquals(count ,1, " should have olny value 1");
        //assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
        //Calculator calculator = new Calculator();
        //assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
        //assertEquals("My 1st JUnit 5 test!", testInfo.getDisplayName(), () -> "TestInfo is injected correctly");
        //assertEquals(2, 1, "2 is not equal to 1");
    }

    @Test
    @Tag("fast")
    @DisplayName("My 2nd JUnit 5 test!")
    void doubleElementBagTest(TestInfo testInfo) {
         Bag<Integer> bag = new Bag<>();
         bag.add(1);
         bag.add(2);
         Iterator<Integer> iter = bag.iterator();
         int count = 0;
         assertEquals((int)(iter.next()) ,2, " should have value 2");
         assertEquals((int)(iter.next()) ,1, " should have value 1");
         if(iter.hasNext())
         {
            assertEquals(2 ,2, " should have only 2 values");
         }
    }
}