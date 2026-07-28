package PackagePractice_Strings;

public class Test1 {
    public static void main(String[] args) {
    String s1 = "Sameer";
    String s2 = "sameer";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.replace('S','x'));
        System.out.println(s1.replace("Sam","Zam"));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.substring(1));


    }
}
