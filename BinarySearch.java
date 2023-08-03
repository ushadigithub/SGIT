public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 14;
        int l = 0;
        int h = a.length - 1;
        while (l <= h) {
            int m = (l + h) / 2;
            if (a[m] == key) {
                System.out.println("Element found at index:" + m);
                return;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        System.out.println("Element not found:");
    }
}


