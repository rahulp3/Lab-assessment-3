package com.gl.services;

public class NodeOps {
	public Node newNode(int data) {
		Node temp = new Node();
		temp.left = null;
		temp.data = data;
		temp.right = null;

		return temp;

	}

	public void insert(Node root, Node nextNode) {
		if (nextNode.data < root.data) {
			if (root.left == null) {
				root.left = nextNode;
			} else {
				insert(root.left, nextNode);
			}
		} else {
			if (root.right == null) {
				root.right = nextNode;
			} else {
				insert(root.right, nextNode);
			}
		}

	}

}
