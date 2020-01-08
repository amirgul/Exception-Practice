public class CrazyException extends Exception
{
    public CrazyException()
    {
        super("Crazy Exception thrown!");
        System.out.println("Wow Crazy Exception is thrown");
    }

    public CrazyException(String message)
    {
        super(message);
        System.out.println("Wow crazy exception is thrown with an argument");

    }
    public void crazyMethod()
    {
        System.out.println("Message is: " + getMessage());
    }

}
