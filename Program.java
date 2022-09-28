import java.util.*;
class Program
{
public static void main(String args[])
{
int table,times,i,result;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the table:");
table = sc.nextInt();
System.out.println("Enter the times:");
times = sc.nextInt();
System.out.println("The output is:");
for(i=1;i<times;i++)
{
result = table*i;
System.out.println(" "+result);
}
}
}
