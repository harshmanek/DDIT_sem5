/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import demo.*;

/**
 *
 * @author harsh
 */
public class NewEmptyJUnitTest {
    Demo a;
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a=new Demo();
        int ans=a.add(3,5);
        a.sub(3,5);
        a.mul(3,5);
    }
    
    @After
    public void tearDown() {
    }
    @Test
    public void add(){
        
        assertEquals(8,a.add(3,5));
    
    }
    @Test
    public void sub(){
        assertEquals(-2,a.sub(3,5));
    }
    @Test
    public void mul(){
        assertEquals(14,a.mul(3,5));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
