/*
 * Modified by: Paulie Jo Gonzalez
 * Lab w-12
 */
class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){//constructor to create new node with empty child pointers
    myValue = inValue;
  }
  
  myBinarySearchTreeNode(int[] A){//constructor to build new Binary Search Tree rooted at the first element in the given array.
    myValue = A[0];//root of tree
    for(int i = 1; i < A.length; i++)
      this.insert(A[i]);//builds tree
  }
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides
    // if it should be place:
    //    * as the left child,
    //    * as the right child,
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.
    if(inValue > myValue) {//look at the right half, recursively traverse or add new node
      if(right == null) {
        right = new myBinarySearchTreeNode(inValue);//create new node if the pointer is null
      }
      else
        right.insert(inValue);//recursive call otherwise
    }
    if(inValue < myValue) {//look at the left half, recursively traverse or add new node
      if(left == null) {
        left = new myBinarySearchTreeNode(inValue);//create new node if the pointer is null
      }
      else
        left.insert(inValue);//recursive call otherwise
    }
    if(inValue == myValue)//error message, do not add duplicates
      System.out.println("error, value already exists in the tree");
  }//end insert
  
  public int height(){//recursive method to calculate the height of the BST
    int leftH = 0;//increment height of the left sub-tree
    int rightH = 0;//increment height of the right sub-tree
    if(left != null)//left half of BST
      leftH = 1 + left.height();
    if(right != null)//right half of BST
      rightH = 1 + right.height();
    return Math.max(leftH,rightH);//return the larger of the two heights
  }//end height
  
  public int depth(int search){//recursive method to calculate the depth of a given search value
    // If the given value is not in the tree, this method returns -1.
    // Note that if the tree is a proper BST, this method should complete in O(log n) time.
    // Additionally, remember that the depth is the number of nodes on the path from a node to the root
    // (i.e. the number of the recursive calls).

    if(search < myValue) {//left sub-tree
      if(left != null) {
        int LD = left.depth(search);
        if(LD == -1)////in case search value is not found
          return -1;
        else
          return 1 + left.depth(search);//recursive call adds 1 (represents the edge)
      }
    }
    else if(search > myValue) {//right sub-tree traversal
      if(right != null) {
        int RD = right.depth(search);
        if(RD == -1)////in case search value is not found the ones will not stack up
          return -1;
        else
          return 1 + right.depth(search);//recursive call adds 1 (represents the edge)
      }
    }
    else {//value is found
      return 0;
    }
    return -1;//value is not found
  }//end depth

  public int size(){//recursive method to calculate the size of the BST
    int sum = 1;//if there is only one node
    if(left != null)
      sum += left.size();//increments sum by recursive calls for left half
    if(right != null)
      sum += right.size();//increments sum by recursive calls for right half
    return sum;//size of BST
  }

  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
}//end class
