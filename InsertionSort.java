public class InsertionSort {
    public static void main(String[] args) {
        int []arr={43,42,15,17,12,16,89,78,90,109};
        int length=arr.length;
        System.out.print("UnSorted array:");
        for (int k : arr) {
            System.out.print(k + " ");
        }
            for (int i=1;i< length;i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        System.out.println();
        System.out.print("Sorted array:");
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}
