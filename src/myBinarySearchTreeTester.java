import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

public class myBinarySearchTreeTester {
    /*
     * height() method:
     *
     */
    @Test
    public void height() {
        int[] arr = {5,2,6,1,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        //assertEquals(3,tree.height());
        System.out.println(tree.height());
    }
    /*
     * depth() method:
     *
     */
    @Test
    public void depth() {
        int[] arr = {1,2,3,4};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        //assertEquals(3,tree.height());
        System.out.println(tree.depth(2));
    }
    /*
     * size() method:
     *
     */
    @Test
    public void size() {
        int[] arr = {5,2,6,1,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(arr);
        assertEquals(5,tree.size());

    }
}
