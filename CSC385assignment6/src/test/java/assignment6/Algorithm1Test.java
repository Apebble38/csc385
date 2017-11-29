package assignment6;

import org.junit.*;

import static org.junit.Assert.*;

public class Algorithm1Test {

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


    @Test
    public void testAlgorithm1(){
        int expected = 5;
        int actual;
        int p = 1;
        int c = 2;
        int i = 1000;

        JosephusCircle jc1 = new Algorithm1(p, c, i);
        jc1.run();
        actual = jc1.lastManStanding;
        assertEquals(expected,actual);
    }

}