package activities;

public class Activity8 extends Exception{
    private String message = null;
    public Activity8(String message)
    {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
    public static void main(String[] args) throws Activity8 {
        try
        {
            Activity8.exceptionTest("Hello World");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("This will not execute");
        }
        catch(Activity8 ex)
        {
            System.out.println("Inside catch block:"+ex.getMessage());
        }
    }
    static void exceptionTest(String msg) throws Activity8 {
        if(msg == null)
            throw new Activity8("Null value");
        else
            System.out.println(msg);

    }
}
