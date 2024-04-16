package String;

import java.util.Scanner;

public class String_8 {
    public static String solution(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();;
        System.out.println(solution(str));
    }
}
