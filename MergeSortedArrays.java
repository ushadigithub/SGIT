        public class MergeSortedArrays {

        // Function to merge two sorted arrays
        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int n = arr1.length;
            int m = arr2.length;
            int[] result = new int[n + m]; // Array to store the merged result
            int i = 0, j = 0, k = 0; // Pointers to traverse  for the two arrays and the result array

            // Compare elements from both arrays and fill the result array
            while (i < n && j < m) {
                if (arr1[i] <= arr2[j]) {
                    result[k] = arr1[i];
                    i++;
                } else {
                    result[k] = arr2[j];
                    j++;
                }
                k++;
            }

            // Copy remaining elements from arr1 (if any)
            while (i < n) {
                result[k] = arr1[i];
                i++;
                k++;
            }

            // Copy remaining elements from arr2 (if any)
            while (j < m) {
                result[k] = arr2[j];
                j++;
                k++;
            }

            return result;
        }

        public static void main(String[] args) {
            int[] arr1 = { 11, 43, 45, 57 };
            int[] arr2 = { 22, 34, 46, 78 };

            int[] mergedArray = mergeArrays(arr1, arr2);

            // Print the merged sorted array
            System.out.print("Merged Sorted Array: ");
            for (int num : mergedArray) {
                System.out.print(num + " ");
            }
        }
    }

