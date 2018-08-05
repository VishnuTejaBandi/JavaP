class Sum extends Thread
{
    Sum()
    {
        this.start();
    }
    @Override
    public void run() 
    {
        for(int i = 0;i<=5;i++)
        {
            String s= Thread.currentThread().getName();
            
            System.out.println(s + "  " + i);
        }
    }
}
class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Sum b = new Sum();
        for(int i = 0;i<=5;i++)
        {
            Thread.sleep(1000);
            // if (i==3)
            //     System.exit(0);
            String s= Thread.currentThread().getName();
            System.out.println(s + "  " + i);
        }
    }
}