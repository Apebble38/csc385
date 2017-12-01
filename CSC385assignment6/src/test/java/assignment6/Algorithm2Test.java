package assignment6;

import org.junit.*;

import static org.junit.Assert.*;

public class Algorithm2Test {

    JosephusCircle jc2;
    int expected;
    int actual;

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
        jc2 = null;
    }

    @Test
    public void testAlgorithm1(){
        int p = 1;
        int c = 1;
        int i = 1;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm2(){
        int p = 2;
        int c = 1;
        int i = 1;
        expected = 2;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm3(){
        int p = 2;
        int c = 2;
        int i = 2;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm4(){
        int p = -2;
        int c = 2;
        int i = 2;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm5(){
        int p = 2;
        int c = -2;
        int i = 2;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm6(){
        int p = 2;
        int c = 2;
        int i = -2;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm7(){
        int p = 7;
        int c = 2;
        int i = 6;
        expected = 7;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm8(){
        int p = 7;
        int c = 6;
        int i = 6;
        expected = 3;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm9(){
        int p = 7;
        int c = 7;
        int i = 6;
        expected = 5;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm10(){
        int p = 7;
        int c = 8;
        int i = 6;
        expected = 4;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm11(){
        int p = 7;
        int c = 10;
        int i = 6;
        expected = 5;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm12(){
        int p = Integer.MAX_VALUE;
        int c = 1;
        int i = Integer.MAX_VALUE-1;
        expected = Integer.MAX_VALUE;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm13(){
        int p = 1;
        int c = Integer.MAX_VALUE;
        int i = 1;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm14(){
        int p = Integer.MIN_VALUE;
        int c = 1;
        int i = Integer.MIN_VALUE+1;
        expected = Integer.MIN_VALUE;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm15(){
        int p = 1;
        int c = Integer.MIN_VALUE;
        int i = 1;
        expected = 1;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm16(){
        int p = 0;
        int c = 0;
        int i = 0;
        expected = 0;

        jc2 = new Algorithm2(p, c, i);
        jc2.run();
        actual = jc2.lastManStanding;
        assertEquals(expected,actual);
    }

}