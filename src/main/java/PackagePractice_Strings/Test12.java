package PackagePractice_Strings;

public class Test12 {
    public static void main(String[] args) {
        String s1 = "Dog";
        String arr [] = s1.split(" ");
        System.out.println(arr.length);

        StringBuffer stringBuffer = new StringBuffer(arr.toString());
        if(stringBuffer.toString().equalsIgnoreCase("Dog")){
            System.out.println(stringBuffer);
        }



    }
}
