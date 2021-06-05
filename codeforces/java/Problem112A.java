import java.util.Scanner;

public class Problem112A {
    private static String solve(String first, String second){
        for(var i  = 0; i< first.length(); i++){
            char firstChar = Character.toLowerCase(first.charAt(i));
            char secondChar = Character.toLowerCase(second.charAt(i));
            if(firstChar != secondChar) {
                return firstChar - secondChar > 0 ? "1" : "-1";
            }
        }
        return "0";
    }
    private static void in(){
        Scanner in = new Scanner(System.in);
        String first = in.nextLine();
        String second = in.nextLine();
        System.out.println(solve(first,second));
    }
    private static void test(){
        assert solve("abc", "abc").equals("0");
        assert solve("abx", "abc").equals("1");
        assert solve("abX", "AbZ").equals("-1");
    }
    public static void main(String[] args){
        in();
    }
}