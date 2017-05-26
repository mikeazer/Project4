package cs143;

/**
 * @author Linda Zuvich
 * @author Son Minh Tran
 * @author Fotsing Takougang 
 * @author Michel Azer
 * @version 1.0.2
 */

public interface DecimalSearchTree<E> extends Iterable<E> {
    
    /**
     * checks if the tree contains the value of the key.
     * 
     * @param key the key number attached with the value..
     * @return true if a value of the key exists. 
     */
    public boolean contains(int key);
    
    /**
     * Get the value of the key. 
     * 
     * @param key the key number attached with the value.
     * @return the value of the key, return null if it doesn't exist.
     */
    public E get(int key);

     /**
     * Insert the value with a unique number key to the tree.
     * 
     * @param e the value to be inserted.
     * @return true if the value was inserted, false if the value wasn't inserted.
     */ 
    public boolean insert(E e);

    /**
     * Remove the value attached with the given key.
     * 
     * @param key the key number attached with the value.
     * @return true if the value is found and removed, false if the value isn't removed
     */
    public boolean remove(int key);

    /**
     * Reports if the tree is empty or not.
     * @return true if the tree is empty, false if not 
     */
    public boolean isEmpty();
    
}
