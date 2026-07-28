package PackagePractice_Strings;

/*
String.valueOf()	String.valueOf(100)	"Converts value to String-
From the StringClass"
String → int	Integer.parseInt("100")	"Converts numeric String to int
From the IntegerWrapperClass"
 */

public class Test2 {
    public static void main(String[] args) {
        String s1 = "100";
        int num = Integer.parseInt(s1);
        System.out.println(num);

        String s2 = String.valueOf(num);
        System.out.println(s2);
    }
}
