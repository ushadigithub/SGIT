import java.util.ArrayList;
import java.util.List;

public class ConcatLists {
    public static void main(String[] args) {
        List<Integer> List1 = new ArrayList<>();
        List1.add(2);
        List1.add(3);
        List1.add(6);
        List1.add(7);
        List1.add(8);

        List<Integer> List2=new ArrayList<>();
        List2.add(10);
        List2.add(11);
        List2.add(12);
        List2.add(13);
        List2.add(14);

        List<Integer>concatenated_list=new ArrayList<>();
        concatenated_list.addAll(List1);
        concatenated_list.addAll(List2);
        System.out.println("List1:"+List1);
        System.out.println("list2:"+List2);
        System.out.println("concatenated_list:"+concatenated_list);

    }
}




