package org.java.collections;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
	public static void main(String[] a) {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		set.add("c");
		System.out.println("Elements in set are: " + set);
	}
}
