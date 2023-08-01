  /*import java.util.Vector;

public class BinarySearchInVector {
    public static int binarySearch(Vector<Integer>vector,int target){
        return binarySearchHelper(vector,target, 0,vector.size()-1);
    }
    private static int binarySearchHelper(Vector<Integer> vector, int target, int low, int high){
      if(low<=high){
          int mid=low+(high-low)/2;
          if(vector.get(mid)==target){
              return mid;
          }else if(vector.get(mid)<target) {
              return binarySearchHelper(vector, target, mid + 1, high);
          }else {
              return  binarySearchHelper(vector,target,low,mid-1);
          }
      }
      return -1;
      }

    public static void main(String[] args) {
        Vector<Integer>vector=new Vector<>();
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        int targetElement=8;
        int result=binarySearch(vector,targetElement);
        if(result !=-1){
            System.out.println("Element"+targetElement+"found at index"+result+"in the vector:");
        }else{
            System.out.println("Element"+targetElement+"not found at index"+result+"in the vector:");
        }
    }

}
*/