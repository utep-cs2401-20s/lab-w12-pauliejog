/*
 * Paulie Jo Gonzalez
 * Lab w-12
 */
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class myBinarySearchTreeTester {
    /*
     * insert() method:
     * This test case checks that the insert method works properly. The method should not add any duplicates,
     * so the expected tree is the same and the method should print an error message.
     * PASSED
     */
    @Test
    public void testInsert1() {
        int[] arr = {8,6,9,4,7,10,5,12,11,13,14};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        tree.insert(9);
        int[] a = {8,6,9,4,7,10,5,12,11,13,14};
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(a);
        assertEquals(exp.right.myValue,tree.right.myValue);//checks that the first right value is unchanged
    }
    /*
     * insert() method:
     * This test case checks that the insert method works properly by using the size method. The method should add the value 11 to the BST and the
     * size of the BST should increase by 1.
     * PASSED
     */
    @Test
    public void testInsert2() {
        int[] arr = {10,8,12,5,9,15,7,13,17};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);//tree size is 9
        tree.insert(11);//tree size is now 10
        assertEquals(10,tree.size());
    }
    /*
     * height() method:
     * This test case checks that the height method works properly. The expected height is 5.
     * PASSED
     */
    @Test
    public void testHeight() {
        int[] arr = {10,8,15,6,9,11,16,3,7,12,14,17,1,0};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(5,tree.height());
    }
    /*
     * depth() method:
     * This test case checks that the depth method works. The expected depth for the given value 0 is 5.
     * PASSED
     */
    @Test
    public void testDepth() {
        int[] arr = {10,8,15,6,9,11,16,3,7,1,0};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(5,tree.depth(0));
    }
    /*
     * size() method:
     * This test case checks that the size method works properly. The expected size is 9.
     * PASSED
     */
    @Test
    public void testSize() {
        int[] arr = {10,8,15,6,9,11,16,3,7};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(9,tree.size());
    }
}//end tester class
