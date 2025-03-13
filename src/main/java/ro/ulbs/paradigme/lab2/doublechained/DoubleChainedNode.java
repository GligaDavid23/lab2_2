package ro.ulbs.paradigme.lab2.doublechained;

import ro.ulbs.paradigme.lab2.api.Node;

public class DoubleChainedNode {
	int value;
	DoubleChainedNode next;
	DoubleChainedNode prev;

	public DoubleChainedNode(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
	public DoubleChainedNode getNextNode() {
		return next;
	}
	public void setNextNode(DoubleChainedNode next) {
		this.next = next;
	}
	public DoubleChainedNode getPrevNode() {
		return prev;
	}
	public void setPrevNode(DoubleChainedNode prev) {
		this.prev = prev;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
