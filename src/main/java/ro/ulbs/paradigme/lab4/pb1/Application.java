package ro.ulbs.paradigme.lab4.pb1;

import java.util.*;

public class Application {
	public static void main(String[] args) {
		List<Integer> x = new ArrayList();
		List<Integer> y = new ArrayList();
		List<Integer> xPlusY = new ArrayList(); //a
		Set<Integer> zSet = new TreeSet(); //b
		List<Integer> xMinusY = new ArrayList();//c
		int p = 4;
		List<Integer> xPlusYLimitedByP = new ArrayList(); //d
		Random randx = new Random();
		Random randy = new Random();
		for (int i = 0; i < 10; i++) {
			x.add(randx.nextInt(11));
			y.add(randy.nextInt(11));
		}
		xPlusY.addAll(x);
		xPlusY.addAll(y);
		zSet.addAll(x);
		zSet.retainAll(y);
		xMinusY.addAll(x);
		xMinusY.removeAll(y);
		xPlusYLimitedByP.addAll(xPlusY);
		xPlusYLimitedByP.removeIf(n -> n > p);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("a) xPlusY: " + xPlusY);
		System.out.println("b) zSet: " + zSet);
		System.out.println("c) xMinusY: " + xMinusY);
		System.out.println("d) xPlusYLimitedByP: " + xPlusYLimitedByP);
	}
}
