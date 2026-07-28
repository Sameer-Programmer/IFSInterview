package PackageCollection;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list .add("sameer");
        list.add("Imran");
        System.out.println(list);
        System.out.println(list.contains("Imran"));
        System.out.println(list.get(0));
        String s1 =   list.get(0);
        System.out.println(s1);
        System.out.println(list.size());
        System.out.println(list.remove(0));
        System.out.println(list);
    }
}
