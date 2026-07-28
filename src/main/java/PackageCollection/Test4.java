package PackageCollection;

import java.util.HashMap;

public class Test4 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,"Sameer");
        hm.put(2,"Imran");
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.get(1));
        System.out.println(hm.entrySet());

        for(Object k:hm.keySet()){
            System.out.println(k+"  "+hm.get(k));
        }






    }


}
