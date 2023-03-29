package chap_03;

public class _02_string2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and",","));//and -> ,로 변환
        System.out.println(s.substring(7));//인덱스 기준 7부터 시작 (이전 내용은 삭제)
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf(".")));//시작 위치부터 끝 위치 직전까지

        //문자열 결함
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 +s2);
        System.out.println(s1+","+s2);
        System.out.println(s1.concat(",").concat(s2));
    }
}
