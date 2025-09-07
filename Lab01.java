// Julien Diamond
// partner: Norman Sackett

public class Lab01 {
	public static void main(String[] args) {
		Integer [] intArry = {1, 2, 3, 4, 5 };
		Double [] doubArry = {1.1, 2.2, 3.3, 4.4};
		Character [] charArray = {'H','E','L', 'L', 'O' };
		String [] strArray = {"once", "upon", "a", "time" };

		printArray(intArry);
		printArray(doubArry);
		printArray(charArray);
		printArray(strArray);

		System.out.println(getMax(intArry));
		System.out.println(getMax(doubArry));
		System.out.println(getMax(charArray));
		System.out.println(getMax(strArray));

	}

	// // --- SECTION 1 ---
	// // Object[] parameter
	// public static void printArray(Object[] arr) {
	// 	System.out.print("{");
	// 	for (int i = 0; i < arr.length; i++) {
	// 		System.out.print(arr[i]);
	// 		if (i != arr.length - 1) {
	// 			System.out.print(", ");
	// 		}
	// 	}
	// 	System.out.println("}");
	// }

	// // --- SECTION 2 ---
	// // method overloading
	// public static void printArray(Integer[] arr) {
	// 	System.out.print("{");
	// 	for (int i = 0; i < arr.length; i++) {
	// 		System.out.print(arr[i]);
	// 		if (i != arr.length - 1) {
	// 			System.out.print(", ");
	// 		}
	// 	}
	// 	System.out.println("}");
	// }
	//
	// public static void printArray(Double[] arr) {
	// 	System.out.print("{");
	// 	for (int i = 0; i < arr.length; i++) {
	// 		System.out.print(arr[i]);
	// 		if (i != arr.length - 1) {
	// 			System.out.print(", ");
	// 		}
	// 	}
	// 	System.out.println("}");
	// }
	//
	// public static void printArray(Character[] arr) {
	// 	System.out.print("{");
	// 	for (int i = 0; i < arr.length; i++) {
	// 		System.out.print(arr[i]);
	// 		if (i != arr.length - 1) {
	// 			System.out.print(", ");
	// 		}
	// 	}
	// 	System.out.println("}");
	// }
	//
	// public static void printArray(String[] arr) {
	// 	System.out.print("{");
	// 	for (int i = 0; i < arr.length; i++) {
	// 		System.out.print(arr[i]);
	// 		if (i != arr.length - 1) {
	// 			System.out.print(", ");
	// 		}
	// 	}
	// 	System.out.println("}");
	// }

	// --- SECTION 3 ---
	// Java generics
	public static <T> void printArray(T[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	// // --- SECTION 4 ---
	// // using Comparable
	// // compiler warnings:
	// // Note: Lab01.java uses unchecked or unsafe operations.
	// // Note: Recompile with -Xlint:unchecked for details.
	// public static Comparable getMax(Comparable[] arr) {
	// 	Comparable max = arr[0];
	// 	for (int i = 1; i < arr.length; i++) {
	// 		if (arr[i].compareTo(max) > 0) max = arr[i];
	// 	}
	// 	return max;
	// }

	// --- SECTION 5 ---
	// Java generics
	public static <T extends Comparable<T>> T getMax(T[] arr) {
		T max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) max = arr[i];
		}
		return max;
	}
}
