//import java.util.HashSet;
//import java.util.Vector;
//
//public class DeleteDuplicatesFromVector {
//    public static void main(String[] args) {
//        Vector<Integer> vector = new Vector<>();
//        vector.add(1);
//        vector.add(2);
//        vector.add(2);
//        vector.add(3);
//        vector.add(4);
//        vector.add(4);
//        vector.add(4);
//        System.out.println("Original vector:" + vector);
//        //call method to delete duplicates in a vector
//        deleteDuplicates(vector);
//        System.out.println("Vector after deleting duplicates:" + vector);
//    }
//   // public static void deleteDuplicates(Vector<Integer> vector) {
//
//     private static void deleteDuplicates(Vector<Integer> vector) {
//         HashSet<Integer> uniqueSet = new HashSet<>(vector);
//    vector.clear();
//    vector.addAll(uniqueSet);
//}
//}
//
//
