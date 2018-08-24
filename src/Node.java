/*
* Node
* Purpose: The goal of Node is
* Author/s: Morgan Myhill
* 8/24/18
* On My Honor: MM
* Collaborators:
*/
public class Node {
    //instance data:
//    private ArrayList pointUp;
//    private ArrayList pointDown;
//    private ArrayList pointLeft;
//    private ArrayList pointRight; , how would array list work if you didn't have one overarching list for all nodes?
    //connections:
    private Node left;
    private Node right;
    private Node up;
    private Node down;
    //inside node:
    private Object store;//will not work with ints, user must use wrapper class

    public Node(Object store) {
        this.store = store;
    }

//user can add connections with modifiers: too many combinations of needed connections to make constructors for each

    //Modifiers/constructors (Second commit):

    public void addPointerLeft(Node left, char rev) {//will add reverse connection for Node if indicated
        this.left = left;
        if (rev == 'Y') left.addPointerRight(this, 'X');
    }

    public void addPointerRight(Node right, char rev) {
        this.right = right;
        if (rev == 'Y') right.addPointerLeft(this, 'X');
    }

    public void addPointerUp(Node up, char rev) {
        this.up = up;
        if (rev == 'Y') up.addPointerDown(this, 'X');
    }

    public void addPointerDown(Node down, char rev) {
        this.down = down;
        if (rev == 'Y') down.addPointerUp(this, 'X');
    }

    //I am testing something but I dont think that it will work
    //yay! created in alias of Intellij file and put into AT folder, I dont think this is what we were supposed to do:(

}

