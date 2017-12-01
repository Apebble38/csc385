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
        int actual;
        int p = 1;
        int c = 1;
        int i = 1;
        int expected = 1;

        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm2(){
        int actual;
        int p = 2;
        int c = 1;
        int i = 1;
        int expected = 2;

        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm3(){
        int actual;
        int p = 2;
        int c = 2;
        int i = 2;
        int expected = 1;

        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm4(){
        int actual;
        int p = -2;
        int c = 2;
        int i = 2;
        int expected = 1;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm5(){
        int actual;
        int p = 2;
        int c = -2;
        int i = 2;
        int expected = 1;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm6(){
        int actual;
        int p = 2;
        int c = 2;
        int i = -2;
        int expected = 1;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm7(){
        int actual;
        int p = 7;
        int c = 2;
        int i = 6;
        int expected = 7;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm8(){
        int actual;
        int p = 7;
        int c = 6;
        int i = 6;
        int expected = 3;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm9(){
        int actual;
        int p = 7;
        int c = 7;
        int i = 6;
        int expected = 5;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm10(){
        int actual;
        int p = 7;
        int c = 8;
        int i = 6;
        int expected = 4;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm11(){
        int actual;
        int p = 7;
        int c = 10;
        int i = 6;
        int expected = 5;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    @Ignore
    public void testAlgorithm12(){
        int actual;
        int p = Integer.MAX_VALUE;//max int
        int c = 1;
        int i = Integer.MAX_VALUE-1;//max int -1
        int expected = Integer.MAX_VALUE;//max int


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm13(){
        int actual;
        int p = 1;
        int c = Integer.MAX_VALUE;
        int i = 1;
        int expected = 1;


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm14(){
        int actual;
        int p = Integer.MIN_VALUE;//min int
        int c = 1;
        int i = Integer.MIN_VALUE+1;//min int -1
        int expected = Math.abs(Integer.MIN_VALUE);//min int


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm15(){
        int actual;
        int p = 1;//min int
        int c = Integer.MIN_VALUE;
        int i = 1;//min int -1
        int expected = 1;//max int


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }

    @Test
    public void testAlgorithm16(){
        int actual;
        int p = 0;//min int
        int c = 0;
        int i = 0;//min int -1
        int expected = 1;//max int


        actual = runWithTestParamAlg1(p,c,i);
        assertEquals(expected,actual);
    }




    public int runWithTestParamAlg1(int p, int c, int i){
        JosephusCircle jc1 = new Algorithm1(p, c, i);
        jc1.run();
        return jc1.lastManStanding;
    }

}