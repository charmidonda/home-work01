public class calculator_with_multiplication

{

    static int x = 50;
    static int y = 60;
    static int ans;
    static calculator calculator = new calculator();

    static void multiplication (int x, int y)
    {
        ans = x * y ;
        System.out.println("multiply method inside the main method = " + x + " * " +y+" = "+ ans);
    }
    //no parameter with instance method
    static void division (int x, int y)
    {
        ans = y / x ;
        System.out.println("Division method inside the main method = " + x + " / " +y+" = "+ ans);
    }
    public static void main(String[] args)
    {
        multiplication(50,40);
        multiplication(30,10);

    }

}
