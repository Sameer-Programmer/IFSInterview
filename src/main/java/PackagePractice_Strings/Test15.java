package PackagePractice_Strings;

public class Test15 {
    public static void main(String[] args) {
        //Capitalize Firstletters
        String s1 = "automation testing";
        String arr [] =  s1.split(" ");

        for(String x : arr){
            char first = x.charAt(0);
            char firstLetter = Character.toUpperCase(first);
            System.out.println(firstLetter+x.substring(1));

        }





    }
}
