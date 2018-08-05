import java.util.Scanner;

class Employee
{
    String EmpId;
    String name;
    double BasicPay;
    double Da;
    double Ta;
    double Hra;
    Employee(String EmpId,String name,double BasicPay,double Da,double Ta,double Hra)
    {
        this.EmpId = EmpId;
        this.name = name;
        this.BasicPay = BasicPay;
        this.Da = Da;
        this.Ta = Ta;
        this.Hra = Hra;
    }
    double getGross()
    {
        return (BasicPay+Da+Ta+Hra);
    }
    static void get(Employee one)
    {   
        System.out.print("Enter Name : ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name+" : ");
        System.out.print("Enter EmpId :");
        String EmpId = s.next();
        System.out.print("Enter BasicPay :");
        double BasicPay = s.nextDouble();
        System.out.print("Enter DA :");
        double Da = s.nextDouble();
        System.out.print("Enter Ta :");
        double Ta = s.nextDouble();
        System.out.print("Enter HRA :");
        double Hra = s.nextDouble();
        one = new Employee(EmpId, name, BasicPay, Da, Ta, Hra);
        System.out.println("Gross = "+one.getGross());
    }
}
class Main
{
    
	public static void main(String[] args) 
    {
        Employee [] employees = new Employee[5];
        for (int i = 1;i <= 5;i++)
            Employee.get(employees[i]);
    }
    Double b = 22.3;

}