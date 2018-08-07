import java.util.Scanner;

class Acchold
{
    String Name;
    static String BankName = "\"Indian Bank\"";
    long accNo;
    long Bal;
    Acchold(String Name,long accNo)
    {
        this.Name = Name;
        this.accNo = accNo;
    }
    Acchold(String Name,long accNo,long Bal)
    {
        this(Name,accNo);
        this.Bal = Bal;
    }
    static Acchold get()
    {   
        System.out.print("Enter Name : ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name+" : ");
        System.out.print("Enter Account number :");
        long accno = s.nextLong();
        System.out.print("Enter balance :");
        long bal = s.nextLong();
        return new Acchold(name,accno,bal);
    }
    @Override
    public String toString() 
    {
        return(this.BankName+" : \n"+"acc hol name  :"+this.Name+"\nAcc no. : "+this.accNo+"\nBalance : "+this.Bal );
    }
}
class Main
{
    
	public static void main(String[] args) 
    {
        Acchold [] accholds = new Acchold[5];
        for (int i = 0;i < 5;i++)
            accholds[i] = Acchold.get();
        for (int i = 0;i < 5;i++)
            System.out.println(accholds[i]);

    }
}