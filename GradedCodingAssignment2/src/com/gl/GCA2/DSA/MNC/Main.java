package com.gl.GCA2.DSA.MNC;

public class Main {

	public static void main(String[] args) {

		Tree.node = new Node(50);
		Tree.node.left = new Node(30);
		Tree.node.right = new Node(60);
		Tree.node.left.left = new Node(10);
		Tree.node.right.left = new Node(55);

		Tree.convertToRightSkew(Tree.node);
		Tree.traverseRightSkew(Tree.current_pointer);
	}
}
