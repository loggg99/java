package com.himedia.practice;

public class L_string {

    public static void exam1() {
        String str ="hello";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
    public static void exam2() {
        String str = "hello";
        String sub = str.substring(0,3);
        System.out.println(sub);

        String str_ = "20240826";
        String str_year = str_.substring(0,4);
        String str_month = str_.substring(4,6);
        String str_day = str_.substring(6,8);

        System.out.println(str_year);
        System.out.println(str_month);
        System.out.println(str_day);
    }
    public static void exam3() {
        String str = "one two three four";
        String[] strs = str.split(" ");
        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);
        System.out.println(strs[3]);

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public static void exam4() {
        String str = "Hollo";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        for (char c : chars) {
            System.out.println(c);
        }
    }
    public static void exam5() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "def";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
    public static void exam6() {
        String str1 = "Hello World";
        boolean result = str1.contains("World");
        System.out.println(result);
    }
    public static void exam7() {
        String str = "Hello";
        String newStr = str.replace("l", "p");
        System.out.println(newStr);
    }

    public static void main(String[] args) {
        exam7();
    }
}
