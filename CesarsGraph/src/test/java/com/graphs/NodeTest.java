package com.graphs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.*;

public class NodeTest {
    public Node[] testNodes = {new Node("/wiki/User:Sct72"),
            new Node("/wiki/List_of_law_clerks_of_the_Supreme_Court_of_the_United_States"),
            new Node("/wiki/Doug_Lea"), new Node("/wiki/One-word-at-a-time"),null};


    @BeforeClass
    public static void setUpClass() {
        //this is where you create the class under test

    }

    @AfterClass
    public static void tearDownClass() {
        //this is where you remove the class under test
        //to be ready for the next test
    }

    @Before
    public void setUp() {
        //this is where you prepare EVERY SINGLE TEST
        //for EVERY SINGLE METHOD.

        //this is where the majority of scaffolding happens.

        //the setUp() method is hence called a lot.


    }

    @After
    public void tearDown() {
        //this is where you clean the slate after every single test.

        //the tearDown() method is also called a lot.
    }


    //***********wordFrequency***********************

    @Test
    public void tc1() {
        try {
            testNodes[2].wordFrequencies();
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue(false);

        }
        assertTrue(true);
    }

    @Test
    public void tc2(){
        try {
            testNodes[0].wordFrequencies();
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue(false);


        }
        assertTrue(true);
    }

    @Test
    public void tc3(){
        try {
            testNodes[1].wordFrequencies();
        } catch (IOException e) {
            e.printStackTrace();
            assertTrue(false);


        }
        assertTrue(true);
    }


//***********findSimilarity***********************
    @Test
    public void tc8(){
        BigDecimal expected = new BigDecimal(.66).setScale(2,RoundingMode.HALF_UP);
        BigDecimal actual = new BigDecimal(testNodes[2].findSimilarity(testNodes[3]));

        actual = actual.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected,actual);

    }

    @Test
    public void tc9(){
        BigDecimal expected = new BigDecimal(0).setScale(2,RoundingMode.HALF_UP);
        System.out.println(testNodes[2].findSimilarity(testNodes[0])); //prints NaN, verifying tc is correct
        BigDecimal actual = new BigDecimal(testNodes[2].findSimilarity(testNodes[0]));

        actual = actual.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected,actual);
    }
    @Test
    public void tc10(){
        BigDecimal expected = new BigDecimal(1).setScale(2,RoundingMode.HALF_UP);
        BigDecimal actual = new BigDecimal(testNodes[2].findSimilarity(testNodes[2]));

        actual = actual.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void tc11(){
       testNodes[2].findSimilarity(testNodes[4]);
    }

    @Test
    public void tc14(){
        BigDecimal expected = new BigDecimal(.86).setScale(2,RoundingMode.HALF_UP);
        BigDecimal actual = new BigDecimal(testNodes[2].findSimilarity(testNodes[1]));

        actual = actual.setScale(2, RoundingMode.HALF_UP);
        assertEquals(expected,actual);
    }



}