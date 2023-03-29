package chap_03;

public class _03_stringcompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));//문자열 내용이 같으면 true
        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구별없이 같은지

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // falsev

    }
}
