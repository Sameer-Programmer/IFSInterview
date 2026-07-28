package PackagePractice_Strings;

public class Test14 {
    public static void main(String[] args) {
        //printVowels
        String s1 = "SAMEER";
        String vowels = "";
        String consonants = "";
        for(int i = 0; i<s1.length(); i++){
           char ch = s1.charAt(i);
           if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            vowels = vowels +ch;
           }else{
               consonants = consonants +ch;
           }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
