/*
 * BreadthFirstSearch.java
 *
 * Breadth First Search algorithm (BFS).
 *
 * Author: Nick Salerni
 * Copyright (c) 2015. All rights reserved.
 *
 */
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	public void breadthFirstSearch(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		if (root == null)
			return;
		q.add(root);
		while (!q.isEmpty()) {
			Node n = (Node) q.remove();
			System.out.print(" " + n.data);
			if (n.left != null)
				q.add(n.left);
			if (n.right != null)
				q.add(n.right);
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
