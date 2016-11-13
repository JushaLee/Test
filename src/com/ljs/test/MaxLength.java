package com.ljs.test;

import java.util.HashSet;
import java.util.Set;

public class MaxLength {

	public int maxLength(String str) {
		if (str == null || str.equals("")) {
			return 0;
		}
		Set<Character> set = new HashSet<Character>();
		int maxLength = 0;
		int pre = 0;
		int after = 0;
		while (after < str.length()) {
			if (!set.contains(str.charAt(after))) {
				set.add(str.charAt(after));
				after++;
			} else {
				set.clear();
				// System.out.println("pre: "+pre+" after: "+after);
				if ((after - pre) > maxLength) {
					maxLength = after - pre;
				}
				pre++;
				after = pre;
			}
		}

		if ((after - pre) > maxLength) {
			maxLength = after - pre;
		}
		return maxLength;
	}

}
