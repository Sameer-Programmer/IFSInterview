package PackageCollection;
import java.util.*;
public class Test2 {
    public static void main(String[] args) {

        String arr1 [] = {"Apple","Banana"};
        String arr2 [] = {"Car","Bus"};

        ArrayList<String>list1 = new ArrayList<>(List.of(arr1));
        ArrayList<String>list2 = new ArrayList<>(List.of(arr2));
        System.out.println(list1);
       list1.addAll(list2);
        System.out.println(list1);

    }
}
