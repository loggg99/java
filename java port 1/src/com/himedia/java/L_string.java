package com.himedia.java;

//string : 참조형

import java.sql.SQLOutput;

public class L_string {

    // 1. sharAt(int Index)
    // 셜명 : 문자열에서 특정 위치에 있는 문자(char)를 반환한다.
    // 활용 : 문자열의 각 문자를 순회하거나 특정 위치의 문자를 비료할 떄 유용하낟.
    public static void exam1() {
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
    public static void exam2() {
        String str = "20240826";
        String sub_year = str.substring(0, 4);
        System.out.println(sub_year);
        String sub_month = str.substring(4, 6);
        System.out.println(sub_month);
        String sub_day = str.substring(6, 8);
        System.out.println(sub_day);

        //20240826
        //출력 : 년 월 일을 쪼개서 출력 할것
        // 2024
        // 08
        // 26
    }
    //3. split(String regex)
    //설명 : 주어진 졍규표현식을 기준으로 문자열을 분리하여 배열을 반환한다.
    // 활용: 문자열을 특정 구분자로 분리하여 여러부분으로 나울떄 유용하다.
    public static void exam3() {
        String str = "one, two, three, four";
        String[] strs = str.split(",");
        System.out.println(strs[0]);
        System.out.println(strs[1]);
        System.out.println(strs[2]);
        System.out.println(strs[3]);

        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

    }
    //4. toCharArray()
    //셜명 : 문자열을 문자배열로 반환한다.
    //활용 : 문자열을 배열처럼 다루고 싶을떄 유용하며
    //특히 for-each 문을 통해 문자열의 각 문자를 순회할수 있다.
    public static void exam4() {
        String str = "Hello";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        for (char c : chars) {
            System.out.println(c);
        }
    }
    //5. equals(String anotherString)
    // 설명 : 두 문자열의 값을 비교하여 같으면 true,다르면 false
    //활용 : 문자열 비교에서 자주 사용한다.
    public static void exam5() {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "def";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
    // 6. contains(CharSquence s)
    // 셜명 : 문자열이 특정 문자열을 포함하고 있는지 확인한다.
    // 활용 : 문자열 내 특정 패턴이나 부분 문자열이 존재하는 지 확인할 떄 사용

    public static void exam6() {
        String str = "Hello World";
        boolean result = str.contains("World");
        System.out.println(result);
    }
    //7. replace
    // 설명 : 문자열 내의 특정 문자 또는 문자열을 다른 문자열로 대체
    // 활용 : 문자열 변환 문제나 패턴 치환 문제에서 유용

    public static void exam7() {
        String str = "Hello";
        String newStr = str.replace("l", "p");
        System.out.println(newStr);
    }

    //8. indexOf(String str), lastIndexOf(String str)
    //설명 : 특정 문자열이 처음 또는 마지막으로 나타나는 위치를 반환
    //활용 : 특정 패턴이나 부분 문자열의 위치를 찾을때 사용
    public static void exam8() {
        String str = "Hello";
        int idx = str.indexOf("l");
        System.out.println(idx);
        idx = str.lastIndexOf("l");
        System.out.println(idx);
    }

    //9. StringBuilder, StringBuffer
    // 셜명 : 둘다 가변(mutable)문자열을 다루기위한 클래스
    //전자는 성능우수 후자는 스레드 안전버전
    //활용 : 하반복적인 문자열 수정이 필요한 문제에서 성능을 최적화기위해 사용
    public static void exam9() {
        StringBuilder sd = new StringBuilder();
        sd.append("Hello");
        sd.append(" World");
        String result = sd.toString();
        System.out.println(result);
    }
    //10.reverse()
    //설명 : 문자열을 뒤집는다. String 자체에는 reverse()메서드가 없지만
    // StringBuilder를 사용하여 문자열을 뒤집을수 있다.
    //효과 : 문자열을 뒤집는 문제에서 자주 사용
    public static void exam10() {
        String str = "Hello";
        StringBuilder sd = new StringBuilder(str);
        String reversed = sd.reverse().toString();
        System.out.println(reversed);

        System.out.println(
                new StringBuilder(str).reverse()
        );

    }
    //11. compareTo(String anotherString)
    //설명 : 두문자열을 사전적으로 비교하여
    // 현재 문자열이 더 작으면 음수, 같으면 0 더크면 영수를 반환
    //효과 : 문자열 정렬. 사전 순 비교. 순위 매기기에 유용
    public static void exam11() {
        String str1 = "appple";
        String str2 = "banana";
        int result = str1.compareTo(str2);
        System.out.println(result);
    }
    // 12. toLowerCase()및 toUpperCase

    public static void exam12() {
        String str1 = "Hello World!";
        String lower = str1.toLowerCase();
        String upper = str1.toUpperCase();
    }

    public static void main(String[] args) {
        exam9();

    }
}
