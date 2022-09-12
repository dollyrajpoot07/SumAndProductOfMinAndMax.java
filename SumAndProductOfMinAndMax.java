// Sum and Product of minimum and maximum element of an Array

// Input : 5, arr[] = {12, 1234, 45, 67, 1}
// Output : Sum = 1235
//          Product = 1234

// Input : arr[] = {5, 3, 6, 8, 4, 1, 2, 9}
// Output : Sum = 10
//          Product = 9


import java.util.*;

class SumAndProductOfMinAndMax {
    static int getMin(int arr[], int n) {
	    int res = arr[0];
	    for (int i = 1; i < n; i++)
		    res = Math.min(res, arr[i]);
	    return res;
    }
    static int getMax(int arr[], int n) {
	    int res = arr[0];
	    for (int i = 1; i < n; i++)
		    res = Math.max(res, arr[i]);
	    return res;
    }
    static int NoOfHeadsOfAstikaSheshanaga(int arr[], int n) {
	    int min = getMin(arr, n);
	    int max = getMax(arr, n);
	    return min + max;
    }
    static int ProductofHeadsOfAstikaShehanaga(int arr[], int n) {
	    int min = getMin(arr, n);
	    int max = getMax(arr, n);
	    return min * max;
    }
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0; i < n; i++) {
	        arr[i] = sc.nextInt();
	    }
		System.out.println (NoOfHeadsOfAstikaSheshanaga(arr, n));
		System.out.println(ProductofHeadsOfAstikaShehanaga(arr, n));
        sc.close();
		
	}
}
