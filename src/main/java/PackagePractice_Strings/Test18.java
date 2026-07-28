package PackagePractice_Strings;

public class Test18 {
    public static void main(String[] args) {
        String s1 = "658488";
       char arr [] =  s1.toCharArray();

       for(int i = 0; i< arr.length-1; i++){
           if(arr[i]<arr[i+1]){
               System.out.print('<');
           }else if (arr[i]>arr[i+1]){
               System.out.print('>');
           } else if (arr[i]==arr[i+1]) {
               System.out.print('=');
           }
       }
    }
}
