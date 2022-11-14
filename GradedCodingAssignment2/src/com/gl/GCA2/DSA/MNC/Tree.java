package com.gl.GCA2.DSA.MNC;

public class Tree {

	public static Node node;
	static Node prevNode = null;
	static Node current_pointer = null;

	//Method to convert BST into Right Skewed Tree
	static void convertToRightSkew(Node root) {
		if (root == null) {
			return;
		}

		convertToRightSkew(root.left);

		if (current_pointer == null) {
			current_pointer = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		convertToRightSkew(root.right);
	}

	static void traverseRightSkew(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkew(root.right);
	}
	
}

class Node {
	int key;
	Node left, right;

	Node(int data) {
		key = data;
		left = right = null;
	}
}
