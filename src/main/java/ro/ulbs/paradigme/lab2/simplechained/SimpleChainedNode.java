package ro.ulbs.paradigme.lab2.simplechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class SimpleChainedNode implements Node {
	int value;
	SimpleChainedNode next;

	public SimpleChainedNode(int value) {
		this.value = value;
		this.next = null;
	}
	public void setNextNode(SimpleChainedNode next) {
		this.next = next;
	}
	public SimpleChainedNode getNextNode() {
		return next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
