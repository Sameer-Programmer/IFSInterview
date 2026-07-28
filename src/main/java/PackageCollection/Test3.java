package PackageCollection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "aabbcc";
        String s2 = "";
        String arr [] = s1.split("");
        System.out.println(arr.length);
        HashSet set = new HashSet(List.of(arr));
        System.out.println(set);
        for (Object k :set){
           s2= s2+k;
        }
        System.out.println(s2);
    }
}
