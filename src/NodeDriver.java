import java.util.Scanner;

/*
* NodeDriver
* Purpose: The goal of NodeDriver is to test the Node class.
* Author/s: Morgan Myhill
* 8/23/18
* On My Honor: MM
* Collaborators:
*/
public class NodeDriver {
    public static void main(String[] args) {
        //goal: to make double array like square of numbers from node class
        Scanner s = new Scanner(System.in);
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(4);
        Node four = new Node(16);

        one.addPointerRight(two,'Y');

        three.addPointerRight(four, 'Y');

        one.addPointerDown(three, 'Y');
        two.addPointerDown(four, 'Y');

        //how to test?? Ran without crashing or error?
    }
}


