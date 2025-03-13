package ro.ulbs.paradigme.lab2.application;

import ro.ulbs.paradigme.lab2.simplechained.SimpleChainedList;
import ro.ulbs.paradigme.lab2.doublechained.DoubleChainedList;
import ro.ulbs.paradigme.lab2.api.MyList;

public class Application {
	public static void main(String[] args) {
		MyList simpleList = new SimpleChainedList();
		for (int i = 1; i <= 10; i++) simpleList.addValue(i);

		System.out.println("Lista simplu inlantuita initiala:");
		simpleList.listNodes();

		simpleList.removeNodeByValue(4);
		simpleList.removeNodeByValue(6);
		simpleList.removeNodeByValue(8);
		simpleList.removeNodeByValue(10);

		System.out.println("Lista simplu inlantuita dupa eliminare:");
		simpleList.listNodes();

		System.out.println("Suma nodurilor: " + simpleList.sumNodes());
		System.out.println("Este lista ordonata crescator? " + simpleList.isSorted());

		MyList doubleList = new DoubleChainedList();
		for (int i = 1; i <= 10; i++) doubleList.addValue(i);

		System.out.println("\nLista dublu inlantuita initiala:");
		doubleList.listNodes();

		doubleList.removeNodeByValue(1);
		doubleList.removeNodeByValue(2);
		doubleList.removeNodeByValue(3);

		System.out.println("Lista dublu inlantuita dupa eliminare:");
		doubleList.listNodes();

		System.out.println("Suma nodurilor: " + doubleList.sumNodes());
		System.out.println("Este lista ordonata crescator? " + doubleList.isSorted());
	}
}
