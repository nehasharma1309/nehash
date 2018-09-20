package javaprograms;

import java.util.Arrays;

public class LexicographicalStrings {

	public static void main(String[] args) {

		String s = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
		int n = 144;

		String out = getSmallestAndLargest(s, n);
		System.out.println(out);
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = null;
		String greatest = null;
		String[] subs = new String[s.length() - k + 1];

		for (int i = 0; i < s.length() - k + 1; i++) {
			subs[i] = s.substring(i, k + i);
			System.out.println("value of i :" + i);
			System.out.println("value of subs :" + subs[i]);
		}

		for (int j = 0; j < subs.length; j++) {
			for (int r = j + 1; r < subs.length; r++) {
				if (!(subs[j].compareTo(subs[r]) < 0)) {
					String temp = subs[j];
					subs[j] = subs[r];
					subs[r] = temp;

				}
			}
		}
		smallest = subs[0];
		greatest = subs[subs.length - 1];
		System.out.println(Arrays.toString(subs));
		return smallest + "\n" + greatest;

	}
}
