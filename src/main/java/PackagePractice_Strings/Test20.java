package PackagePractice_Strings;

public class Test20 {
    public static void main(String[] args) {

        String s1 = "aaabba";
        boolean foundb = false;
        boolean result = true;

        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i) == 'b'){
                foundb = true;
            }

            if(s1.charAt(i) == 'a' && foundb){
                foundb = true;
                result = false ;
                break;
            }


        }


        System.out.println(result);



    }
}
