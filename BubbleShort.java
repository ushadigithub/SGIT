public class BubbleShort {
    public static void main(String[] args) {
        int []a={7,3,2,8,9,4};
        int i,j,temp;
        int n=a.length;
        for ( i=0;i<n-1;i++) {
            for (j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array:");
        for (i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}
