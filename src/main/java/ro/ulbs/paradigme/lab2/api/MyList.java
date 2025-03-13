package ro.ulbs.paradigme.lab2.api;

public interface MyList {
	boolean isSorted();
	void addValue(int value);
	void listNodes();
	int sumNodes();
	void removeNodeByValue(int value);
}
