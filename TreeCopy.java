import java.util.TreeMap;

public class TreeCopy {
    public static void main(String[] args) {
        TreeMap<String,String> tree_Map1=new TreeMap<>();
        tree_Map1.put("Apple","Red");
        tree_Map1.put("Grapes","Black");
        tree_Map1.put("Mango","Green");
        tree_Map1.put("Banana","Yellow");
        tree_Map1.put("Orange","Orange");
        System.out.println("tree_ map1:"+tree_Map1);

        TreeMap<String,String> tree_Map2=new TreeMap<>();
        tree_Map2.put("Teacher","Student");
        tree_Map2.put("Java","Developer");
        tree_Map2.put("Doctor","Patient");
        System.out.println("tree _map2:"+tree_Map2);

        tree_Map1.putAll(tree_Map2);
        System.out.println("After coping Map2 to Map1: "+tree_Map1);

    }
}
