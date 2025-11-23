package vorlesung;

public class Main {
        public static int fibonacci(int n){
            if (n <= 1) return n;
            return fibonacci(n-1) + fibonacci(n-2);
        }

        public static void bubbleSort(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1; j++) { // ← тут помилка в завданні
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }

    public static void main(String[] args) {

        // --- Fibonacci ---
        int n = 6;
        int result = fibonacci(n);
        System.out.println("Fibonacci(" + n + ") = " + result);

        // --- Bubble Sort ---
        int[] arr = { 5, 1, 4, 2, 8 };
        bubbleSort(arr);

        System.out.print("Sortiertes Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
