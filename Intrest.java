import java.util.Scanner;
class Intrest
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
float p = sc.nextFloat();
float r = sc.nextFloat();
float t = sc.nextFloat();
float SI = (p*t*r)/100;
System.out.println("Simple Interest ="+SI);
}
}