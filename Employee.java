import java.util.Scanner;
public class Employee
{
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter salary of Employee");
float basic_pay = sc.nextFloat();
double da = ((12.0/100) * basic_pay) + basic_pay;
double hra = ((13.0/100) * basic_pay) + basic_pay;
double pf = ((15/100) * basic_pay) + basic_pay;
double gross_pay = basic_pay + da+hra;
System.out.println("The Gross Pay is: "+gross_pay);
}
}