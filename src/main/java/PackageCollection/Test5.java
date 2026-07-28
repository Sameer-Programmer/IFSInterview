package PackageCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Sameer");
        set.add("Imran");
        System.out.println(set);

        ArrayList list = new ArrayList(set);
        System.out.println(list.get(0));



    }
}
