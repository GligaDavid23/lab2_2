package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.MyList;

public class DoubleChainedList implements MyList {
	DoubleChainedNode head;

	public DoubleChainedList() {
		this.head = null;
	}

	public void addValue(int value) {
		DoubleChainedNode newNode = new DoubleChainedNode(value);
		if (head == null) {
			head = newNode;
		}
		else {
			DoubleChainedNode temp = head;
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(newNode);
			newNode.setPrevNode(temp);
		}
	}
	public void removeNodeByValue(int value) {
		if (head == null) return;

		if (head.getValue() == value) {
			head = head.getNextNode();
			if (head == null) head.setPrevNode(null);
			return;
		}
		DoubleChainedNode temp = head;
		while (temp != null && temp.getValue() != value) {
			temp = temp.getNextNode();
		}
		if (temp != null) {
			if (temp.getPrevNode() != null) temp.getPrevNode().setNextNode(temp.getNextNode());
			if (temp.getNextNode() != null) temp.getNextNode().setPrevNode(temp.getPrevNode());
		}
	}
	public void listNodes() {
		DoubleChainedNode temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + " -> ");
			temp = temp.getNextNode();
		}
		System.out.println("null");
	}
	public int sumNodes() {
		int sum = 0;
		DoubleChainedNode temp = head;
		while (temp != null) {
			sum += temp.getValue();
			temp = temp.getNextNode();
		}
		return sum;
	}
	public boolean isSorted() {
		if (head == null || head.getNextNode() == null) {
			return true;
		}
		DoubleChainedNode temp = head;
		while (temp.getNextNode() != null) {
			if (temp.getValue() > temp.getNextNode().getValue()) {
				return false;
			}
			temp = temp.getNextNode();
		}
		return true;
	}
}
