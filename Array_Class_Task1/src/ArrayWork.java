public class ArrayWork {
	static int arr[] = { 15, 19, 6, 3, 74, 84, 62, 100, 20, 38, 415, 3, 74, 16, 15, 9, 650, 67 };
	public void getRepeatedValues() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	public short getSum() {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		return 0;
	}

	/*public static void getUniqueValues(String[] args) {
		int arr[] = { 15, 19, 6, 3, 74, 84, 62, 100, 20, 38, 415, 3, 74, 16, 15, 9, 650, 67 };
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				System.out.println(arr[i] + " ");
			}
			System.out.println(arr[arr.length - 1]);
		}
	}
	*/
	
	public void getUniqueValues() {
		boolean a = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					a = true;
					break;
				}
			}
			if (a) {
				System.out.println(arr[i] + " ");
			}
		}
	}
}
