package java8.lambdaexpression;

public class LambdaExample1
{
	public static void main(String[] args)
    {
        HelloWorld mylambda1= (String s) ->  {return s.toLowerCase();};
        
        HelloWorld mylambda2=  (String s) -> s.toUpperCase();
        
        System.out.println( mylambda1.greet("Hello") );
        System.out.println( mylambda2.greet("World") );
    }
}

interface HelloWorld
{
    public String greet(String welcome);
}