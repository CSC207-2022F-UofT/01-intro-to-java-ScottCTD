/*
 * This file contains JUnit test cases for Basics.java
 *
 * You should NOT modify this file! When you push Basics.java to
 * GitHub, it should run these tests. You can see the results in the
 * "Actions" tab of your repository.
 */

import org.junit.*;

import static org.junit.Assert.*;

import java.io.*;

public class BasicsTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    public String[] getMainOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Basics.main(null);

        System.setOut(originalOut);

        return bos.toString().split("\n");
    }

    @Test(timeout = 50)
    public void testTask1() {
        String[] output = getMainOutput();

        // assertion
        assertEquals("Hello World!", output[1].strip());
    }

    @Test(timeout = 50)
    public void testTask2() {
        String[] output = getMainOutput();

        // assertion
        assertEquals("my_variable's value is 100", output[2].strip());
    }

    @Test(timeout = 50)
    public void testTask3() {
        String[] output = getMainOutput();

        // assertion
        for (int i = 10; i >= 0; i--) {
            assertEquals("Current count: " + i, output[3 + (10 - i)].strip());
        }
    }

    @Test(timeout = 50)
    public void testTask4() {
        assertEquals(Basics.split("Idol Long Oolong Vertical Europe University Toyota"), "ILOVEUT");
        assertEquals(Basics.split("A B C D E F G"), "ABCDEFG");
        assertEquals(Basics.split("All Brown Cows Do Eat Fresh Grass"), "ABCDEFG");
        assertEquals(Basics.split("The First Letters Are Not That Interesting"), "TFLANTI");
    }

    @Test(timeout = 50)
    public void testTask5() {
        int[] arr = {5, 3, 1};
        assertEquals(Basics.oddSum(arr), 3);

        int[] arr2 = {1, 10, 2, 15, 3, 12};
        assertEquals(Basics.oddSum(arr2), 37);

        int[] arr3 = {1};
        assertEquals(Basics.oddSum(arr3), 0);

        int[] arr4 = {17, 2};
        assertEquals(Basics.oddSum(arr4), 2);
    }
}
