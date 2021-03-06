package com.example.navi.m4projectsetupuserstoriesandloginlogout.Models;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests if the equal method in the Shelter class works.
 *
 * Created by dodo on 4/4/18.
 * version 1.0
 */
public class ShelterEqualTest {

    private Shelter shelterName;
    private Shelter testName;

    /**
     * set up for the test
     * @throws Exception an exception
     */
    @Before
    public void setUp() throws Exception {
        shelterName = new Shelter("1", "Shelter Bob", "2", "3", "4", "5",
                "6", "7", "8");
    }

    /**
     * tests if two shelters equal works
     * @throws Exception an exception
     */
    @Test
    public void equals() throws Exception {
        testName = new Shelter("1", null, "2", "3", "4", "5",
                "6", "7", "8");
        assertFalse("Comparison fails for null", shelterName.equals(testName));

        testName = new Shelter("1", "", "2", "3", "4", "5",
                "6", "7", "8");
        assertFalse("It's not a shelter", shelterName.equals(testName));

        testName = new Shelter("1", "Shelter Bob", "2", "3", "4", "5",
                "6", "7", "8");
        assertTrue("It does have the same shelter name", shelterName.equals(testName));

        testName = new Shelter("1", "Shelter Sally", "2", "3", "4", "5",
                "6", "7", "8");
        assertFalse("The shelter name is different from the actual one", shelterName.equals(
                testName));
    }

}