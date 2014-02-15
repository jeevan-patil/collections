package org.java.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author jeevan
 * @date 15-Feb-2014
 * @purpose Demonstrate how to add elements to Set.
 *
 */
public class SetImpl {
	public static void main(String[] a) {
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("a");
		set.add("c");

		System.out.println(set.add("e"));
		System.out.println(set.add("a"));
		
		System.out.println("Elements in set are: " + set);
	}
}


/**

true
false
Elements in set are: [d, e, b, c, a]

*/