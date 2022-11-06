package com.gl.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.gl.services.Node;
import com.gl.services.NodeOps;

public class Driver {
	static ArrayList<Integer> nodeList = new ArrayList<>();

	public static void traverse(Node root) {
		if (root != null) {
			traverse(root.left);
			nodeList.add(root.data);
			traverse(root.right);
		}
	}

	public static void main(String[] args) {

		NodeOps nc = new NodeOps();
		Node root = null;
		Node nextNode = null;

		// getting the input for number of nodes
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of nodes :");
		int noOfNodes = sc.nextInt();

		// data for the BST
		System.out.println("Enter data for the node :");
		for (int i = 1; i <= noOfNodes; i++) {
			nextNode = nc.newNode(sc.nextInt());

			if (root == null) {
				root = nextNode;
			} else {
				nc.insert(root, nextNode);
			}

		}

		traverse(root);

		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		boolean flag = false;

		for (int j = 0; j < noOfNodes; j++) {
			if (nodeList.contains(sum - nodeList.get(j))) {

				int a = nodeList.get(j);
				int b = sum - a;

				// condition to eliminate the condition where same node forms a pair eg :
				// (50,50)
				if (a != b) {
					System.out.println("Pair is (" + a + "," + b + ")");
					flag = true;
					break;
				}

			}
		}

		if (flag == false) {
			System.out.println("Pair not found!");
		}

	}
}
