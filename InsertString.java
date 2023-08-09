public class InsertString {
    public static String insertString(String originalString, String stringToBeInserted, int index) {
        return originalString.substring(0, index )
                + stringToBeInserted
                + originalString.substring(index );
    }

    public static void main(String[] args) {
        String originalString="Maths book";
        String stringToBeInserted=" note ";
        int index=6;
        System.out.println("Original String:"+originalString);
        System.out.println("StringToBeInserted:"+stringToBeInserted);
        System.out.println("String to be inserted at index:"+index);
        System.out.println("Modified String:"+insertString(originalString,stringToBeInserted,index));
    }
}






