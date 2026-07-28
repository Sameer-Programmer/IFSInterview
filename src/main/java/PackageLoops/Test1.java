package PackageLoops;

public class Test1 {
    public static void main(String[] args) {
        int x =10;
        int y = ++x;
        System.out.println(y); //11

        int v1 = 10;
        int v2 = v1++;
        System.out.println(v2); //10
    }
}
