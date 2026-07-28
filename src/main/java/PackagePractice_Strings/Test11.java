package PackagePractice_Strings;

public class Test11 {
    public static void main(String[] args) {
        String s1 = "Today is a good day";
        String arr [] = s1.split(" "); //day doog a si Today
        System.out.println(arr.length);

        for(int i = arr.length-1; i>=0; i-- ){
            StringBuffer sb = new StringBuffer(arr[i]);

            if(sb.toString().equalsIgnoreCase("Today") ||
                    sb.toString().equalsIgnoreCase("day")){
                System.out.println(sb);
            }else {
                System.out.println(sb.reverse());
            }



        }

    }
}
