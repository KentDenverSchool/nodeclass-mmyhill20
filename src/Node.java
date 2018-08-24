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
    
    }

