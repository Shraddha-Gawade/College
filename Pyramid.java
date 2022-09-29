import java.util.Scanner;
public class Pyramid
{
public static void main(String[] args)
{
int k,p;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number to be printed:");
int a=s.nextInt();
System.out.println("max number of times to be printed");
int n=s.nextInt();
for(k=1;k<=n;k++)
{
for(p=1;p<k;p++)
{
System.out.print(a+"");
}
System.out.println();
}
for(k=0;k<=n;k++)
{
for(p=n;p>k;p--)
{
System.out.print(a+"");
}
System.out.println();
}
}
}
