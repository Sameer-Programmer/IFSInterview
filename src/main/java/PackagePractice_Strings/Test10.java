package PackagePractice_Strings;

public class Test10 {
    public static void main(String[] args) {
        String s1 = "Programming concepts";
        String arr [] = s1.split(" ");
        String biggestWord= arr[0];

        for(int i = 0; i<arr.length; i++){
            if(biggestWord.length()<arr[i].length()){
                biggestWord =arr[i];
            }
        }
        System.out.println(biggestWord);
    }
}
