public class Main
{
    public static void main(String[] args)
    {
        int a = 24;
        int b = 48;

        System.out.println(add(a,b));

        System.out.println(minus(a,b));

        System.out.println(multipy(a,b));

        System.out.println(divide(a,b));

    }

    private static int add(int a, int b)
    {
        return a + b;
    }

    private static int minus(int a, int b)
    {
        return a - b;
    }

    private static int multipy(int a , int b){
        return a * b
    }

    private static  int divide (int a , int b){
        return a / b
    }

}
