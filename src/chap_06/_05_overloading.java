package chap_06;

public class _05_overloading {
    public static int getpower(int num)
    {
        int result = num*num;
        return result;
    }
    public static int getpower(String strnum)
    {
        int num = Integer.parseInt(strnum);
        return num*num;
    }
    public static int getpower(int num,int exp)
    {
        int result =1;
        for(int i=0;i<exp;i++)
        {
            result*=num;
        }
        return result;
    }
    public static void main(String[] args)
    {
        //메소드 오버로딩
        System.out.println(getpower(3));
        System.out.println(getpower("4"));
        System.out.println(getpower(3,3));
    }
}
