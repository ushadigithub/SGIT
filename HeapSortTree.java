public class HeapSortTree {
        public static void heapSort(int[] array) {
            int n = array.length;

            // Build max-heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(array, n, i);
            }

            // Extract elements from heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Swap current root with the last element
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // Call max-heapify on the reduced heap
                heapify(array, i, 0);
            }
        }

        // Function to maintain the max-heap property
        public static void heapify(int[] array, int n, int root) {
            int largest = root;
            int left = 2 * root + 1;
            int right = 2 * root + 2;

            // Find the largest element among root, left child, and right child
            if (left < n && array[left] > array[largest]) {
                largest = left;
            }

            if (right < n && array[right] > array[largest]) {
                largest = right;
            }

            if (largest != root) {
                // Swap root with the largest element
                int temp = array[root];
                array[root] = array[largest];
                array[largest] = temp;

                // Recursively  heapify the affected subtree
                heapify(array, n, largest);
            }
        }

        // Function to print an array
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
            System.out.println("Original array:");
            printArray(array);

            heapSort(array);

            System.out.println("Sorted array using Heap Sort:");
            printArray(array);
        }
    }


