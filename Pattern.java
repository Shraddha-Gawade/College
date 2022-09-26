import java.util.Scanner;
class Pattern
{
public static void main(String args[])
{
int rows,i,j;
Scanner sc = new Scanner(System.in);
System.out.println("enter the rows:");
rows = sc.nextInt();
for(i=1;i<=rows;i++);
{
for(j=1;j<=i;++j)
{
System.out.print("*");
}
System.out.print("\n");
}
}
}
