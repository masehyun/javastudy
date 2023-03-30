package chap_06;

public class _02_parameter {
    public static void power(int a){
        System.out.println(a*a);
    }
    public static void powerby(int num,int exp){
        int result =1;
        for(int i=0;i<exp;i++)
        {
            result *=num;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        // 전달값, parameter
        int b =2;
        power(b);
        powerby(2,3);
    }
}
