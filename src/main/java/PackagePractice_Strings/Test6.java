package PackagePractice_Strings;

public class Test6 {
    public static void main(String[] args) {
        String s1 = "aabbccdda";
        String [] arr = s1.split("");
        int lengthOfArray = arr.length;
        String result = "";//a2b2c2d2a1
        int count = 1;

        for(int i = 0; i<arr.length-1; i++){
           if(arr[i+1].equalsIgnoreCase(arr[i])){
               count++;
            }else {
               System.out.println(arr[i]+count);
               count =1;
           }
        }
        System.out.println(s1.charAt(s1.length()-1)+" "+count);




    }
}
