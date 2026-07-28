package PackagePractice_Strings;

public class Test9 {
    public static void main(String[] args) {

//        "Input: ""Shaik Mohamed Sameer""
//        Output: ""Shaik demahoM Sameer"

        String s1 = "Shaik Mohamed Sameer";
        String arr [] = s1.split(" ");
        String middle = arr[1];
        String reverse ="";
        for(int i = middle.length()-1; i>=0;i--){
            reverse = reverse+middle.charAt(i);
        }
        System.out.println(arr[0]);
        System.out.println(reverse);
        System.out.println(arr[2]);
    }
}
