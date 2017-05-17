/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs143;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import cs143.*;

/**
 *
 * @author Son Tran
 */
public class SortedDecimalMapTest {
    SortedDecimalMap<Product> data;
    public SortedDecimalMapTest() {
    }
    
    @Before
    public void setUp() {
        data = new SortedDecimalMap<>(3);
    }

    /**
     * Test of contains method, of class SortedDecimalMap.
     */
    @Test
    public void testContains() {
        Product pro1 = new Product(206);
        Product pro2 = new Product(301);
        data.insert(pro1);
        assertTrue(data.contains(206));
        assertFalse(data.contains(301));
    }

    /**
     * Test of get method, of class SortedDecimalMap.
     */
    @Test
    public void testGet() {
    }

    /**
     * Test of insert method, of class SortedDecimalMap.
     */
    @Test
    public void testInsert() {
    }

    /**
     * Test of remove method, of class SortedDecimalMap.
     */
    @Test
    public void testRemove() {
    }

    /**
     * Test of isEmpty method, of class SortedDecimalMap.
     */
    @Test
    public void testIsEmpty() {
    }

    /**
     * Test of iterator method, of class SortedDecimalMap.
     */
    @Test
    public void testIterator() {
    }
    
}
