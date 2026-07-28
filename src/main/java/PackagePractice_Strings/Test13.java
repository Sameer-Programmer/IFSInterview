package PackagePractice_Strings;

public class Test13 {
    public static void main(String[] args){
        String s1 = "Today is a good day";
        // Output: "day doog a si Today
        String arr [] = s1.split(" ");
        System.out.println(arr.length);

        for(int i = arr.length-1; i>=0; i--){
            StringBuffer sb = new StringBuffer(arr[i]);
            if(sb.toString().equalsIgnoreCase("day") ||
                    sb.toString().equalsIgnoreCase("Today")){
                System.out.println(sb);
            }else {
                System.out.println(sb.reverse());
            }
        }

    }
}
