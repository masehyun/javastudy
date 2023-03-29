package chap_03;

import java.sql.SQLOutput;

public class _01_string {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);
        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //포함관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("c#")); // 포함되지 않는다면 false

        //포함된 문자열 위치찾기
        System.out.println(s.indexOf("Java"));
        System.out.println(s.indexOf("c#")); // 포함되지 않는다면 -1반환
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
        System.out.println(s.endsWith("C."));//이 문자열로 끝나면 true

    }
}
