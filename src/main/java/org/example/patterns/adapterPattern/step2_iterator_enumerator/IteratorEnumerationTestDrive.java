package org.example.patterns.adapterPattern.step2_iterator_enumerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(args));
		Iterator<String> iter = l.iterator();

		Enumeration<?> enumeration = new IteratorEnumeration(iter);
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
