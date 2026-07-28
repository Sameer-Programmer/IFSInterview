package PackagePractice_Strings;

public class Test5 {
    public static void main(String[] args) {
        String s1 = "aabbcdr";
         char []  arr = s1.toCharArray();

        for(int i =0; i<arr.length; i++){
            int count = 0;
            for(int j =0; j<arr.length;j++){
               if(arr[i]==arr[j]){
                   count++;
               }
            }

            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
