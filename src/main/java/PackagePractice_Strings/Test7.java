package PackagePractice_Strings;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "I Love India";
        String result = "";// India Love I
        String [] arr = s1.split(" ");
        System.out.println(arr.length);
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }

    }
}
