/*
 * DepthFirstSearch.java
 *
 * Depth First Search algorithm (DFS).
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.Stack;

public class DepthFirstSearch {
	public void depthFirstSearch(Node root) {
        Stack<Node> s = new Stack<Node>();
        s.add(root);
        while (s.isEmpty() == false) {
            Node x = s.pop();
            if(x.right!=null) s.add(x.right);
            if(x.left!=null) s.add(x.left);         
            System.out.print(" " + x.data);
        }
    }

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
}
