public class EvenOdd {

    public static void main(String[] args)
    {
        System.out.println("The Number is: "+EvenOdd(10));
        System.out.println("The Larger Number is: "+largerNumber(10,20));
        System.out.println("The Number: "+NestedIfElse(3));
    }

    public static int largerNumber(int a, int b)
    {
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }
    public static String EvenOdd(int a)
    {
        if (a % 2==0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }

    public static String NestedIfElse(int a)
    {
        if (a==1){
            return "a is 1";
        }
        else if (a==2){
            return "a is 2";
        }
        else if (a==3){
            return "a is 3";
        }
        else{
            return "a is not 1, 2, or 3";
        }
    }
}
