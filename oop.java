class Calculator
{

    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    }
}


// Class: Calculator
    // method add


public class oop
{
    public static void main(String a[])
    {
        
        //OOP - 
        // Object - Properties and Behaviours
        // class - 

        
        int num1 =4;
        int num2 =10;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        // int result = num1 + num2;

        System.out.println(result);
    }
}