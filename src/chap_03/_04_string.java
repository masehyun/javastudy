package chap_03;

public class _04_string {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0,8)); // 0위치부터 8위치 직전까지 출력
        System.out.println(id.substring(0,id.indexOf("-")+2));
    }
}
