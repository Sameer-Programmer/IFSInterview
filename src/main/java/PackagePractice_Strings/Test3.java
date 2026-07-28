package PackagePractice_Strings;

public class Test3 {
    public static void main(String[] args) {
        String s1 = "SameerBhai1234!@#$";
        String alphabets ="";
        String nums ="";
        String spec ="";
        for(int i = 0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            if((ch>'A' && ch<'Z')||(ch>'a' && ch<'z')){
                alphabets +=ch;
            }else if((ch>='0' && ch<='9')){
                nums+=ch;
            }else {
               spec+=ch;
            }
        }
        System.out.println(alphabets);
        System.out.println(nums);
        System.out.println(spec);

    }
}
