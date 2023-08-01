/*public class ArrayDifference {
    public static int findDifference(int a,int b){
        return Math.abs(a-b);
    }

    public static void main(String[] args) {
        int []array={12,45,98,34,23,56};
        int SmallestDifference=Integer.MAX_VALUE;
        int largestDifference=Integer.MIN_VALUE;
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j<array.length;j++){
                int difference=findDifference(array[i],array[j]);
                if(difference<SmallestDifference){
                    SmallestDifference=difference;
                }
                if (difference>largestDifference){
                    largestDifference=difference;
                }

            }
        }
 System.out.println("Smallest Difference:"+SmallestDifference);
        System.out.println("LargestDifference:"+largestDifference);

    }
}
*/