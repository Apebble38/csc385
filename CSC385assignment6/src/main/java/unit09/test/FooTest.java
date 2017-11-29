/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit09.test;

import org.junit.*;



import unit09.Foo;


/**
 *
 * @author tenberge
 */
public class FooTest {
    
    private Foo classUnderTest;
    
    public FooTest() {
        classUnderTest = new Foo();
    }
    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void bar() {
        int expected = 21;
        
        int actual = classUnderTest.bar(6, 5, 9);
        
        Assert.assertEquals(expected, actual);
    }
}
