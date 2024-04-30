package String;

import java.util.Scanner;

public class String_11 {
//    public static String solution(String str) {
//        char last = str.charAt(0);
//        int count = 0;
//        String result = Character.toString(str.charAt(0));
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) != last) {
//                if (count > 1) {
//                    result += Integer.toString(count);
//                }
//                count = 0;
//                last = str.charAt(i);
//                result += last;
//            }
//            count++;
//            if (i == str.length() - 1)
//                result += count;
//        }
//        return result;
//    }

    public static String solution(String str) {
        String answer = "";
        str = str +" ";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1))
                count++;
            else {
                answer += str.charAt(i);
                if (count > 1)
                    answer += Integer.toString(count);
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.println(solution(str));
    }
}
