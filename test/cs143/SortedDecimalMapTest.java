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
import java.util.Iterator;

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
        Product pro1 = new Product(125);
        Product pro2 = new Product(3);
        Product pro3 = new Product(148);
        data.insert(pro1);
        data.insert(pro2);
        assertTrue(data.contains(125));
        assertTrue(data.contains(3));
        assertFalse(data.contains(148));
    }

    /**
     * Test of get method, of class SortedDecimalMap.
     */
    @Test
    public void testGet() {
        Product pro1 = new Product(122);
        data.insert(pro1);
        assertTrue(data.get(122) == pro1);
        assertNull(data.get(144));
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
        assertTrue(data.isEmpty());
        data.insert(new Product(254));
        assertFalse(data.isEmpty());
    }

    /**
     * Test of iterator method, of class SortedDecimalMap.
     */
    @Test
    public void testIterator() {
        Iterator it = data.iterator();
        assertFalse(it.hasNext());
        assertNull(it.next());
        Product pro1 = new Product(355);
        Product pro2 = new Product(244);
        Product pro3 = new Product(145);
        Product pro4 = new Product(147);
        data.insert(pro1);
        data.insert(pro2);
        data.insert(pro3);
        data.insert(pro4);
        Iterator it1 = data.iterator();
        assertSame(pro3, it1.next());
        assertSame(pro4, it1.next());
        assertSame(pro2, it1.next());
        assertSame(pro1, it1.next());
        for (Product product : data) {
            System.out.println(product);
        }
        System.out.println("fun");
        
    }
    
}
