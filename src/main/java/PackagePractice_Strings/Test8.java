package PackagePractice_Strings;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "I Love India";
        String [] arr = s1.split(" ");
        String result = "";// India Love I
        String result2 = ""; // aidnI evoL I

       // Using String Buffer

        for(int i = 0; i< arr.length; i++){
            StringBuffer sb  = new StringBuffer(arr[i]);
            System.out.println(sb.reverse());
        }
        for(int i = arr.length-1;i>=0; i--){
            StringBuffer sb  = new StringBuffer(arr[i]);
            System.out.println(sb.reverse());
        }


    }
}
