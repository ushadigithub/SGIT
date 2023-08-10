public class StringReplacement {
    public static void  main(String[]args){
        String originalString="work hard in silence";
        String subStringToReplace="hard";
        String replacement="continuously";
        String modifiedString=originalString.replace(subStringToReplace,replacement);
        System.out.println("originalString:"+originalString);
        System.out.println("modifiedString:"+modifiedString);
    }

}
