package searchTree;

import java.io.*;

/**
 * @author Christina
 *
 */
public class TreeApp {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Tree boysNameTree = new Tree();
		Tree girlsNameTree = new Tree();

		try {
			boysNameTree.insert(6, "Ethan");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(8, "Alexander");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(7, "James");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(9, "Michael");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(10, "Benjamin");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(3, "Mason");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(1, "Noah");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(2, "Liam");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(4, "Jacob");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			boysNameTree.insert(5, "William");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Node node1 = boysNameTree.find(10);
		if(node1 != null) {
			System.out.print(node1.displayNode(node1.iData, node1.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		Node node2 = boysNameTree.find(2);
		if(node2 != null) {
			System.out.print(node2.displayNode(node2.iData, node2.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		Node node3 = boysNameTree.find(4);
		if(node3 != null) {
			System.out.print(node3.displayNode(node3.iData, node3.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		Node node4 = boysNameTree.find(14);
		if(node4 != null) {
			System.out.print(node4.displayNode(node4.iData, node4.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		
		try {
			girlsNameTree.insert(6, "Mia");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(8, "Emily");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(7, "Abigail");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(9, "Charlotte");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(10, "Harper");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(3, "Sophia");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(1, "Emma");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(2, "Olivia");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(4, "Ava");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			girlsNameTree.insert(5, "Isabella");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Node node5 = girlsNameTree.find(10);
		if(node5 != null) {
			System.out.print(node5.displayNode(node5.iData, node5.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		Node node6 = girlsNameTree.find(2);
		if(node6 != null) {
			System.out.print(node6.displayNode(node6.iData, node6.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		Node node7 = girlsNameTree.find(4);
		if(node7 != null) {
			System.out.print(node7.displayNode(node7.iData, node7.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
		Node node8 = girlsNameTree.find(14);
		if(node8 != null) {
			System.out.print(node8.displayNode(node8.iData, node8.sData) + "\n");
		} else {
			System.out.println("No node found");
		}
	}
}