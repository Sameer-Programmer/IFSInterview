package PackagePractice_Strings;

public class Test4_RemoveWhiteSpaces {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "";
        String arr [] = s1.split(" ");
        System.out.println(arr.length+"    Length");

        for(String x:arr){

            s2 = s2+x;
        }
        System.out.println(s2);
    }
}
