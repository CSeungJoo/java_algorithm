package String;

import java.util.Scanner;

public class String_5 {
     public static String solution(String str) {
         char[] c = str.toCharArray();
         int lt = 0, rt = str.length() - 1;
         while(lt < rt) {
             if(!Character.isAlphabetic(c[lt])) lt++;
             else if(!Character.isAlphabetic(c[rt])) rt--;
             else {
                 char tmp = c[lt];
                 c[lt] = c[rt];
                 c[rt] = tmp;
                 lt++;
                 rt--;
             }
         }
         return  String.valueOf(c);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
