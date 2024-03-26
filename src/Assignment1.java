public class Assignment1 {
    public static void main(String[] args)
    {
        PositiveNegative(5);
        GreatestOfThree(5, 10, 15);
        TableOfFive();
        CountDigits(12345);

    }

    public static void PositiveNegative(int num)
    {
        if(num>0){
            System.out.println("Number: "+num+" is Positive");
        }
        else if(num<0){
            System.out.println("Number: "+num+" is Negative");
        }
        else{
            System.out.println("Number: "+num+" is Zero");
        }
    }

    public static void GreatestOfThree(int num1, int num2, int num3)
    {
        if(num1>num2 && num1>num3){
            System.out.println("Number: "+num1+" is Greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Number: "+num2+" is Greatest");
        }
        else{
            System.out.println("Number: "+num3+" is Greatest");
        }
    }

    public static void TableOfFive()
    {
        for (int a=1;a<=10;a++){
            System.out.println("5 * "+a+" = "+5*a);
        }

    }

    public static void CountDigits(int num)
    {
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of Digits: "+count);
    }
}
