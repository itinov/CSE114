package Labs.Lab11;
/*  CSE 114 Summer 2017, Paul Fodor
 *  Ivan Tinov
 *  ID# 110255332
 *  Lab #11
 */

// recursive method that returns the maximum in a set of integers
public class LargestArrayElement {

	public static void main(String[] args) {
		System.out.println("Recursive program to find the maximum element in a given array...");
		int[] a = {1,4,3,7,8,9,0};
		int max = max(a); // recursive method
		System.out.println("Max element in this array is: " + max);
	}
	// helper method
	public static int max(int[] a) {
		return max(a,0);
	}
	// recursive 
	public static int max(int[] a, int pos) {
		// base condition, if maximum value is at the end of the array, then that is the maximum
		if(pos == a.length-1) {
			return a[a.length-1];
		}
		// recursive relation
		// compute the maximum starting from position pos+1
		int restMax = max(a, pos+1);
		// compare this restMax with a[pos], and then return the maximum
		if(a[pos] > restMax) {
			return a[pos];
		}
		return restMax;
	}

}
