package PackagePractice_Strings;

import java.util.Arrays;

public class Test19 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        String s3 ="";
        String s4 ="";
        String arr1 [] = s1.split("");
        String arr2 [] = s2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(String x :arr1){
        s3=s3+x;
        }
        System.out.println(s3);

        for(String x :arr2){
            s4=s4+x;
        }
        System.out.println(s4);

        if(s3.equalsIgnoreCase(s3)){
            System.out.println("Anagram");
        }


    }
}
