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
    public void testHeight1() {
        int[] arr = {10,8,15,6,9,11,16,3,7,12,14,17,1,0};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(5,tree.height());
    }
    /*
     * height() method:
     * This test case checks that the height method works properly. The expected height is 3.
     * PASSED
     */
    @Test
    public void testHeight2() {
        int[] arr = {10,8,15,6,9,11,16,3,7};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(3,tree.height());
    }
    /*
     * depth() method:
     * This test case checks that the depth method works. The expected depth of the root is 0.
     * PASSED
     */
    @Test
    public void testDepth1() {
        int[] arr = {10,8,15,6,9,11,16,3,7,1,0};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(0,tree.depth(10));
    }
    /*
     * depth() method:
     * This test case checks that the depth method properly when the given value does not exist in the BST. The expected value is -1.
     * PASSED
     */
    @Test
    public void testDepth2() {
        int[] arr = {10,8,15,6,9,11,16,3,7,1,0};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(-1,tree.depth(4));
    }
    /*
     * depth() method:
     * This test case checks that the depth method properly. The expected depth value is 3 given node value 7.
     * PASSED
     */
    @Test
    public void testDepth3() {
        int[] arr = {10,8,15,6,9,11,16,3,7,1,0};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(3,tree.depth(7));
    }
    /*
     * size() method:
     * This test case checks that the size method works properly. The expected size is 9.
     * PASSED
     */
    @Test
    public void testSize1() {
        int[] arr = {10,8,15,6,9,11,16,3,7};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(9,tree.size());
    }
    /*
     * size() method:
     * This test case checks that the size method works properly. The expected size is 9 even though there are 10 elements in the given array (duplicate values do not count).
     * This also tests that the insert method works properly since the array contains a duplicate.
     * PASSED
     */
    @Test
    public void testSize2() {
        int[] arr = {1,2,3,4,5,6,7,8,9,2};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(9,tree.size());
    }
}//end tester class
