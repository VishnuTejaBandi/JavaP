import java.util.Scanner;

// write a program to get vehicle information:
//     1. Type of vehicle
//     2. Weight of the vehicle
// another class Twowheeler
//     to get weight of the vehicle with default access modifiers
class Vehicle
{
    private int type;
    double weight;
    Vehicle()
    {
        System.out.println("Enter type of vehicle : ");
        Scanner s = new Scanner(System.in);
        this.type = s.nextInt();
        System.out.println("Enter weight of Vehicle : ");
        this.weight = s.nextDouble();
    }
    Vehicle(int type)
    {
        this.type = type;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter weight of Vehicle : ");
        this.weight = s.nextDouble();
        System.out.println(this.type);
    }
}