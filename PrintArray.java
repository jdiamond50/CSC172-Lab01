
public class PrintArray {
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
		
		
		//lambda expression implementation of findMax functional interface
		findMax m = (Character[] charArr) -> {
			Character max = charArr[0];
			for(int i = 1; i < charArr.length; i++) {
				if (charArr[i].compareTo(max) > 0) max = charArr[i];
			}
			return max;
		};
		
		System.out.print(m.max(charArray));
	}
	
//	public static void printArray(Object[] arr) {
//		System.out.print("{");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//			if (i != arr.length - 1) {
//				System.out.print(", ");
//			}
//		}
//		System.out.println("}");
//	}
	
	/*public static void printArray(Integer[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
	
	public static void printArray(Double[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
	
	public static void printArray(Character[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}
	
	public static void printArray(String[] arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}*/
	
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
	
	// Note: PrintArray.java uses unchecked or unsafe operations.
	// Note: Recompile with -Xlint:unchecked for details.
	/*public static Comparable getMax(Comparable[] arr) {
		Comparable max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) max = arr[i];
		}
		return max;
	}*/
	
	public static <T extends Comparable<T>> T getMax(T[] arr) {
		T max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(max) > 0) max = arr[i];
		}
		return max;
	}
}
