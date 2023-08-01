import java.util.Vector;

public class LinearSearchExample {

    //public LinearSearchExample(Vector<Integer> vector, int target) {
    public static void main(String[] args) {
        Vector<Integer>vector=new Vector<>();
        vector.add(9);
        vector.add(1);
        vector.add(3);
        vector.add(5);
        vector.add(8);
        System.out.println("Original vector:"+vector);
        int target=5;
        //perform linear search
            int index= linearSearch(vector,target);
            if (index !=-1){
            System.out.println("Element"+target+"found at index:"+index);
        }else{
            System.out.println("Element"+target+"not found at index:"+index);
        }
    }
    public static int linearSearch(Vector<Integer>vector,int target){
        for (int i=0;i< vector.size();i++){
            if (vector.get(i)==target) {
                return i;//if target element is found
            }
            }
              return -1;//if target element is not found
        }
    }


