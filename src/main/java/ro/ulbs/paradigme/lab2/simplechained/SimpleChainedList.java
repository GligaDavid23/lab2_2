package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.api.MyList;

public class SimpleChainedList  implements MyList {
	SimpleChainedNode head;

	public SimpleChainedList() {
		this.head = null;
	}

	public void addValue(int value) {
		SimpleChainedNode newNode = new SimpleChainedNode(value);
		if (head == null) {
			head = newNode;
		}
		else {
			SimpleChainedNode temp = head;
			while (temp.getNextNode() != null) {
				temp = temp.getNextNode();
			}
			temp.setNextNode(newNode);
		}
	}
	public void removeNodeByValue(int value) {
		if(head == null) return;

		if(head.getValue() == value) {
			head = head.getNextNode();
			return;
		}
		SimpleChainedNode temp = head;
		SimpleChainedNode prev = null;
		while (temp != null) {
			if (temp.getValue() == value) {
				prev.setNextNode(temp.getNextNode());
			} else {
				prev = temp;
			}
			temp = temp.getNextNode();
		}
	}
	public void listNodes() {
		SimpleChainedNode temp = head;
		while (temp != null) {
			System.out.print(temp.getValue() + " -> ");
			temp = temp.getNextNode();
		}
		System.out.println("null");
	}
	public int sumNodes() {
		int sum = 0;
		SimpleChainedNode temp = head;
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
		SimpleChainedNode temp = head;
		while (temp.getNextNode() != null) {
			if (temp.getValue() > temp.getNextNode().getValue()) {
				return false;
			}
			temp = temp.getNextNode();
		}
		return true;
	}
}
