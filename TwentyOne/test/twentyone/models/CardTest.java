/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyone.models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RFord
 */
public class CardTest {
    
    public CardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new Card();
        String expResult = "";
        String result = instance.toString();
        System.out.println(result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCardValue method, of class Card.
     */
    @Test
    public void testGetCardValue() {
        System.out.println("getCardValue");
        Card instance = new Card();
        int expResult = 0;
        int result = instance.getCardValue();
        System.out.println(result);
        assertNotSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of getFileName method, of class Card.
     */
    @Test
    public void testGetFileName() {
        System.out.println("getFileName");
        Card instance = new Card();
        String expResult = "";
        String result = instance.getFileName();
        System.out.println(result);
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
