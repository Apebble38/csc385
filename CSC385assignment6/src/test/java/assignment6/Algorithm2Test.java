package assignment6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class Algorithm2Test {

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


}